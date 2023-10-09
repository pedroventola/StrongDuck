<%-- 
    Author  :  Pedro Ventola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Academia [Funcionário]</title>
    </head>
    <body>
        <h1>StrongDuck - Cadastro Funcionário</h1>
        <form name="FormCadFunc" method="post" action="func_cad.jsp">           
                CPF: <input type="text" name="cpf"> <p>
                Nome: <input type="text" name="nome"> <p>
                Cargo: <input type="text" name="cargo"> <p>
                Endereço CEP: <input type="text" name="end_cep"> <p>    
                Data de Contrato: <input type="date" name="dataContrato"> <p>
                Salário: <input type="text" name="salario"> <p>


                <input type="reset" value="Limpar"> 
            <input type="submit" value="Salvar"> <p>
        </form>
    </body>
</html>
