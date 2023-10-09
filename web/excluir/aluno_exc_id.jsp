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
        <h1>StrongDuck - Excluir Aluno</h1>
        
        <%
        String matricula = request.getParameter("matricula");
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(Integer.parseInt(matricula));
        
        AlunoDAO alunoDAO = new AlunoDAO();
        
        if (alunoDAO.excluir(aluno) == true){
            out.println("<br> Aluno excluído com sucesso!");
        }else{
            out.println("<br> <b>Aluno não excluído! <b>");
        }       
        
        %>
        
    </body>
</html>
