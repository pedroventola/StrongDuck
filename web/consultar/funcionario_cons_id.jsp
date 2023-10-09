
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
        <h1>StrongDuck - Consulta Funcionário</h1>
        
        <%
        String cpf = request.getParameter("cpf");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(cpf);
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        if (funcionarioDAO.consultarCpf(funcionario) != null){
            out.println("<br> Funcionario:");
            out.println("<br>CPF:" + funcionario.getCpf());
            out.println("<br>Nome:" + funcionario.getNome());
            out.println("<br>Cargo:" + funcionario.getCargo());
            out.println("<br>CEP:" + funcionario.getCep());
            out.println("<br>Salario:" + funcionario.getSalario());
            out.println("<br>Data de Contrato:" + funcionario.getDataContrato());
        }else{
            out.println("<br> <b>Funcionario não encontrado! <b>");
        }       
        
        %>
        
    </body>
</html>
