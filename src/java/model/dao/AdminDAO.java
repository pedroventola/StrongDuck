/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Admin;
import util.ConectaDB;

/**
 *
 * @author Pedro Ventola
 */
public class AdminDAO {
    
     // Métodos
    public Admin consultar(Admin admin) throws ClassNotFoundException{        
        Connection conexao = null;
        try{
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * from admin WHERE login = '" + admin.getLogin() + "' and senha = '" + admin.getSenha() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            
            int n_reg = 0;
            while (rs.next()){
                n_reg++;
            }
            conexao.close();
                   
            if (n_reg == 0){
                return null;
            }else{
                return admin;
            }
        } catch(SQLException ex){
            System.out.println(" Exception: " + ex.toString());
            return null;
        }         
    }
}
    

