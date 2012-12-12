<%-- 
    Document   : multiplicar
    Created on : 12-dic-2012, 16:44:17
    Author     : vesprada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form name="tablas" action="/pruebaRepositorio3/servlet" method="POST">
           Numero: <input type="text" name="numero" size="100" />
           <input type="submit" value="Enviar" name="enviar" />
           <input type="hidden" name="accion" value="tablas" />
       </form>
    </body>
</html>
