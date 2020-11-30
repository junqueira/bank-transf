FROM openjdk:8u151-jdk-alpine3.7

EXPOSE 8080

RUN mkdir -p /usr/src/app

ENV APP_HOME /usr/src/app

COPY target/api-rest-0.0.1-SNAPSHOT.jar $APP_HOME/app.jar

WORKDIR $APP_HOME

ENTRYPOINT exec java -jar app.jar