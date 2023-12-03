FROM openjdk:17-jdk-alpine3.14
MAINTAINER Ramkumar
COPY target/ivr-ivc3-0.0.1.jar ivr-ivc3-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/ivr-ivc3-0.0.1.jar"]