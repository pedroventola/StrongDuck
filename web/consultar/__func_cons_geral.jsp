<%-- 
    Document   : funcionario_cons_id.jsp
    Created on : 23/08/2023, 21:06:22
    Author     : alunos
--%>

<%@page import="model.dao.FuncionarioDAO"%>
<%@page import="model.Funcionario"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica [Funcionário]</title>
    </head>
    <body>
        <h1>Clínica - Funcionário Consulta Geral</h1>
        
        <%      
              
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        if (funcionarioDAO.consultarGeral() != null){                   
            out.println("<br> Funcionario:");
            ResultSet result = funcionarioDAO.consultarGeral();
            int n_reg = 0;
           while (result.next()){
                // "popular o obj funcionario"
                out.println("<br><br>Matric:" + result.getString("matric"));
                out.println("<br>Nome:" + result.getString("nome"));
                out.println("<br>Cargo:" +result.getString("cargo"));
                out.println("<br>CEP:" + result.getString("end_cep"));
                out.println("<br>Complemento:" +result.getString("end_comp"));
                n_reg++;
            }        
        }else{
            out.println("<br> <b>Funcionario não encontrado! <b>");
        }       
        
        %>
        
    </body>
</html>
