/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import model.Anuncio;

/**
 *
 * @author fernandojoao
 */
public class AnuncioDAO extends ConeccaoDB {
    private Connection con;

    public AnuncioDAO(Connection con) {
        this.con = con;
    }    
    public AnuncioDAO() throws ClassNotFoundException, SQLException{
        this.con=getMyConeccao();
    }
    private Anuncio getAnuncioFromSQL(ResultSet rs) throws SQLException {
        Anuncio returnAnuncio = new Anuncio();
        returnAnuncio.setIdAnuncio(Long.parseLong(rs.getString("idAnuncio")));
        returnAnuncio.setFrasePromocional(rs.getString("frasePromocional"));
        returnAnuncio.setUrl(rs.getString("url"));
        returnAnuncio.setTitulo(rs.getString("titulo"));
        returnAnuncio.setPalavraChave(rs.getString("palavrachave"));
        returnAnuncio.setCustoClique(rs.getDouble("custoclique"));
        returnAnuncio.setNumeroClique(rs.getLong("numeroClique"));
        returnAnuncio.setNumCliqueValido(rs.getLong("numCliqueValido"));
        returnAnuncio.setIdAnunciante(rs.getLong("idAnunciante"));
        returnAnuncio.setDataCriado(rs.getString("datacriado"));
        returnAnuncio.setEstado(rs.getString("estado"));
        
        return returnAnuncio;
    }
    public Anuncio getAnuncio(long idAnuncio) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Anuncio WHERE idAnuncio = ?");
            pst.setLong(1, idAnuncio);
            rs=pst.executeQuery();
            if(rs.next()){
                Anuncio anuncio= getAnuncioFromSQL(rs);
                return anuncio;
            }
        }finally{
            pst.close();
            rs.close();
        }
        return null;
    }
    public List<Anuncio> getListOfAnuncioAnunciante(long idAnunciante) throws SQLException {
        List<Anuncio> returnAnuncio = new LinkedList<Anuncio>();
        Statement st=null;
        ResultSet rs=null;
        try{
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM anuncio WHERE idAnunciante = "+idAnunciante+" ORDER BY idanuncio, custoclique DESC");
            while(rs.next()){
                returnAnuncio.add(getAnuncioFromSQL(rs));
            }
        }finally{
            st.close();
            rs.close();
        }
        return returnAnuncio;
    }
    public long getAnuncioNum(long idAnunciante) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT COUNT(*) FROM Anuncio WHERE idAnunciante = ?");
            pst.setLong(1, idAnunciante);
            rs=pst.executeQuery();
            rs.next();
            return rs.getLong(1);
        }finally{
            pst.close();
            rs.close();
        }
    }
    public List<Anuncio> getListOfAnuncio() throws SQLException {
        List<Anuncio> returnAnuncio = new LinkedList<Anuncio>();
        Statement st=null;
        ResultSet rs=null;
        try{
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM anuncio ORDER BY idanunciante, custoclique DESC");
            
            while(rs.next()){
                returnAnuncio.add(getAnuncioFromSQL(rs));
            }
        }finally{
            st.close();
            rs.close();
        }
        return returnAnuncio;
    }
    public boolean inserirAnuncio(Anuncio anuncio) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnuncio.inserirAnuncio(?,?,?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setString(2, anuncio.getFrasePromocional());
            cstmt.setString(3, anuncio.getUrl());
            cstmt.setString(4, anuncio.getTitulo());
            cstmt.setString(5, anuncio.getPalavraChave());
            cstmt.setDouble(6, anuncio.getCustoClique());
            cstmt.setLong(7, anuncio.getNumeroClique());
            cstmt.setLong(8, anuncio.getNumCliqueValido());
            cstmt.setLong(9, anuncio.getIdAnunciante());
            cstmt.setString(10, anuncio.getEstado());
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
    public boolean alterarAnuncio(Anuncio anuncio) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnuncio.alterarAnuncio(?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, anuncio.getIdAnuncio());
            cstmt.setString(3, anuncio.getFrasePromocional());
            cstmt.setString(4, anuncio.getUrl());
            cstmt.setString(5, anuncio.getTitulo());
            cstmt.setString(6, anuncio.getPalavraChave());
            cstmt.setDouble(7, anuncio.getCustoClique());
            cstmt.setLong(8, anuncio.getNumeroClique());
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
    public boolean apagarAnuncio(long idAnuncio) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnuncio.apagarAnuncio(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idAnuncio);
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
    public boolean registarClique(long idAnuncio) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnuncio.registarClique(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idAnuncio);
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
    public boolean activarAnuncio(long idAnuncio) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnuncio.activarAnuncio(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idAnuncio);
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
    public boolean desactivarAnuncio(long idAnuncio) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packAnuncio.desactivarAnuncio(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idAnuncio);
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
    public boolean isLockedAnuncio(long idAnuncio) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Anuncio WHERE idAnuncio = ? AND estado='Bloqueado'");
            pst.setLong(1, idAnuncio);
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
}