FROM openjdk:8

COPY build/libs/*.jar /opt/app.jar

CMD [ "java", "-jar", "/opt/app.jar" ]