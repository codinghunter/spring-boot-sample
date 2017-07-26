FROM java:openjdk-8-jre-alpine
COPY demo-web/target/demo-web-1.0.0-SNAPSHOT.jar application.jar
EXPOSE 8080
CMD ["java", "-jar", "application.jar"]