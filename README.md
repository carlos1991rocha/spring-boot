# spring-boot

## Create docker network

``` bash
docker network create spring-boot
```

## Run MySQL

``` bash
docker run --name mysql -e MYSQL_ROOT_PASSWORD=root -d -p 3306:3306 --hostname mysql --network spring-boot -v mysql:/var/lib/mysql mysql
```

### Create database

``` bash
docker exec -ti mysql mysql --password
# put root password
mysql> create database spring_boot;
```

## Build docker image

From folder `~/Repository/spring-boot`, run:

``` bash
./gradlew build
docker build -t carlos1991rocha/spring-boot .
```

## Run docker image

``` bash
docker run --name spring-boot --network spring-boot -e MYSQL_HOST=mysql -d -p 8080:8080 carlos1991rocha/spring-boot
```

## Upload container

``` bash
docker push carlos1991rocha/spring-boot
```
