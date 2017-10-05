# Spring Boot 2 with Docker

Demo application for Spring Boot 2 with Docker integration.

## Getting started

Via Gradle plugin
```bash
./gradlew build docker
```

Alternatively with docker-cli
```bash
./gradlew clean build
docker build -t "lth/reactive-demo-service:latest" -t "lth/reactive-demo-service:0.2" .
docker run -d --name reactive -p 8080:8080 "lth/reactive-demo-service:0.2"
```

## Authors

* **Lars Thielmann**