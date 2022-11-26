FROM openjdk:11-jre-slim
VOLUME /tmp
ADD target/dockerapi*.jar /app.jar
CMD ["java" , "-jar","/app.jar"]