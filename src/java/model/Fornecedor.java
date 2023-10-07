/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alunos
 */
public class Fornecedor {
    //atrib
    public String cnpj;
    public String nome;
    public Endereco endereco; //atrib. "endereco" do tipo Classe "Endereco".
    
    // métodos
    public Fornecedor() {
        this.cnpj = "";
        this.nome = "";
        this.endereco = new Endereco();//instância
    }
    
    public Fornecedor(String cnpj, String nome, Endereco endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco; 
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEnderecoCep() {
        return this.endereco.getCep();
    }
    
    public String getEnderecoComp() {
        return this.endereco.getComplemento();
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnderecoCep(String end_cep) {
        this.endereco.setCep(end_cep);
    }
        
    public void setEnderecoComp(String end_comp) {
        this.endereco.setComplemento(end_comp);
    }
    
}
