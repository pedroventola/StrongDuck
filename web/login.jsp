<%-- 
      Author  : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.*" import="java.lang.*" %>
<%@page import="model.Admin"%>
<%@page import="control.ControleAdmin"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>StrongDuck - Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <%
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            ControleAdmin controleAdmin = new ControleAdmin();
            if (controleAdmin.logar(login, senha)){
        %>
                <script> window.location.href='menu.html'; </script>
        <%
            }else{
                out.println("Acesso NEGADO!!!");
            }
        %>
    </body>
</html>
