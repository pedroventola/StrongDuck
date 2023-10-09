

<%@page import="java.text.SimpleDateFormat"%>
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
        <h1>StrongDuck - Alterar Funcionário</h1>
        
        <%
        String nome = request.getParameter("nome");
        String cargo = request.getParameter("cargo");
        String cep = request.getParameter("cep");
        String salario = request.getParameter("salario");
        float salarioFloat = Float.parseFloat(salario);
        String dataContrato = request.getParameter("dataContrato");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String cpf = request.getParameter("cpf");
         
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setCargo(cargo);
        funcionario.setCep(cep);
        funcionario.setSalario(salarioFloat);
        funcionario.setDataContrato(dateFormat.parse(dataContrato));
        funcionario.setCpf(cpf);
        out.println(cep);
     
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        if (funcionarioDAO.alterar(funcionario) == true){
            out.println("<br> Funcionario Alterado com sucesso!");
        }else{
            out.println("<br> <b>Funcionario não Alterado! <b>");
        }       
        
        %>
        
    </body>
</html>
