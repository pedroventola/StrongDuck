<%-- 
      Author : Pedro Ventola
--%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
        <h1>StrongDuck - Cadastro de Aluno</h1>
       
        <%
        String matricula = request.getParameter("matricula");
        int matriculaInt = Integer.parseInt(matricula);
        String dataMatricula = request.getParameter("dataMatricula");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nome = request.getParameter("nome");
        String plano = request.getParameter("plano");
        String email = request.getParameter("email");
        String idade = request.getParameter("idade");
        int idadeInt = Integer.parseInt(idade);
        String sexo = request.getParameter("sexo");
        String enderecoCep = request.getParameter("enderecoCep");
        
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(matriculaInt);
        aluno.setdataMatricula(dataMatricula);;
        aluno.setNome(nome);
        aluno.setPlano(plano);
        aluno.setEmail(email);
        aluno.setIdade(idadeInt);
        
        AlunoDAO alunoDAO = new AlunoDAO();
        
        if (alunoDAO.cadastrar(aluno) == true){
            out.println("<br> Aluno cadastrado com sucesso!");
        }else{
            out.println("<br> <b>Aluno não cadastrado! <b>");
        }       
        
        %>
        
    </body>
</html>
