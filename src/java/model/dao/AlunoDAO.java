/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

            // Constrói a consulta SQL para inserir um novo aluno no banco de dados.
            String sql = "INSERT INTO aluno(matricula, nome, plano, data_matricula, curso, periodo, endereco_cep) "
                    + "VALUES(" + aluno.getMatricula() + ",'" + aluno.getNome() + "','" + aluno.getPlano()
                    + "','" + aluno.getDataMatricula() + "','" + aluno.getCurso()
                    + "'," + aluno.getPeriodo() + ",'" + aluno.getEnderecoCep() + "')";

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
    public Aluno consultarMatric(Aluno aluno) {
        Connection conexao = null;
        try {
            conexao = ConectaDB.conectar();
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * from aluno WHERE matric = '" + aluno.getMatricula()+ "'";
            ResultSet rs = stmt.executeQuery(sql);

            int n_reg = 0;
            while (rs.next()) {
                // Preenche o objeto aluno com os dados do resultado da consulta.
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
}
