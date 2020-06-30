FROM openjdk:8-jdk-alpine
EXPOSE 8080
MAINTAINER ruslan
WORKDIR /app
ARG DEP_REP=target/dependency
COPY $DEP_REP/BOOT-INF/lib lib
COPY $DEP_REP/META-INF META-INF
COPY $DEP_REP/BOOT-INF/classes .
CMD ["java", "-cp", ".:lib/*", "com.ruslanshakirov.resthelloworld.RestHelloWorldApplication"]
