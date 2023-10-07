<%-- 
    Document   : menu
    Created on : 28/08/2023, 20:47:21
    Author     : alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Clínica</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-25..200"/>
        <style>
            .material-symbols-outlined {
                font-variation-settings:
                'FILL' 0,
                'wght' 400,
                'GRAD' 0,
                'opsz' 24
            }
            body { color: gray;}
            h1 { color: black;}
            h2 { color: darkgray;}
        </style>
    </head>
    <body>
        <img src="image/logo.png" alt="" width="210" height="210"/>
        <h1>Clínica</h1> 
        
        <span class="material-symbols-outlined">person_add</span>
        <button onclick="document.location='cadastro/index_forn_cad.jsp'">Cadastro de Fornecedor</button>
        <br> 
        
        <span class="material-symbols-outlined">plagiarism</span>
        <button onclick="document.location='consultar/index_forn_cons.jsp'">Consulta Fornecedor</button>
        <br> 
        
        <span class="material-symbols-outlined">person_add</span>
        <button onclick="document.location='cadastro/index_func_cad.jsp'">Cadastro de Funcionário</button>
        <br>          
                
        <span class="material-symbols-outlined">plagiarism</span>
        <button onclick="document.location='consultar/index_func_cons.jsp'">Consulta Funcionário</button>
        <br>
        
        <span class="material-symbols-outlined">update</span>
        <button onclick="document.location='alterar/index_func_alt.jsp'">Alterar Funcionário</button> 
        <br>  
        
        <span class="material-symbols-outlined">delete</span>
        <button onclick="document.location='excluir/index_func_exc.jsp'">Apagar Funcionário</button>
        <br>
        
        <span class="material-symbols-outlined">fact_check</span>
        <button onclick="document.location='consultar/func_cons_geral.jsp'">Consulta Funcionário - Geral</button>
        <br>     
        
        <span class="material-symbols-outlined">fact_check</span>
        <button onclick="document.location='consultar/func_cons_geral_tab.jsp'">Consulta Funcionário - Geral Tabela</button>
        <br>     
       
    </body>
</html>
