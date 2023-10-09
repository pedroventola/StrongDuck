/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Pedro Ventola
 */
public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    private String telefone;
    String email;
    private String enderecoCep;

    // Construtor
    public Pessoa(String nome, String sexo, int idade, String telefone, String email, String enderecoCep) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.enderecoCep = enderecoCep;
    }
    
     public Pessoa() {
        this.nome = "";
        this.sexo = "";
        this.idade = 0;
        this.telefone = "";
        this.email = "";
        this.enderecoCep = "";
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnderecoCep() {
        return enderecoCep;
    }

    public void setEnderecoCep(String enderecoCep) {
        this.enderecoCep = enderecoCep;
    }
}
