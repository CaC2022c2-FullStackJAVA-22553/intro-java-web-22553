<%-- 
    Document   : saludo
    Created on : 29 nov 2022, 14:49:15
    Author     : Charly Cimino
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludando...</title>
    </head>
    <body>
        <h1>Hola ${param.fname}</h1>
        <p>Vos tenés ${ requestScope.laEdadDelUsuario } años<p>
        <p>2 + 2 es ${ 2+2 }</p>
    </body>
</html>
