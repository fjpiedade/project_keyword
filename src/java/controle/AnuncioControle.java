/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.AnuncioDAO;
import dao.ConeccaoDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Anuncio;

/**
 *
 * @author fernandojoao
 */
public class AnuncioControle extends ConeccaoDB{
    private AnuncioDAO dao;
    private Connection myPrivateConnection;
    public AnuncioControle() {
        try {
            myPrivateConnection=getMyConeccao();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AnuncioControle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AnuncioControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        dao = new AnuncioDAO(myPrivateConnection);
    }
    public Anuncio getAnuncio(long idAnuncio) throws SQLException{
        return dao.getAnuncio(idAnuncio);
    }
    public long getAnuncioNum(long idAnunciante) throws SQLException{
        return dao.getAnuncioNum(idAnunciante);
    }
    public List<Anuncio> getListOfAnuncio() throws SQLException{
        return dao.getListOfAnuncio();
    }
    public List<Anuncio> getListOfAnuncioAnunciante(long idAnunciante) throws SQLException {
        return dao.getListOfAnuncioAnunciante(idAnunciante);
    }
    public boolean inserirAnuncio(Anuncio anuncio) throws SQLException{
        return dao.inserirAnuncio(anuncio);
    }
    public boolean alterarAnuncio(Anuncio anuncio) throws SQLException{
        return dao.alterarAnuncio(anuncio);
    }
    public boolean apagarAnuncio(long idAnuncio) throws SQLException{
        return dao.apagarAnuncio(idAnuncio);
    }
    public boolean registarClique(long idAnuncio) throws SQLException{
        return dao.registarClique(idAnuncio);
    }
    public boolean activarAnuncio(long idAnuncio) throws SQLException{
        return dao.activarAnuncio(idAnuncio);
    }
    public boolean desactivarAnuncio(long idAnuncio) throws SQLException{
        return dao.desactivarAnuncio(idAnuncio);
    }
    public boolean isLockedAnuncio(long idAnuncio) throws SQLException{
        return dao.isLockedAnuncio(idAnuncio);
    }
}