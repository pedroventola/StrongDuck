/*
 * @author Gabriel Gama
 */
package model;

import java.util.Date;


public class Funcionario extends Pessoa{

    // Atributos públicos da classe Funcionario
    public String cpf;
    public String cargo;
    public Date data_contrato;
    public Float salario;
    public String cep;

    // Construtor padrão da classe Funcionario
    public Funcionario() {
        this.cpf = "";
        this.cargo = "";
        this.data_contrato = new Date(); // Inicializa a data com a data atual
        this.salario = 0.0f; // Inicializa o salário com um valor padrão (por exemplo, 0.0)
        this.cep = "";
    }

    // Construtor sobrecarregado da classe Funcionario
    public Funcionario(String cpf, String nome, String cargo, Date data_contrato, Float salario, String cep) {
        this.cpf = cpf;
        this.cargo = cargo;
        this.data_contrato = data_contrato;
        this.salario = salario;
        this.cep = cep;
    }

    // Métodos getters e setters para acessar os atributos da classe Funcionario
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   
    public Date getDataContrato() {
        return data_contrato;
    }

    public void setDataContrato(Date data_contrato) {
        this.data_contrato = data_contrato;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    }
