
FROM openjdk:17-jdk-alpine
LABEL maintainer ="naveen.net"
ADD target/user-service-0.0.1-SNAPSHOT.jar user-service.jar
ENTRYPOINT ["java", "-jar", "user-service.jar"]