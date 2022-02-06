FROM adoptopenjdk/openjdk11:alpine-jre

#Moving project from target to /opt folder
ADD target/spring-boot-java11-0.0.1-SNAPSHOT.jar /opt/spring-boot-java11-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "/opt/spring-boot-java11-0.0.1-SNAPSHOT.jar"]
CMD ["--spring.profiles.active=prod"]
