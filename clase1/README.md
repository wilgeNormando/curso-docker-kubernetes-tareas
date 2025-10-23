
1. **Nombre de la aplicación** - MySQL (base de datos relacional)

2. **Comandos ejecutados** - Para la ejecucion del contenedor MySql se ejecutaron los siguientes comando:
   - Comando para crear y levantar el contenedor MySql en el puerto 3306 y con password
     ```{bash, engine.opts='-l'}
        docker run --name mi-mysql -e MYSQL_ROOT_PASSWORD=mi-password-seguro -p 3306:3306 -d mysql
     ```
   - Comandos de verificación
     ```{bash, engine.opts='-l'}
        docker ps -a
     ```
   - Comandos de limpieza
     ```{bash, engine.opts='-l'}
        docker stop mi-mysql
        docker rm mi-mysql
     ```
3. **Explicación breve** - Acontinuacion se detalla brevemente los comandos utilizados para la resolucion de la tarea solicitada

| Componente   | Descripción                                                                 |
| :----- | :---------------------------------------------------------------------- |
| `docker run`  | Crea y ejecuta un contenedor                               |
| `-d`    |  Ejecuta el contenedor en modo "detached" o "desacoplado", es decir, se ejecuta en segundo plano                         |
| `-p 3306:3306` | Mapea el puerto 3306 de la máquina local al puerto 3306 del contenedor. Este es el puerto predeterminado de MySQL. |
|`-e MYSQL_ROOT_PASSWORD=tu_contraseña_segura`| Esta es una variable de entorno que establece la contraseña para el usuario root de MySQL|
|`--name mi-mysql`| Asigna el nombre al contenedor para que sea más fácil de identificar y gestionar|
|`mysql`| Especifica la imagen de Docker a utilizar|



4. **Evidencia:**
   - Screenshot de `docker ps` mostrando el container corriendo
     ![Container corriendo](screenshots/docker_ps.png)
   - Screenshot salida de `docker logs` de mysql
     ![log de mysql](screenshots/docker_log.png)
   - Screenshot conexion a mysql desde Dbeaver
     ![consumo desde un cliente](screenshots/dbeaver_ejecucion.png)
   - Screenshot o salida mostrando que el container fue eliminado correctamente
     ![detener el contenedor mysql](screenshots/docker_stop.png)
     ![eliminar el contenedor mysql](screenshots/docker_rm.png)

5. **Conclusiones**

    Aprendí a ejecutar containers en segundo plano, mapear puertos y pasar variable de entorno.<br>
    Tuve una dificultad al conectarme al servidor de mysql desde el cliente dbeaver el error que me arrojaba era                  `allowPublicKeyRetrieval` lo solucione ingresando a `Driver Property` busque la clave `allowPublicKeyRetrieval` y cambie      el valor de `False` a `True` una vez cambiado el valor pude conectarme desde el cliente DBeaver.



