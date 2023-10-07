<%-- 
    Document   : funcionario_cons_id.jsp
    Created on : 23/08/2023, 21:06:22
    Author     : alunos
--%>

<%@page import="model.dao.FuncionarioDAO"%>
<%@page import="model.Funcionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica [Funcionário]</title>
    </head>
    <body>
        <h1>Clínica - Consulta Funcionário</h1>
        
        <%
        String matric = request.getParameter("matric");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setMatric(matric);
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        if (funcionarioDAO.consultarMatric(funcionario) != null){
            out.println("<br> Funcionario:");
            out.println("<br>Matric:" + funcionario.getMatric());
            out.println("<br>Nome:" + funcionario.getNome());
            out.println("<br>Cargo:" + funcionario.getCargo());
            out.println("<br>CEP:" + funcionario.getEnderecoCep());
            out.println("<br>Complemento:" + funcionario.getEnderecoComp());
        }else{
            out.println("<br> <b>Funcionario não encontrado! <b>");
        }       
        
        %>
        
    </body>
</html>
