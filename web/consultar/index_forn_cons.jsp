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
        <title>Clínica [Fornecedor]</title>
    </head>
    <body>
        <h1>Clínica - Consulta Fornecedor</h1>
        <form name="FormCliCons" method="post" action="fornecedor_cons_id.jsp">
            CNPJ: <input type="text" name="cnpj"> <p>
            <input type="reset" value="Limpar"> 
            <input type="submit" value="Consultar"> <p>
        </form>
    </body>
</html>
