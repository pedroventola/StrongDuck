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
        <h1>StrongDuck - Consulta Aluno</h1>
        
        <%
        String matricula = request.getParameter("matricula");
        
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(Integer.parseInt(matricula));
        
        AlunoDAO alunoDAO = new AlunoDAO();
        
        if (alunoDAO.consultarMatricula(aluno) != null){
            out.println("<br> ALUNO");
            out.println("<br>Matricula:" + aluno.getMatricula());
            out.println("<br>Nome:" + aluno.getNome());
            out.println("<br>Email:" + aluno.getEmail());
            out.println("<br>CEP:" + aluno.getEnderecoCep());
            out.println("<br>Plano:" + aluno.getPlano());
            out.println("<br>Sexo:" + aluno.getSexo());
            out.println("<br>Idade:" + aluno.getIdade());
           
        }else{
            out.println("<br> <b>Funcionario não encontrado! <b>");
        }       
        
        %>
        
    </body>
</html>
