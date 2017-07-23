echo "SETEANDO VARIABLES DE ENTORNO JAVA Y TOMCAT"

## Modificar aca los paths de las dependencias

JAVA_HOME=/cygdrive/c/e/tools/java/jdk1.7.0_67
JRE_HOME=/cygdrive/c/e/tools/java/jdk1.7.0_67
MAVEN_HOME=/cygdrive/c/e/tools/apache-maven-3.3.9-bin/apache-maven-3.3.9

##########################################################

export JRE_HOME
export JAVA_HOME
export MAVEN_HOME

export PATH=$JAVA_HOME/bin:$JRE_HOME/bin:$MAVEN_HOME/bin:$PATH
