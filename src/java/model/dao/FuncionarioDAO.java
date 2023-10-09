/**
 * Data Access Object (DAO) para a entidade Funcionário.
 */
package model.dao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;
import util.ConectaDB;

public class FuncionarioDAO {

    // Método para cadastrar um funcionário.
    public boolean cadastrar(Funcionario funcionario) {
        Connection conexao = null;

        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
            String dataFormatada = dateFormater.format(funcionario.getDataContrato());

            // Constrói a consulta SQL para inserir um novo funcionário no banco de dados.
            String sql = "INSERT INTO funcionario(cpf, nome, cargo, cep, data_contrato, salario) "
                    + "VALUES('" + funcionario.getCpf() + "','" + funcionario.getNome() + "','" + funcionario.getCargo()
                    + "','" + funcionario.getEnderecoCep() + "','"
                    + dataFormatada + "','" + funcionario.getSalario() + "')";

            stmt.executeUpdate(sql); // Executa a consulta SQL (Insert).
            System.out.println(" Registro Inserido! ");
            conexao.close();
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(" Exception: " + ex.toString());
            return false;
        }
    }

    // Método para consultar um funcionário por CPF.
    public Funcionario consultarCpf(Funcionario funcionario) {
        Connection conexao = null;

        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * from funcionario WHERE cpf = '" + funcionario.getCpf() + "'";
            ResultSet rs = stmt.executeQuery(sql);

            int n_reg = 0;
            while (rs.next()) {
                // Preenche o objeto funcionario com os dados do resultado da consulta.
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setDataContrato(rs.getDate("data_contrato"));
                funcionario.setSalario(rs.getFloat("salario"));
                n_reg++;
            }
            conexao.close();

            if (n_reg == 0) {
                return null;
            } else {
                return funcionario;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(" Exception: " + ex.toString());
            return null;
        }
    }

    // Método para excluir um funcionário por CPF.
    public boolean excluir(Funcionario funcionario) {
        Connection conexao = null;

        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();

            // Constrói a consulta SQL para excluir um funcionário do banco de dados.
            String sql = "DELETE FROM funcionario WHERE cpf = '" + funcionario.getCpf() + "'";

            stmt.executeUpdate(sql); // Executa a consulta SQL (Delete).
            System.out.println(" Registro Excluído! ");
            conexao.close();
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(" Erro: " + ex.toString());
            return false;
        }
    }

    // Método para alterar os dados de um funcionário.
    public boolean alterar(Funcionario funcionario) {
        Connection conexao = null;

        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
            String dataFormatada = dateFormater.format(funcionario.getDataContrato());

            // Constrói a consulta SQL para atualizar os dados de um funcionário no banco de dados.
            String sql = "UPDATE funcionario SET nome='" + funcionario.getNome() + "', cargo='" + funcionario.getCargo()
                    + "', cep='" + funcionario.getCep() 
                    + "', data_contrato='" + dataFormatada + "', salario=" + funcionario.getSalario()
                    + " WHERE cpf= '" + funcionario.getCpf() + "'";

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
