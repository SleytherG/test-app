FROM openjdk:17.0.2

WORKDIR /app
#
#COPY ./.mvn ./.mvn
#COPY ./mvnw /app
#COPY ./pom.xml /app

RUN #./mvnw clean package -DskipTests

COPY ./target/springboot-web-0.0.1-SNAPSHOT.jar .

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "springboot-web-0.0.1-SNAPSHOT.jar"]