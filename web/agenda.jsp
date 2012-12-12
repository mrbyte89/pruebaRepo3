<%-- 
    Document   : agenda
    Created on : 12-dic-2012, 16:43:56
    Author     : vesprada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multiplicar</title>
    </head>
    <body>
        <form name="agenda" action="/pruebaRepositorio3/servlet" method="POST">
            Nombre: <input type="text" name="nombre" size="100" />
            <input type="submit" value="Enviar" name="enviar" />
           <input type="hidden" name="accion" value="nombre" />      
        
        </form>
    </body>
</html>
