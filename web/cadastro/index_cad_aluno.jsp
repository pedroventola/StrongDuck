<%-- 
    Author : Pedro Ventola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Academia [Aluno]</title>
    </head>
    <body>
        <h1>StrongDuck - Cadastro de Aluno</h1>
        <form name="FormCadAluno" method="post" action="aluno_cad.jsp"> 
                Matrícula: <input type="text" name="matricula"> <p>
                Data da Matrícula: <input type="date" name="dataMatricula"> <p>
                Nome: <input type="text" name="nome"> <p>
                Plano <input type="text" name="plano"> <p>
                Email: <input type="email" name="email"> <p>
                Idade: <input type="text" name="idade"> <p>
                Sexo: <input type="text" name="sexo"> <p>
                CEP: <input type="text" name="enderecoCep"> <p>    
                <input type="reset" value="Limpar"> 
            <input type="submit" value="Salvar"> <p>
        </form>
    </body>
</html>

