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
        
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-25..200"/>
        <style>
            table{
                border-collapse: collapse;
                width: 100%;
            }
            th, td{
                padding: 4px;
                text-align: left;
                border: 1px solid #515254;
            }
            tr:hover {background-color: #D6EEEE;}            
            
            .material-symbols-outlined {
                font-variation-settings:
                'FILL' 0,
                'wght' 400,
                'GRAD' 0,
                'opsz' 24
            }
            body { color: black;}
            h1 { color: black;}
            h2 { color: darkgray;}
        </style>
      
        
    </head>
    <body>
        <h1>Clínica - Funcionário Consulta Geral</h1>
        
        <%      
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        List<Funcionario> minha_lista = new ArrayList<>();
        minha_lista = funcionarioDAO.consultarGeral();
                        
        //if (funcionarioDAO.consultarGeral() != null){                   
           
        %>
        <table style="width:100%"; border="2">
            <tr bgcolor="F3F3F3" >
                <th>Alterar?</th>
                <th>Apagar?</th>
                <th>Matrícula</th>
                <th>Nome</th>
                <th>Cargo</th>
                <th>CEP</th>
                <th>Complemento</th>
            </tr>
        <%                     
           int n_reg = 0;
           for(int i=0; i<=minha_lista.size()-1;i++){  
        %>
            <tr>
                <td> <a href="../alterar/funcionario_cons_id_alt.jsp?matric=<%= minha_lista.get(i).getMatric() %>"> <span class="material-symbols-outlined">update</span> </a></td>     
                <td> <a href="../excluir/func_exc_id.jsp?matric=<%= minha_lista.get(i).getMatric() %>"> <span class="material-symbols-outlined">delete</span> </a></td>   
                <td> <a href="funcionario_cons_id.jsp?matric=<%= minha_lista.get(i).getMatric() %>"> <%= minha_lista.get(i).getMatric() %> </a></td>              
                <td> <%= minha_lista.get(i).getNome() %></td>
                <td> <%= minha_lista.get(i).getCargo() %></td>
                <td> <%= minha_lista.get(i).getEnderecoCep() %></td>
                <td> <%= minha_lista.get(i).getEnderecoComp() %></td>             
        <% 
            n_reg++;
            }        
        //}else{
        //    out.println("<br> <b>Funcionario não encontrado! <b>");
        //}    
        %>
        </table>
        
    </body>
</html>
