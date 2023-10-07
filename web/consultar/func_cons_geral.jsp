<%-- 
    Document   : funcionario_cons_id.jsp
    Created on : 23/08/2023, 21:06:22
    Author     : alunos
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.dao.FuncionarioDAO"%>
<%@page import="model.Funcionario"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica [Funcionário]</title>
    </head>
    <body>
        <h1>Clínica - Funcionário Consulta Geral</h1>
        
        <%   
              
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        List<Funcionario> minha_lista = new ArrayList<>();
        minha_lista = funcionarioDAO.consultarGeral();
                        
        //if (funcionarioDAO.consultarGeral() != null){                   
            out.println("<br> Funcionario:");
            
           //int n_reg = 0;
           for(int i=0; i<=minha_lista.size()-1;i++){
                // "popular o obj funcionario"
                out.println("<br><br>Matric:" + minha_lista.get(i).getMatric());
                out.println("<br>Nome:" +  minha_lista.get(i).getNome());
                out.println("<br>Cargo:" + minha_lista.get(i).getCargo());
                out.println("<br>CEP:" +  minha_lista.get(i).getEnderecoCep());
                out.println("<br>Complemento:" + minha_lista.get(i).getEnderecoComp());
                //n_reg++;
            }        
        //}else{
        //    out.println("<br> <b>Funcionario não encontrado! <b>");
        //}       
        
        %>
        
    </body>
</html>
