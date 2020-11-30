# bank-transf
API REST transactions with Swagger-ui. 

## About
    The idea was to build some basic account and transactions endpoints. The documentation of API is published.
    https://bank-transf.herokuapp.com/swagger-ui.html

### Technologies
    Java -> Spring Boot
    Folder **bank-trasnf api/**  -> http://localhost:8080//swagger-ui.html#/
    http://SERVER_IP:SERVER_PORT/swagger-ui/index.html
 
```bash
    $ mvn spring-boot:run
``` 

It was made using 
    **Spring Boot**, **Spring Security**, **Spring Data**, **Mongo DB** and **Docker**. 
Database is NoSQL **MongoDB** or postgres.

#### Using Executable Jar create an executable jar run:
```bash
$ mvn clean package
``` 

Run Docker container:
```bash
$ docker-compose up
-------------------------------------------------------------------------------------
bank-transf           /bin/sh -c exec java -jar  ...   Up      0.0.0.0:8080->8080/tcp
bank-mongodb          docker-entrypoint.sh mongo ...   Up      0.0.0.0:27017->27017/tcp

```
To run that application, use the java -jar command, as follows:
```bash
$ java -jar target\bank-transf-0.0.1-SNAPSHOT.jar
```

### Docker (API)

Build Docker image:
```bash
$ mvn clean package -Pdocker -DskipTests=true
$ docker-compose build
```