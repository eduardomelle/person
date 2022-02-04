FROM openjdk:11

ADD target/person-0.0.1-SNAPSHOT.jar person.jar

ENTRYPOINT ["java","-jar","person.jar"]

EXPOSE 8081
