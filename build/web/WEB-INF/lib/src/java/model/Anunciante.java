/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fernandojoao
 */
public class Anunciante implements java.io.Serializable{
    private long idanuciante;
    private String nomeAnunciante;
    private String morada;
    private String telefone;
    private String datacriado;
    private String email;
    private String senhaAnunciante;
    private String estado;

    public Anunciante() {
    }

    public Anunciante(long idanuciante, String nomeAnunciante, String morada, String telefone, String datacriado, String email, String senhaAnunciante, String estado) {
        this.idanuciante = idanuciante;
        this.nomeAnunciante = nomeAnunciante;
        this.morada = morada;
        this.telefone = telefone;
        this.datacriado = datacriado;
        this.email = email;
        this.senhaAnunciante = senhaAnunciante;
        this.estado = estado;
    }

    public String getDatacriado() {
        return datacriado;
    }

    public void setDatacriado(String datacriado) {
        this.datacriado = datacriado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public long getIdanuciante() {
        return idanuciante;
    }

    public void setIdanuciante(long idanuciante) {
        this.idanuciante = idanuciante;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNomeAnunciante() {
        return nomeAnunciante;
    }

    public void setNomeAnunciante(String nomeAnunciante) {
        this.nomeAnunciante = nomeAnunciante;
    }

    public String getSenhaAnunciante() {
        return senhaAnunciante;
    }

    public void setSenhaAnunciante(String senhaAnunciante) {
        this.senhaAnunciante = senhaAnunciante;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
