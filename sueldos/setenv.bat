@ECHO OFF
echo SETEANDO VARIABLES DE ENTORNO JAVA Y TOMCAT

SET JAVA_HOME=C:\Program Files\Java\jdk1.8.0_161
SET JRE_HOME=C:\Program Files\Java\jdk1.8.0_161

:: SET ANT_HOME=C:\Users\Nico\Desktop\ORDENAR\eclipse\apache-ant-1.9.6
SET MAVEN_HOME=D:\tools\apache-maven-3.5.2-bin\apache-maven-3.5.2

:: Cosas de catalina tomcat
:: SET CATALINA_HOME=C:\Users\Nico\Desktop\ORDENAR\eclipse\apache-tomcat-7.0.64
:: SET CATALINA_BASE=C:\Users\Nico\workspace\WORK\GireAPI
:: SET CATALINA_TMPDIR=C:\Users\Nico\workspace\WORK\GireAPI

:: Set Path variable
SET PATH=%Path%;%MAVEN_HOME%\bin;%ANT_HOME%\bin;%JAVA_HOME%\bin;%CATALINA_HOME%;%CATALINA_BASE%

SET APP_HOME=D:\gitRepos\sueldos

SET CLASSPATH=%CLASSPATH%;%APP_HOME%/target/dependency/*
SET CLASSPATH=%CLASSPATH%;%APP_HOME%/target/*
SET CLASSPATH=%CLASSPATH%;%APP_HOME%/target/MVC_Example2-0.1.0.jar
SET CLASSPATH=%CLASSPATH%;%APP_HOME%
