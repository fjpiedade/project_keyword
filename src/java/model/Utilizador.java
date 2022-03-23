/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fernandojoao
 */
public class Utilizador  implements java.io.Serializable{
    
    private long idUtilizador;
    private String bi;
    private String nomeUtilizador;
    private String senhaUtilizador;
    private String dataCriado;
    private String nomeCompleto;
    private String sexo;
    private String dataNascimento;
    private String telefone;
    private String morada;
    private String email;

    public Utilizador() {
    }
    
    public Utilizador(long idUtilizador, String bi, String nomeUtilizador, String senhaUtilizador, String dataCriado, String nomeCompleto, String sexo, String dataNascimento, String telefone, String morada, String email) {
        this.idUtilizador = idUtilizador;
        this.bi = bi;
        this.nomeUtilizador = nomeUtilizador;
        this.senhaUtilizador = senhaUtilizador;
        this.dataCriado = dataCriado;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.morada = morada;
        this.email = email;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getDataCriado() {
        return dataCriado;
    }

    public void setDataCriado(String dataCriado) {
        this.dataCriado = dataCriado;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(long idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    public void setNomeUtilizador(String nomeUtilizador) {
        this.nomeUtilizador = nomeUtilizador;
    }

    public String getSenhaUtilizador() {
        return senhaUtilizador;
    }

    public void setSenhaUtilizador(String senhaUtilizador) {
        this.senhaUtilizador = senhaUtilizador;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}