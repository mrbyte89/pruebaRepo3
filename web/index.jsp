<%-- 
    Document   : index
    Created on : 12-dic-2012, 16:24:17
    Author     : al036353
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="servlet" method="POST">
            <input type="text" name="user" />  
            <input type="password" name="pass" />
            <input type="hidden" name="accion" value="login" />
            <input type="submit" value="Enviar" name="enviar" />
        </form>
        <h1>Hello World!</h1>
    </body>
</html>
