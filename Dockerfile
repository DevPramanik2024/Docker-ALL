
FROM openjdk:17

COPY target/Devjar.jar Dockerjar.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Dockerjar.jar"]
