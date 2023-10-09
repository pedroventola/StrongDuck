/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import model.Aluno;
import util.ConectaDB;

/**
 *
 * @author Gabriel Gama
 */
public class AlunoDAO {

    // Método para cadastrar um aluno.
    public boolean cadastrar(Aluno aluno) {
        Connection conexao = null;

        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
            String dataFormatada = dateFormater.format(aluno.getDataMatricula());

            // Constrói a consulta SQL para inserir um novo aluno no banco de dados.
            String sql = "INSERT INTO aluno (matricula, nome, plano, data_matricula, email, idade, sexo, cep) "
                    + "VALUES ('" + aluno.getMatricula() + "', '" + aluno.getNome() + "', '"
                    + aluno.getPlano() + "', '" + dataFormatada + "', '" + aluno.getEmail()
                    + "', '" + aluno.getIdade() + "', '" + aluno.getSexo() + "', '" + aluno.getEnderecoCep() + "')";

            stmt.executeUpdate(sql); // Executa a consulta SQL (Insert).
            System.out.println(" Registro Inserido! ");
            conexao.close();
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(" Exception: " + ex.toString());
            return false;
        }
    }

    //Metódo para consultar um aluno
    public Aluno consultarMatricula(Aluno aluno) {
        Connection conexao = null;
        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * from aluno WHERE matricula = '" + aluno.getMatricula() + "'";
            ResultSet rs = stmt.executeQuery(sql);

            int n_reg = 0;
            while (rs.next()) {

                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setEnderecoCep(rs.getString("cep"));
                aluno.setPlano(rs.getString("plano"));
                aluno.setDataMatricula(rs.getDate("data_Matricula"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setIdade(rs.getInt("idade"));

                n_reg++;
            }
            conexao.close();

            if (n_reg == 0) {
                return null;
            } else {
                return aluno;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(" Exception: " + ex.toString());
            return null;
        }
    }

    public boolean excluir(Aluno aluno) {
        Connection conexao = null;

        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();

            // Constrói a consulta SQL para excluir um aluno do banco de dados.
            String sql = "DELETE FROM aluno WHERE matricula = '" + aluno.getMatricula() + "'";

            stmt.executeUpdate(sql); // Executa a consulta SQL (Delete).
            System.out.println(" Registro Excluído! ");
            conexao.close();
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(" Erro: " + ex.toString());
            return false;
        }
    }

    public boolean alterar(Aluno aluno) {
        Connection conexao = null;

        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
            String dataFormatada = dateFormater.format(aluno.getDataMatricula());

            String sql = "UPDATE aluno SET nome = '" + aluno.getNome() + "', "
                    + "plano = '" + aluno.getPlano() + "', "
                    + "data_matricula = '" + dataFormatada + "', "
                    + "email = '" + aluno.getEmail() + "', "
                    + "idade = '" + aluno.getIdade() + "', "
                    + "sexo = '" + aluno.getSexo() + "', "
                    + "cep = '" + aluno.getEnderecoCep() + "' "
                    + "WHERE matricula = '" + aluno.getMatricula() + "'";

            stmt.executeUpdate(sql); // Executa a consulta SQL (Update).
            System.out.println(" Registro Alterado com sucesso! ");
            conexao.close();
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(" Erro: " + ex.toString());
            return false;
        }
    }
}
