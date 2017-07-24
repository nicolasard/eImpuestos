##############################################################
# Dockerfile de eImpuestos para crear imagen de la aplicación
# >docker build . -t eimpuestos_dock
# (El . del comando anterior es para indicarle la ubicacion
#  de este archivo Dockfile)
##############################################################
FROM java:8u111-jdk 
FROM maven:3.5.0-jdk-8
COPY ./aplicacionWeb /opt/app/aplicacionWeb
EXPOSE 8080
WORKDIR /opt/app/aplicacionWeb
RUN mvn package
RUN mvn spring-boot:run
MAINTAINER Nicolas Ard <nicolas.ard@gmail.com>