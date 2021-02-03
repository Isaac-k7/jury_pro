FROM maven:3.6.3-jdk-11

# Add Maintainer Info
LABEL maintainer="isaac07.ik@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/jury_pro-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} jury_pro-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom","-jar","jury_pro-0.0.1-SNAPSHOT.jar"]