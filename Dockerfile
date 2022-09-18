FROM openjdk:8-jdk-alpine
FROM maven:3.6.3 AS maven
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN mvn package
VOLUME /tmp
ARG JAR_FILE=demoapp-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
ENV JAVA_OPTS=$JAVA_OPTS
COPY COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/
ENTRYPOINT exec java $JAVA_OPTS -jar demoapp1.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar demoapp1.jar