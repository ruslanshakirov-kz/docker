FROM openjdk:8-jdk-alpine
EXPOSE 8080
MAINTAINER ruslan
WORKDIR /app
COPY target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
