FROM openjdk:8-jre-alpine

LABEL maintainer="lars.thielmann@gmail.com"

RUN addgroup -S springboot && adduser -S -g springboot springboot
WORKDIR /app

COPY bin/entrypoint.sh .
COPY build/libs/*.jar .

RUN chown -R springboot:springboot .
RUN chmod 0500 entrypoint.sh && chmod 0400 *.jar

USER springboot

EXPOSE 8080

ENTRYPOINT ["/app/entrypoint.sh"]
CMD ["-server", "-Dserver.tomcat.port=8080"]