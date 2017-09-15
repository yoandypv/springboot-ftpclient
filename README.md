# springboot-ftpclient
Ejemplo de @Service para la conexión, carga y descarga de archivos desde un servidor FTP usando Spring Boot.

Este proyecto implementa un @Service Spring Boot que posibilita y brinda un API sencillo para que pueda ser reusado por otros desarrolladores para la conexión a servidores que implementen el protocolo FTP. Ofrece un API de 4 métodos principales: 

* connectToFTP(String host, String user, String pass)
* uploadFileToFTP(File file, String ftpHostDir , String serverFilename) 
* downloadFileFromFTP(String ftpRelativePath, String copytoPath) 
* void disconnectFTP()

Los nombres de los métodos un intuitivos, para usar en sus proyecto solo basta con inyectar la interfaz FTPService, vea el MainController de ejemplo en el código.

Si te gusta este proyecto, regalame una estrella.
