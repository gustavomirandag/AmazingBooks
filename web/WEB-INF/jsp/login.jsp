<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login AmazingBooks</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${empty status}">
                Digite usuário e senha para continuar...
            </c:when>
            <c:otherwise>
                ${status}
            </c:otherwise>
        </c:choose>
        <h1>Login</h1>
        
        <form action="login" method="POST">
            Email: <input type="text" name="email"/><br><br>
            Senha: <input type="password" name="senha"/><br><br>
            <input type="submit" value="Entrar"/>
        </form>
    </body>
</html>


