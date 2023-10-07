/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.*;
import model.Fornecedor;
import util.ConectaDB;

/**
 *
 * @author alunos
 */
public class FornecedorDAO {
    //Atrib.
    
    //Métodos
    
    public Fornecedor consultarCNPJ(Fornecedor fornecedor) {
        Connection conexao = null;
        
        try{
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * from fornecedor WHERE cnpj = '" + fornecedor.getCnpj()+ "'";
            ResultSet rs = stmt.executeQuery(sql);
            
            int n_reg = 0;
            while (rs.next()){
                // "popular o obj fornecedor"
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setEnderecoCep(rs.getString("end_cep"));
                fornecedor.setEnderecoComp(rs.getString("end_comp"));
                n_reg++;
            }
            conexao.close();
                   
            if (n_reg == 0){
                return null;
            }else{
                return fornecedor;
            }
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(" Exception: " + ex.toString());
            return null;
        }
    }
    
}
