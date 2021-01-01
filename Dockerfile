
FROM maven:3.6.3-openjdk-11 as build-env

RUN git clone https://github.com/Yosshii001/ecs-springboot-back-end.git /var/local/ecs-springboot-back-end

RUN mvn install -DskipTests=true -f /var/local/ecs-springboot-back-end/pom.xml

FROM openjdk:11.0.9.1-jre
COPY --from=build-env \
 /var/local/ecs-springboot-back-end/target/ecs-springboot-back-end-0.0.1-SNAPSHOT.jar \
 /var/local/ecs-springboot-back-end/ecs-springboot-back-end-0.0.1-SNAPSHOT.jar

MAINTAINER junichi02
EXPOSE 80

CMD java -jar -Dspring.profiles.active=prod \
 /var/local/ecs-springboot-back-end/ecs-springboot-back-end-0.0.1-SNAPSHOT.jar
