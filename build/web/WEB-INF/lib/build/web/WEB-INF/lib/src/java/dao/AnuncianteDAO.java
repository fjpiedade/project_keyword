/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import model.Anunciante;

/**
 *
 * @author fernandojoao
 */
public class AnuncianteDAO extends ConeccaoDB{
    private Connection con;

    public AnuncianteDAO(Connection cx) {
        this.con = cx;
    }    
    public AnuncianteDAO() throws ClassNotFoundException, SQLException{
        this.con=getMyConeccao();
    }
    public boolean isValidAnuncianteAndPassword(String emailAnunciante,String senhaAnunciante) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM anunciante WHERE email = ? AND senhaAnunciante = ?");
            pst.setString(1, emailAnunciante);
            pst.setString(2, senhaAnunciante);
            rs=pst.executeQuery();
            if(rs.next()){
                return true;
            }
        }finally{
            pst.close();
            rs.close();
        }
        return false;
    }   
    public boolean isLockedAnunciante(long idAnunciante) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Anunciante WHERE idAnunciante = ? AND estado='Bloqueada'");
            pst.setLong(1, idAnunciante);
            rs=pst.executeQuery();
            if(rs.next()){
                return true;
            }
        }finally{
            pst.close();
            rs.close();
        }
        return false;
    }
    private Anunciante getAnuncianteFromSQL(ResultSet rs) throws SQLException {
        Anunciante returnAnunciante = new Anunciante();
        returnAnunciante.setIdanuciante(Long.parseLong(rs.getString("idAnunciante")));
        returnAnunciante.setNomeAnunciante(rs.getString("nomeAnunciante"));
        returnAnunciante.setMorada(rs.getString("morada"));
        returnAnunciante.setTelefone(rs.getString("telefone"));
        returnAnunciante.setDatacriado(rs.getString("datacriado"));
        returnAnunciante.setEmail(rs.getString("email"));
        returnAnunciante.setSenhaAnunciante(rs.getString("senhaAnunciante"));
        returnAnunciante.setEstado(rs.getString("estado"));
        return returnAnunciante;
    }
    public Anunciante getAnunciante(long idAnunciante) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM anunciante WHERE idAnunciante = ?");
            pst.setLong(1, idAnunciante);
            rs=pst.executeQuery();
            if(rs.next()){
                Anunciante utilizador= getAnuncianteFromSQL(rs);
                return utilizador;
            }
        }finally{
            pst.close();
            rs.close();
        }
        return null;
    }
    public String getAnuncianteNome(String emailAnunciante) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            Statement st= con.createStatement();
            
            rs = st.executeQuery("SELECT nomeanunciante FROM anunciante WHERE email ='"+emailAnunciante+"'");
            if(rs.next()){
                return rs.getString(1);
            }
        }finally{
            con.close();
        }
        return null;
    }
    public long getAnuncianteID(String emailAnunciante) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            Statement st= con.createStatement();
            rs = st.executeQuery("SELECT idanunciante FROM anunciante WHERE email ='"+emailAnunciante+"'");
            if(rs.next()){
                return rs.getLong(1);
            }
        }finally{
            con.close();
        }
        return 0;
    }
    public List<Anunciante> getListOfAnunciante() throws SQLException {
        List<Anunciante> returnAnuncio = new LinkedList<Anunciante>();
        Statement st=null;
        ResultSet rs=null;
        try{
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM anunciante ORDER BY idanunciante");
            while(rs.next()){
                returnAnuncio.add(getAnuncianteFromSQL(rs));
            }
        }finally{
            st.close();
            rs.close();
        }
        return returnAnuncio;
    }
    public boolean inserirAnunciante(Anunciante anunciante) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnunciante.inserirAnunciante(?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setString(2, anunciante.getNomeAnunciante());
            cstmt.setString(3, anunciante.getMorada());
            cstmt.setString(4, anunciante.getTelefone());
            cstmt.setString(5, anunciante.getEmail());
            cstmt.setString(6, anunciante.getSenhaAnunciante());
            cstmt.setString(7, anunciante.getEstado());
            cstmt.execute();
            int retorno=cstmt.getInt(1);

            if(retorno==0)
                return true;
            else
                return false;
            
        }finally{
            cstmt.close();
        }
    }
    public boolean alterarAnunciante(Anunciante anunciante) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnunciante.alterarAnunciante(?,?,?,?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, anunciante.getIdanuciante());
            cstmt.setString(3, anunciante.getNomeAnunciante());
            cstmt.setString(4, anunciante.getMorada());
            cstmt.setString(5, anunciante.getTelefone());
            cstmt.setString(6, anunciante.getEmail());
            cstmt.execute();
            int retorno=cstmt.getInt(1);

            if(retorno==0)
                return true;
            else
                return false;
            
        }finally{
            cstmt.close();
        }
    }
    public boolean alterarSenhaAnunciante(long idAnuciante,String newSenhaAnunciante) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnunciante.alterarSenhaAnunciante(?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idAnuciante);
            cstmt.setString(3, newSenhaAnunciante);
            
            cstmt.execute();
            int retorno=cstmt.getInt(1);

            if(retorno==0)
                return true;
            else
                return false;
            
        }finally{
            cstmt.close();
        }
    }
    public boolean apagarAnunciante(long idAnunciante) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnunciante.apagarAnunciante(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idAnunciante);
            cstmt.execute();
            int retorno=cstmt.getInt(1);

            if(retorno==0)
                return true;
            else
                return false;
            
        }finally{
            cstmt.close();
        }
    }
    public boolean apagarAnuncioAnunciante(long idAnunciante) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnuncio.apagarAnuncioAnunciante(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idAnunciante);
            cstmt.execute();
            int retorno=cstmt.getInt(1);

            if(retorno==0)
                return true;
            else
                return false;
            
        }finally{
            cstmt.close();
        }
    }
    public boolean activarConta(long idAnunciante) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnunciante.activarConta(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idAnunciante);
            cstmt.execute();
            int retorno=cstmt.getInt(1);

            if(retorno==0)
                return true;
            else
                return false;
            
        }finally{
            cstmt.close();
        }
    }
    public boolean bloquearConta(long idAnunciante) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnunciante.bloquearConta(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idAnunciante);
            cstmt.execute();
            int retorno=cstmt.getInt(1);

            if(retorno==0)
                return true;
            else
                return false;
            
        }finally{
            cstmt.close();
        }
    }
    public boolean isValidTelefoneAnunciante(String telefoneAnunciante) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Anunciante WHERE telefone = ?");
            pst.setString(1, telefoneAnunciante);
            rs=pst.executeQuery();
            if(rs.next()){
                return true;
            }
        }finally{
            pst.close();
            rs.close();
        }
        return false;
    }
    public boolean isValidEmailAnunciante(String emailAnunciante) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Anunciante WHERE email = ?");
            pst.setString(1, emailAnunciante);
            rs=pst.executeQuery();
            if(rs.next()){
                return true;
            }
        }finally{
            pst.close();
            rs.close();
        }
        return false;
    }
    public long isThereAnuncio(long idAnunciante) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT COUNT(*) FROM AnunciO WHERE idAnunciante = ?");
            pst.setLong(1, idAnunciante);
            rs=pst.executeQuery();
            rs.next();
            return rs.getInt(1);
        }finally{
            pst.close();
            rs.close();
        }
    }
}