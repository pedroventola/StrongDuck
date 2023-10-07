/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alunos
 */
public class Funcionario {
    //Atrib
    public String matric;
    public String nome;
    public String cargo;
    public Endereco endereco; //atrib. "endereco" do tipo Classe "Endereco".
    
    // métodos

    public Funcionario() {
        this.matric = "";
        this.nome = "";
        this.cargo = "";       
        this.endereco = new Endereco();//instância
    }
    
    public Funcionario(String matric, String nome, String cargo, Endereco endereco) {
        this.matric = matric;
        this.nome = nome;
        this.cargo = cargo;
        this.endereco = endereco;
    }

    public String getMatric() {
        return matric;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEnderecoCep() {
        return this.endereco.getCep();
    }
    public String getEnderecoComp() {
        return this.endereco.getComplemento();
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEnderecoCep(String end_cep) {
        this.endereco.setCep(end_cep);
    }
        
    public void setEnderecoComp(String end_comp) {
        this.endereco.setComplemento(end_comp);
    }
    
    
    
}
