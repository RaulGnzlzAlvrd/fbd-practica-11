Requisitos de la aplicacion
1-Java JDK  1.8  https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2-Maven 3.3.9    https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.3.9/
3-SQL Server
4-IntelliJ IDE   https://www.jetbrains.com/idea/
5-PostMan        https://www.getpostman.com/

Instrucciones
1-Agregar proyecto a IntelliJ:
Import pom.xml
2-Crear build con maven
Maven project -> industria-musical -> Lifecycle -> install
3-Ejecutar aplicación
Project -> industriamusical->src->main->java->industria->Application.java click derecho Run

Descripcion de carpetas:
industriamusical
  |
  |
  |--src    (contenido de el proyecto)
  |   |
  |   |--main
  |   |     |--java
  |   |           |
  |   |           |--industria
  |   |           |     |
  |   |           |     |--config (configuraion para conectar a la base de datos)
  |   |           |     |--model  (Clases para mapear los datos de la base de datos, tablas y columnas)
  |   |           |     |--resources (Clases para acceder a la base de datos)
  |   |           |     |--repository (Clases para crear los End Points que se van a exponer en el servicio)
  |   |           |     |--Application.java (Clase principal de la aplicacion)
  |   |           |
  |   |           |--resources
  |   |                 |
  |   |                 |--application.properties (propiedades para realizar la conexión a la base de datos)
  |   |                 |--application.queries.properties (queries para ejecutar a la base de datos)
  |   |
  |   |--test (pruebas unitarias del proyecto, investigar JUnit para saber que son las pruebas unitarias)
  |
  |--pom.xml (definición de biliotecas que ocupará el proyecto)
