/*
 * @author Gabriel Gama
 */
package model;

import java.util.Date;

/**
 * A classe Funcionario representa um funcionário com os seguintes atributos: -
 * cpf: CPF do funcionário - nome: Nome do funcionário - cargo: Cargo do
 * funcionário - endereco: Objeto do tipo Endereco que armazena informações de
 * endereço do funcionário - data_contrato: Data de início do contrato do
 * funcionário - salario: Salário do funcionário
 */
public class Funcionario {

    // Atributos públicos da classe Funcionario
    public String cpf;
    public String nome;
    public String cargo;
    public Endereco endereco; // Atributo "endereco" do tipo Classe "Endereco".
    public Date data_contrato;
    public Float salario;

    // Construtor padrão da classe Funcionario
    public Funcionario() {
        this.cpf = "";
        this.nome = "";
        this.cargo = "";
        this.endereco = new Endereco(); // Instancia um objeto Endereco
        this.data_contrato = new Date(); // Inicializa a data com a data atual
        this.salario = 0.0f; // Inicializa o salário com um valor padrão (por exemplo, 0.0)
    }

    // Construtor sobrecarregado da classe Funcionario
    public Funcionario(String cpf, String nome, String cargo, Endereco endereco, Date data_contrato, Float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
        this.endereco = endereco;
        this.data_contrato = data_contrato;
        this.salario = salario;
    }

    // Métodos getters e setters para acessar os atributos da classe Funcionario
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEnderecoCep() {
        return this.endereco.getCep();
    }

    public String getEnderecoComp() {
        return this.endereco.getComplemento();
    }

    public void setEnderecoCep(String end_cep) {
        this.endereco.setCep(end_cep);
    }

    public void setEnderecoComp(String end_comp) {
        this.endereco.setComplemento(end_comp);
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
}
