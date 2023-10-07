<%-- 
    Document   : login
    Created on : 16/08/2023, 21:13:28
    Author     : alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.*" import="java.lang.*" %>
<%@page import="model.Usuario"%>
<%@page import="control.ControleUsuario"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica - Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <%
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            ControleUsuario controleUsuario = new ControleUsuario();
            if (controleUsuario.logar(login, senha)){
                //out.println("Acesso Permitido");
        %>
                <script> window.location.href='menu.html'; </script>
        <%
            }else{
                out.println("Acesso NEGADO!!!");
            }
        %>
    </body>
</html>
