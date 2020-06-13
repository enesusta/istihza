FROM registry.access.redhat.com/ubi8/ubi-minimal:8.1

MAINTAINER Enes Usta <enesusta@email.com>

WORKDIR /work/

COPY --chown=1001:root target/*-runner /work/application

EXPOSE 8080

USER 1001

CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]