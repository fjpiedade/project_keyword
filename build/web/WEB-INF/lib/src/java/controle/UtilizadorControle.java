/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ConeccaoDB;
import dao.UtilizadorDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Utilizador;
/**
 *
 * @author fernandojoao
 */
public class UtilizadorControle extends ConeccaoDB{
    private UtilizadorDAO dao;
    private Connection myPrivateConnection;
    public UtilizadorControle() {
        try {
            myPrivateConnection=getMyConeccao();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilizadorControle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UtilizadorControle.class.getName()).log(Level.SEVERE, null, ex);
        }
        dao = new UtilizadorDAO(myPrivateConnection);
    }
    public boolean validUsernameAndPassword(String nomeUtilizador,String senhaUtilizador) throws SQLException{
        return dao.isValidUsernameAndPassword(nomeUtilizador, senhaUtilizador);
    }
    public boolean inserirUtilizador(Utilizador utilizador) throws SQLException{
        return dao.inserirUtilizador(utilizador);
    }
    public boolean alterarUtilizador(Utilizador utilizador) throws SQLException{
        return dao.alterarUtilizador(utilizador);
    }
    public boolean alterarSenhaUtilizador(long idUtilizador,String newSenhaUtilizador) throws SQLException{
        return dao.alterarSenhaUtilizador(idUtilizador, newSenhaUtilizador);
    }
    public boolean apagarUtilizador(long idUtilizador) throws SQLException{
        return dao.apagarUtilizador(idUtilizador);
    }
    public Utilizador getUtilizador(long idUtilizador) throws SQLException{
        return dao.getUtilizador(idUtilizador);
    }
    public long getUtilizadorID(String nomeUtilizador) throws SQLException{
        return dao.getUtilizadorID(nomeUtilizador);
    }
    public List<Utilizador> getListOfUtilizador() throws SQLException {
        return dao.getListOfUtilizador();
    }
    public boolean isValidBiUtilizador(String biUtilizador) throws SQLException{
        return dao.isValidBiUtilizador(biUtilizador);
    }
    public boolean isValidTelefoneUtilizador(String telefoneUtilizador) throws SQLException{
        return dao.isValidTelefoneUtilizador(telefoneUtilizador);
    }
    public boolean isValidNomeUtilizador(String nomeUtilizador) throws SQLException{
        return dao.isValidNomeUtilizador(nomeUtilizador);
    }
    public boolean isValidEmailUtilizador(String emailUtilizador) throws SQLException{
        return dao.isValidEmailUtilizador(emailUtilizador);
    }
}