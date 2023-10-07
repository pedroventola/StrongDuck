/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;
import util.ConectaDB;

/**
 *
 * @author alunos
 */

    // Data Access Object
public class FuncionarioDAO {
    //Atrib.
    
    //Métodos
    public boolean cadastrar(Funcionario funcionario) {
        Connection conexao = null;
        
        try{
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            
            //INSERT into funcionario(matric, nome, cargo, end_cep, end_comp) values('123','Garibaldi','Diretor', 'Av. Japão','Predio A - n.1234');            
            String sql = "INSERT into funcionario(matric, nome, cargo, end_cep, end_comp) " + 
                    "values('" + funcionario.getMatric() + "','" + funcionario.getNome() + "','" + funcionario.getCargo() +
                    "', '" + funcionario.getEnderecoCep() + "','" + funcionario.getEnderecoComp()+ "')";
            
            stmt.executeUpdate(sql); // Insert, Delete ou Update            
            System.out.println(" Registro Inserido! ");            
            conexao.close();
            return true;
                   
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(" Exception: " + ex.toString());
            return false;
        }
    }

    public Funcionario consultarMatric(Funcionario funcionario) {
        Connection conexao = null;
        
        try{
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * from funcionario WHERE matric = '" + funcionario.getMatric()+ "'";
            ResultSet rs = stmt.executeQuery(sql);
            
            int n_reg = 0;
            while (rs.next()){
                // "popular o obj funcionario"
                funcionario.setMatric(rs.getString("matric"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setEnderecoCep(rs.getString("end_cep"));
                funcionario.setEnderecoComp(rs.getString("end_comp"));
                n_reg++;
            }
            conexao.close();
                   
            if (n_reg == 0){
                return null;
            }else{
                return funcionario;
            }
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(" Exception: " + ex.toString());
            return null;
        }
    }
    
    //Return Tipo método
    public List consultarGeral() {
        Connection conexao = null;
        
        List minha_lista = new ArrayList();
        
        try{
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * from funcionario";
            ResultSet rs = stmt.executeQuery(sql);
            
            int n_reg = 0;
            while (rs.next()){  
                Funcionario funcionario = new Funcionario();
                
                funcionario.setMatric(rs.getString("matric"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setEnderecoCep(rs.getString("end_cep"));
                funcionario.setEnderecoComp(rs.getString("end_comp"));
                
                minha_lista.add(funcionario);
                        
                n_reg++;
            }
            conexao.close();
                   
            if (n_reg == 0){
                return null;
            }else{
                return minha_lista;
            }
            
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(" Exception: " + ex.toString());
            return null;
        }
    }
    
    public boolean excluir(Funcionario funcionario) {
        Connection conexao = null;
        
        try{
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            
            //DELETE FROM funcionario WHERE matric = '333';;            
            String sql = "DELETE FROM funcionario WHERE matric = '" + funcionario.getMatric() + "'";
            
            stmt.executeUpdate(sql); // Insert, Delete ou Update            
            System.out.println(" Registro Excluído! ");            
            conexao.close();
            return true;
                   
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(" Erro: " + ex.toString());
            return false;
        }
    }
    
    public boolean alterar(Funcionario funcionario) {
        Connection conexao = null;
        
        try{
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            
            //UPDATE funcionario SET nome='João', cargo='Estagiário',end_cep='08544-225',end_comp='Casa 132' WHERE 123            
            String sql = "UPDATE funcionario SET nome='" + funcionario.getNome() + "', cargo='" + funcionario.getCargo() +
                                "',end_cep='" + funcionario.getEnderecoCep() + "',end_comp='" + funcionario.getEnderecoComp() +
                                "' WHERE matric = '" + funcionario.getMatric() + "'";
            
            stmt.executeUpdate(sql); // Insert, Delete ou Update        
            //System.out.println(" SQL: " + sql);
            
            System.out.println(" Registro Alterardo com sucesso! ");            
            conexao.close();
            return true;
                   
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(" Erro: " + ex.toString());
            return false;
        }
    }

}
