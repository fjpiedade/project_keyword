/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.AnuncianteDAO;
import dao.ConeccaoDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Anunciante;

/**
 *
 * @author fernandojoao
 */
public class AnuncianteControle extends ConeccaoDB{
    private AnuncianteDAO dao;
    private Connection myPrivateConnection;
    public AnuncianteControle() {
        try {
            myPrivateConnection=getMyConeccao();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AnuncianteControle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AnuncianteControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        dao = new AnuncianteDAO(myPrivateConnection);
    }
    public boolean validUsernameAndPassword(String emailAnunciante,String senhaAnunciante) throws SQLException{
        return dao.isValidAnuncianteAndPassword(emailAnunciante, senhaAnunciante);
    }
    public Anunciante getAnunciante(long idAnunciante) throws SQLException{
        return dao.getAnunciante(idAnunciante);
    }
    public List<Anunciante> getListOfAnunciante() throws SQLException {
        return dao.getListOfAnunciante();
    }
    public long getAnuncianteID(String emailAnunciante) throws SQLException{
        return dao.getAnuncianteID(emailAnunciante);
    }
    public String getAnuncianteNome(String emailAnunciante) throws SQLException{
        return dao.getAnuncianteNome(emailAnunciante);
    }
    public boolean inserirAnunciante(Anunciante anunciante) throws SQLException{
        return dao.inserirAnunciante(anunciante);
    }
    public boolean alterarAnunciante(Anunciante anunciante) throws SQLException{
        return dao.alterarAnunciante(anunciante);
    }
    public boolean alterarSenhaAnunciante(long idAnuciante,String newSenhaAnunciante) throws SQLException{
        return dao.alterarSenhaAnunciante(idAnuciante, newSenhaAnunciante);
    }
    public boolean apagarAnunciante(long idAnunciante) throws SQLException{
        return dao.apagarAnunciante(idAnunciante);
    }
    public boolean apagarAnuncioAnunciante(long idAnunciante) throws SQLException{
        return dao.apagarAnuncioAnunciante(idAnunciante);
    }
    public boolean activarConta(long idAnunciante) throws SQLException{
        return dao.activarConta(idAnunciante);
    }
    public boolean bloquearConta(long idAnunciante) throws SQLException{
        return dao.bloquearConta(idAnunciante);
    }
    public boolean isValidTelefoneAnunciante(String telefoneAnunciante) throws SQLException{
        return dao.isValidTelefoneAnunciante(telefoneAnunciante);
    }
    public boolean isValidEmailAnunciante(String emailAnunciante) throws SQLException{
        return dao.isValidEmailAnunciante(emailAnunciante);
    }
    public boolean isLockedAnunciante(long idAnunciante) throws SQLException{
        return dao.isLockedAnunciante(idAnunciante);
    }
    public long isThereAnuncio(long idAnunciante) throws SQLException{
        return dao.isThereAnuncio(idAnunciante);
    }
}