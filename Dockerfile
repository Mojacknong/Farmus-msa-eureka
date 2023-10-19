FROM openjdk:11-jdk
VOLUME /tmp
ARG JAR_FILE=build/libs/farmus-eureka-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} farmus-eureka.jar

ENTRYPOINT ["java","-jar","/farmus-eureka.jar"]