<%-- Author : Pedro Ventola --%>

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
        <h1>Clínica - Alterar Funcionário</h1>

        <%
            String cpf = request.getParameter("cpf");

            Funcionario funcionario = new Funcionario();
            funcionario.setCpf(cpf);

            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

            if (funcionarioDAO.consultarCpf(funcionario) != null) {
        %>
        <h1>Funcionario: [Alteração]</h1> 
        <form name="frmAltFunc" method="post" action="func_update.jsp">
            
                CPF: <input type="text" name="cpf" readonly="true" value="<%= funcionario.getCpf()%>" <p>
                Nome: <input type="text" name="nome" value="<%= funcionario.getNome()%>"> <p>
                Cargo: <input type="text" name="cargo" value="<%= funcionario.getCargo()%>"> <p>
                CEP: <input type="text" name="cep" value="<%= funcionario.getEnderecoCep()%>"> <p>
                Data de Contrato: <input type="date" name="dataContrato" value="<%= funcionario.getDataContrato()%>"> <p>
                Salário: <input type="text" name="salario" value="<%= funcionario.getSalario()%>"> <p>
                <br>
            <input type="submit" value="Alterar!" name="alterar"> <p>                   
        </form>
        <%
            } else {
                out.println("<br> <b>Funcionario não encontrado! <b>");
            }

        %>

    </body>
</html>
