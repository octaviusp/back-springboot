Back-end para TP de Diseño de Sistemas basado en Spring Boot (Java)

La base de datos está dockerizada. Para usarla hay que correr el comando:
> docker pull cherckyto/dds-mysql:1.0

Y queda la base de datos lista en la máquina. En el directorio /db se encuentran los archivos para dockerizar la base de datos si no se desea utilizar la imagen subida al hub de docker.

Para realizar las pruebas con Postman se puede importar la [**colección desde la API de Postman**](https://api.postman.com/collections/20514890-45828dad-0641-4ef3-b193-feab34af627b?access_key=PMAT-01H17JE3Y35ZMPGFTXFMM2JQE0) para este ejercicio.

Para iniciar el proyecto desde cero se utilizó: [**Spring Initializr**](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.1.0&packaging=jar&jvmVersion=17&groupId=org.utn.frd&artifactId=dds&name=dds&description=Backend%20DDS&packageName=org.utn.frd.dds&dependencies=mysql,web,data-jpa,data-jpa)

El proyecto contiene un dockerfile que permite dockerizar la aplicación.
