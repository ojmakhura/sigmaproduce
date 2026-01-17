# Dockerfile for Native Image
FROM eclipse-temurin:21-jre-jammy

RUN mkdir -p /app
WORKDIR /app

ARG WAR_FILE=webservice/target/sigmaproduce-webservice*.jar
COPY ${WAR_FILE} sigmaproduce-webservice.jar
COPY kyc_start.sh kyc_start.sh

ENTRYPOINT ["sh", "/app/sigma_start.sh"]