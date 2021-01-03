FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} satellite-service.jar
ENTRYPOINT ["java","-jar","/satellite-service.jar"]