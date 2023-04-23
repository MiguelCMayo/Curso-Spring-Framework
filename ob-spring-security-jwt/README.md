## Configuracion Heuroku

1. Crear otro fichero system.properties especificando la version de java en la carpeta raiz
2. Subir proyecto a github
3. Conectar con Heruku para realizar despliegue
4. Añadir AddOn de PostgreSQL en Heroku
    - Introducir el repositorio como new app
    - En Resources añadir Heroku PostgreSQL
    - Pinchamos en Heroku PosgreSQL
    - Settings -> View Credentials
        - Copiar host y pegarlo en application.properties
          spring.datasource.url=jdbc:postgresql://   ec2-52-212-228-71.eu-west-1.compute.amazonaws.com    :5432/d1c2r62fpkdk34
        - Copiar database y pegarla
          spring.datasource.url=jdbc:postgresql://ec2-52-212-228-71.eu-west-1.compute.amazonaws.com:5432/    deofouutscpm09
        - Copiar Usename y pegar
          spring.datasource.username=taotnhtaxukadt\
        - Copiar passaword y pegar
          spring.datasource.password=78d8942367e3d49169e560b1243cb6a77ee8f23fdf56fd61bd08e3fd42e35ee7
5. Hacer commit and push
6. En Heroku vamos a Setting -> Hide Config Vars
    - key=HOST, value=ec2-52-212-228-71.eu-west-1.compute.amazonaws.com
    - key=DATABASE, value=deofouutsctaotnhtaxukadtpm09
    - key=DB-USER, VALUE=taotnhtaxukadt
    - key=DB-PASSWORD, value=78d8942367e3d49169e560b1243cb6a77ee8f23fdf56fd61bd08e3fd42e35ee7
7. En application.properties cambiamos las variables de entorno (poner entre llaves y con $ delante
   spring.datasource.url=jdbc:postgresql://${HOST}:5432/${DATABASE}
   spring.datasource.username=${DB-USER}
   spring.datasource.password=${DB-PASSWORD}
8. Commit and push
9. Deploy en Heroku
10. Open app y copiamos url para pegarla en un post-register de Postman: https://ob-spring-security-jwt-miguel.herokuapp.com/api/auth/register
11. Hacemos un post-login para que salga el token
12. Hacemos un get-api/cars poniendo el token y nos da la base de datos de coches que esta gusrdada en la red

CONEXION CON LA BASE DE DATOS

1. En DBVeaber nueva conexion con PostgreSQL
2. Introducimos los datos de heroku y probamos conexion

## Fronted: Vercel

1. Subir proyecto a GitHub
2. Ajustar URL al backed
3. Subir a Vercel