FROM ubuntu:latest as builder

RUN apt-get update
RUN apt-get install openjdk-17-jdk maven -y

COPY . .

RUN mvn clean install

FROM openjdk:17-jdk-slim

COPY --from=builder /target/todolist-1.0.0.jar ./app.jar

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]