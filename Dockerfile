FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD voter/target/voter-0.0.1-SNAPSHOT.jar voter-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "voter-0.0.1-SNAPSHOT.jar"]
