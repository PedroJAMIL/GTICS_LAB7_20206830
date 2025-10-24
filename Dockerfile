# Build
FROM  openjdk:26-ea-17-jdk-oracle
VOLUME /tmp
EXPOSE 8080
ADD C:/Users/Labtel/Downloads/Lab07/target/Lab07-0.0.1-SNAPSHOT.war Lab07.war
ENTRYPOINT ["java", "-jar", "Lab07.war"]
