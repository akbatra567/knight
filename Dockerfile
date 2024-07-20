FROM eclipse-temurin:21

COPY target/knight-0.0.1.jar knight-0.0.1.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/knight-0.0.1.jar"]