FROM openjdk:11 AS javabuilder
#
#COPY gradlew .
#COPY gradle gradle
#COPY build.gradle .
#COPY settings.gradle .
#COPY src src
#RUN chmod +x ./gradlew
#RUN ./gradlew bootJar
#
#FROM openjdk:11
#COPY --from=javabuilder build/libs/*.jar app.jar
#
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "/app.jar"]

# from velog
#FROM openjdk:8-jre-alpine

COPY /build/libs/*.jar app.jar

CMD ["java", "-jar", "/app.jar"]

#asdfaasdfasdf