# Build stage
FROM maven:3.9.6-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /target/sanchit-rehab-0.0.1-SNAPSHOT.jar app.jar

# Workaround for user's "start" or "run" command in Render settings
# We create scripts named 'start' and 'run' so they execute the app instead of failing
RUN echo '#!/bin/bash\njava -jar /app.jar' > /usr/local/bin/start && \
    chmod +x /usr/local/bin/start && \
    echo '#!/bin/bash\njava -jar /app.jar' > /usr/local/bin/run && \
    chmod +x /usr/local/bin/run

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
