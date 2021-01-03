FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} constellation-service.jar
ENTRYPOINT ["java","-jar","/constellation-service.jar"]