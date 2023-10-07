/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alunos
 */
public class Endereco {
    //atrib
    private String cep;
    private String complemento;
    
    // métodos

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
}
