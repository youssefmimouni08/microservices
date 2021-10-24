FROM  openjdk:15
EXPOSE 8089
ADD /target/Candidat-0.0.1-SNAPSHOT.jar Candidat-docker.jar
ENTRYPOINT ["java","-jar", "Candidat-docker.jar"]