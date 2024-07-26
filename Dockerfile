FROM openjdk:22-jdk-slim
WORKDIR /app
COPY target/pringBootCicDpipeLine-01.jar pringBootCicDpipeLine-01.jar
EXPOSE 8080
CMD ["java" -jar SpringBootCicDpipeLine-01.jar]