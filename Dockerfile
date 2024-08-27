FROM maven:3.8.7 as build
COPY . .
RUN mvn -B clean package -Dskiptests

FROM openjdk:17

COPY --from=build target/*.jar filename.jar

ENTRYPOINT ["java", "-jar", "-Dserver.port=8080", "devops-class.jar"]