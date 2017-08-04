##############################################################
# Dockerfile de eImpuestos para crear imagen de la aplicación
# >docker build . -t eimpuestos_dock
# (El . del comando anterior es para indicarle la ubicacion
#  de este archivo Dockfile)
# Para ver las imagenes que tengo creadas correr 
# >docker images ls
# Para correr la imagen en un contenedor.
# >docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=password" -e "MSSQL_PID=Developer" --cap-add SYS_PTRACE -p 8085:8080 -p 8086:1433 -v aplicacionWeb:/opt/app/aplicacionWeb  -it eimpuestos_dock /bin/bash
# IMPORTANTE: 
#   -> (En Windows) Para que se pueda mapear el directorio del host, es necesario que el proyecto en el host se trabaje dentro
#      del directorio Users de windows.
##############################################################

FROM scratch
FROM java:8u111-jdk 
FROM maven:3.5.0-jdk-8
FROM microsoft/mssql-server-linux
COPY ./aplicacionWeb /opt/app/aplicacionWeb
EXPOSE 8080
EXPOSE 1433
MAINTAINER Nicolas Ard <nicolas.ard@gmail.com>