<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem Vindo a AmazingBooks</title>
    </head>
    <body>
        <h1>Lista de Produtos</h1>
        <c:choose>
            <c:when test="${empty email}">
                <a href="login">Registrar</a>
            </c:when>
            <c:otherwise>
                Bem vindo ${email}
            </c:otherwise>
        </c:choose>        
    </body>
</html>
