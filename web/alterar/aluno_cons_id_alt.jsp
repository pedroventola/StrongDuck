<%@page import="model.dao.AlunoDAO"%>
<%@page import="model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Academia [Aluno]</title>
    </head>
    <body>
        <h1>StrongDuck - Alterar Aluno</h1>

        <%
            String matricula = request.getParameter("matricula");

            Aluno aluno = new Aluno();
            aluno.setMatricula(Integer.parseInt(matricula));

            AlunoDAO alunoDAO = new AlunoDAO();

            if (alunoDAO.consultarMatricula(aluno) != null) {
        %>
        <h1>Aluno: [Alteração]</h1> 
        <form name="frmAltAluno" method="post" action="aluno_update.jsp">
            
                Matrícula: <input type="text" name="cpf" readonly="true" value="<%= aluno.getMatricula()%>" <p>
                Nome: <input type="text" name="nome" value="<%= aluno.getNome()%>"> <p>
                CEP: <input type="text" name="cep" value="<%= aluno.getEnderecoCep()%>"> <p>
                Plano <input type="text" name="plano" value="<%= aluno.getPlano()%>"> <p> 
                Data da Matrícula: <input type="date" name="dataMatricula" value="<%= aluno.getDataMatricula()%>"> <p>
                Email <input type="email" name="email" value="<%= aluno.getEmail()%>"> <p>
                Idade: <input type="text" name="idade" value="<%= aluno.getIdade()%>"> <p>
                Sexo: <input type="text" name="sexo" value="<%= aluno.getSexo()%>"> <p>
                 
                <br>
             
            <input type="submit" value="Alterar!" name="alterar"> <p>                   
        </form>
        <%
            } else {
                out.println("<br> <b>Aluno não encontrado! <b>");
            }

        %>

    </body>
</html>
