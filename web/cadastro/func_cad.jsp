<%-- 
    Author : 
--%>

<%@page import="model.dao.FuncionarioDAO"%>
<%@page import="model.Funcionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Academia [Funcionário]</title>
    </head>
    <body>
        <h1>StrongDuck - Cadastro Funcionário</h1>
        
        <%
        
        String nome = request.getParameter("nome");
        String cargo = request.getParameter("cargo");
        String Endereco = request.getParameter("endereco");
        String end_comp = request.getParameter("end_comp");
        String salario = request.getParameter("salario");
        float idadeFloat = Float.parseFloat(salario);
        
        Funcionario funcionario = new Funcionario();
      
        funcionario.setNome(nome);
        funcionario.setCargo(cargo);
        funcionario.setSalario(salario);
        
      
   
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        if (funcionarioDAO.cadastrar(funcionario) == true){
            out.println("<br> Funcionario cadastrado com sucesso!");
        }else{
            out.println("<br> <b>Funcionario não cadastrado! <b>");
        }       
        
        %>
        
    </body>
</html>
