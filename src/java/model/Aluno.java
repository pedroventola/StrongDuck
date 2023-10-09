/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Date;

/**
 *
 * @author Pedro Ventola
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String plano;
    private Date dataMatricula;
    private int periodo;

    // Construtor
    public Aluno(String nome, String sexo, int idade, String telefone, String email, String enderecoCep, int matricula, String plano, Date dataMatricula,int periodo) {
        super(nome, sexo, idade, telefone, email, enderecoCep);
        this.matricula = matricula;
        this.plano = plano;
        this.dataMatricula = dataMatricula;
        this.periodo = periodo;
    }
    
    
    // Getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
