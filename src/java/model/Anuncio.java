/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fernandojoao
 */
public class Anuncio implements java.io.Serializable{
    private long idAnuncio;
    private String frasePromocional;
    private String url;
    private String titulo;
    private String palavraChave;
    private Double custoClique;
    private long numeroClique;
    private long numCliqueValido;
    private long idAnunciante;
    private String dataCriado;
    private String estado;

    public Anuncio() {
    }

    public Anuncio(long idAnuncio, String frasePromocional, String url, String titulo, String palavraChave, Double custoClique, long numeroClique, long numCliqueValido, long idAnunciante, String dataCriado, String estado) {
        this.idAnuncio = idAnuncio;
        this.frasePromocional = frasePromocional;
        this.url = url;
        this.titulo = titulo;
        this.palavraChave = palavraChave;
        this.custoClique = custoClique;
        this.numeroClique = numeroClique;
        this.numCliqueValido = numCliqueValido;
        this.idAnunciante = idAnunciante;
        this.dataCriado = dataCriado;
        this.estado = estado;
    }

    public Double getCustoClique() {
        return custoClique;
    }

    public void setCustoClique(Double custoClique) {
        this.custoClique = custoClique;
    }

    public String getDataCriado() {
        return dataCriado;
    }

    public void setDataCriado(String dataCriado) {
        this.dataCriado = dataCriado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFrasePromocional() {
        return frasePromocional;
    }

    public void setFrasePromocional(String frasePromocional) {
        this.frasePromocional = frasePromocional;
    }

    public long getIdAnunciante() {
        return idAnunciante;
    }

    public void setIdAnunciante(long idAnunciante) {
        this.idAnunciante = idAnunciante;
    }

    public long getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(long idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public long getNumCliqueValido() {
        return numCliqueValido;
    }

    public void setNumCliqueValido(long numCliqueValido) {
        this.numCliqueValido = numCliqueValido;
    }

    public long getNumeroClique() {
        return numeroClique;
    }

    public void setNumeroClique(long numeroClique) {
        this.numeroClique = numeroClique;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
