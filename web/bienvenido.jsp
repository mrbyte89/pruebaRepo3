<%-- 
    Document   : bienvenido
    Created on : 12-dic-2012, 16:58:21
    Author     : vesprada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession sesion = request.getSession();
    //si no se inicia sesión, redirecciona al index
   sesion.getAttribute("nombre");
   
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola, <%=sesion.getAttribute("nombre")%></h1>
       <a href="/pruebaRepositorio3/agenda.jsp">Agenda</a>
       <br />
       <a href="/pruebaRepositorio/multiplicar.jsp">Multiplicar</a>
    </body>
</html>
