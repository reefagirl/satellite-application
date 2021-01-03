FROM openjdk:8
VOLUME /tmp
ADD target/*.jar service-registry.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","/service-registry.jar"]