FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} api-gateawy.jar
ENTRYPOINT ["java","-jar","/api-gateawy.jar"]