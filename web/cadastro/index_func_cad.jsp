<%-- 
    Document   : index
    Created on : 23/08/2023, 20:27:33
    Author     : alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica [Funcionário]</title>
    </head>
    <body>
        <h1>Clínica - Cadastro Funcionário</h1>
        <form name="FormCliCad" method="post" action="func_cad.jsp">           
            Matrícula: <input type="text" name="matric"> <p>
            Nome: <input type="text" name="nome"> <p>
            Cargo: <input type="text" name="cargo"> <p>
            Endereço CEP: <input type="text" name="end_cep"> <p>    
            Complemento.: <input type="text" name="end_comp"> <p>    
            <input type="reset" value="Limpar"> 
            <input type="submit" value="Salvar"> <p>
        </form>
    </body>
</html>
