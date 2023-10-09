/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Pessoa;
import util.ConectaDB;

/**
 *
 * @author Pedro Ventola
 */
public class PessoaDAO {

    // Método para cadastrar
    public boolean cadastrar(Pessoa pessoa) {
        Connection conexao = null;

        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();

            //Consulta SQL para inserir nova "Pessoa"
            String sql = "INSERT INTO pessoa(nome, sexo, idade, telefone, email, endereco_cep) "
                    + "VALUES(" + pessoa.getNome() + ",'" + pessoa.getSexo() + "','" + pessoa.getIdade()
                    + "','" + pessoa.getTelefone() + "','" + pessoa.getEmail() + ",'" + pessoa.getEnderecoCep() + "')";

            stmt.executeUpdate(sql); // Executa a consulta SQL (Insert).
            System.out.println(" Registro Inserido! ");
            conexao.close();
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(" Exception: " + ex.toString());
            return false;
        }
    }

}