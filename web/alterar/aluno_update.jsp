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
        <h1>StrongDuck - Alterar Aluno</h1>
        
        <%
       String nome = request.getParameter("nome");
            String sexo = request.getParameter("sexo");
            String idade = request.getParameter("idade");
            int idadeInt = Integer.parseInt(idade);
            String telefone = request.getParameter("telefone");
            String email = request.getParameter("email");
            String enderecoCep = request.getParameter("enderecoCep");
            String matricula = request.getParameter("matricula");
            int matriculaInt = Integer.parseInt(matricula);
            String plano = request.getParameter("plano");
            String dataMatricula = request.getParameter("dataMatricula");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setSexo(sexo);
            aluno.setIdade(idadeInt);
            aluno.setTelefone(telefone);
            aluno.setEmail(email);
            aluno.setEnderecoCep(enderecoCep);
            aluno.setMatricula(matriculaInt);
            aluno.setPlano(plano);
            aluno.setDataMatricula(dateFormat.parse(dataMatricula));
            
         

            AlunoDAO alunoDAO = new AlunoDAO();
        
        if (alunoDAO.alterar(aluno) == true){
            out.println("<br> Aluno alterado com sucesso!");
        }else{
            out.println("<br> <b>Aluno não alterado! <b>");
        }       
        
        %>
        
    </body>
</html>
