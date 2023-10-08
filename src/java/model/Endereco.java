/*
 * @author Gabriel Gama
 */
package model;

/**
 * A classe Endereco representa informações de endereço com os seguintes
 * atributos: - cep: CEP do endereço - complemento: Complemento do endereço -
 * logradouro: Logradouro do endereço - bairro: Bairro do endereço - cidade:
 * Cidade do endereço - Estado: Estado do endereço
 */
public class Endereco {

    // Atributos privados da classe Endereco
    private String cep;
    private String complemento;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String Estado;

    // Métodos getters e setters para acessar os atributos da classe Endereco
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
