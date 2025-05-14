
FROM openjdk:17-jdk-alpine
LABEL maintainer ="naveen.net"
ADD target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]