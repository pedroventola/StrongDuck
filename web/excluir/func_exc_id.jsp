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
        <h1>StrongDuck - Excluir Funcionário</h1>
        
        <%
        String cpf = request.getParameter("cpf");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(cpf);
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        if (funcionarioDAO.excluir(funcionario) == true){
            out.println("<br> Funcionario excluído com sucesso!");
        }else{
            out.println("<br> <b>Funcionario não excluído! <b>");
        }       
        
        %>
        
    </body>
</html>
