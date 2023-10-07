<%-- 
    Document   : fornecedor_cons_id.jsp
    Created on : 23/08/2023, 21:06:22
    Author     : alunos
--%>

<%@page import="model.dao.FornecedorDAO"%>
<%@page import="model.Fornecedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica [Fornecedor]</title>
    </head>
    <body>
        <h1>Clínica - Consulta Fornecedor</h1>
        
        <%
        String cnpj = request.getParameter("cnpj");
        
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setCnpj(cnpj);
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        
        if (fornecedorDAO.consultarCNPJ(fornecedor) != null){
            out.println("<br> Fornecedor:");
            out.println("<br>CNPJ:" + fornecedor.getCnpj());
            out.println("<br>Nome:" + fornecedor.getNome());
            out.println("<br>CEP:" + fornecedor.getEnderecoCep());
            out.println("<br>Complemento:" + fornecedor.getEnderecoComp());
        }else{
            out.println("<br> <b>Fornecedor não encontrado! <b>");
        }       
        
        %>
        
    </body>
</html>
