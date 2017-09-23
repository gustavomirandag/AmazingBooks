<%-- 
    Document   : login
    Created on : Sep 18, 2017, 6:22:53 PM
    Author     : gustavomg
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administração AmazingBooks</title>
    </head>
    <body>
        <h1>Cadastro de Pessoa</h1>
        
        <form action="login" method="POST">
            Nome: <input type="text" name="nome"/><br><br>
            Email: <input type="text" name="email"/><br><br>
            Senha: <input type="password" name="senha"/><br><br>
            <input type="submit" value="Entrar"/>
        </form>
    </body>
</html>


