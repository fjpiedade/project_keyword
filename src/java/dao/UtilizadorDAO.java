package dao;
import java.beans.Statement;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import model.Utilizador;
/**
 *
 * @author fernandojoao
 */
public class UtilizadorDAO extends ConeccaoDB {
    private Connection con;

    public UtilizadorDAO(Connection con) {
        this.con = con;
    }    
    public UtilizadorDAO() throws ClassNotFoundException, SQLException{
        this.con=getMyConeccao();
    }
    public boolean isValidUsernameAndPassword(String nomeUtilizador,String senhaUtilizador) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Utilizador WHERE nomeUtilizador = ? AND senhaUtilizador = ?");
            pst.setString(1, nomeUtilizador);
            pst.setString(2, senhaUtilizador);
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
    private Utilizador getUtilizadorFromSQL(ResultSet rs) throws SQLException {
        Utilizador returnUtilizador = new Utilizador();
        returnUtilizador.setIdUtilizador(Long.parseLong(rs.getString("idUtilizador")));
        returnUtilizador.setBi(rs.getString("bi"));
        returnUtilizador.setNomeUtilizador(rs.getString("nomeUtilizador"));
        returnUtilizador.setSenhaUtilizador(rs.getString("senhaUtilizador"));
        returnUtilizador.setDataCriado(rs.getString("datacriado"));
        returnUtilizador.setNomeCompleto(rs.getString("nomecompleto"));
        returnUtilizador.setSexo(rs.getString("sexo"));
        returnUtilizador.setDataNascimento(rs.getString("datanascimento"));
        returnUtilizador.setTelefone(rs.getString("telefone"));
        returnUtilizador.setMorada(rs.getString("morada"));
        returnUtilizador.setEmail(rs.getString("email"));
        return returnUtilizador;
    }
    public Utilizador getUtilizador(long idUtilizador) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Utilizador WHERE idUtilizador = ?");
            pst.setLong(1, idUtilizador);
            rs=pst.executeQuery();
            if(rs.next()){
                Utilizador utilizador= getUtilizadorFromSQL(rs);
                return utilizador;
            }
        }finally{
            pst.close();
            rs.close();
        }
        return null;
    }
    public long getUtilizadorID(String nomeUtilizador) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            java.sql.Statement st= con.createStatement();
            rs = st.executeQuery("SELECT idutilizador FROM utilizador WHERE nomeutilizador ='"+nomeUtilizador+"'");
            if(rs.next()){
                return rs.getLong(1);
            }
        }finally{
            con.close();
        }
        return 0;
    }
    public List<Utilizador> getListOfUtilizador() throws SQLException {
        List<Utilizador> returnUtilizador = new LinkedList<Utilizador>();
        java.sql.Statement st=null;
        ResultSet rs=null;
        try{
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM utilizador ORDER BY idutilizador");
            
            while(rs.next()){
                returnUtilizador.add(getUtilizadorFromSQL(rs));
            }
        }finally{
            st.close();
            rs.close();
        }
        return returnUtilizador;
    }
    public boolean inserirUtilizador(Utilizador utilizador) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packUtilizador.inserirUtilizador(?,?,?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setString(2,utilizador.getBi());
            cstmt.setString(3,utilizador.getNomeUtilizador());
            cstmt.setString(4,utilizador.getSenhaUtilizador());
            cstmt.setString(5,utilizador.getNomeCompleto());
            cstmt.setString(6,utilizador.getSexo());
            cstmt.setString(7,utilizador.getDataNascimento());
            cstmt.setString(8,utilizador.getTelefone());
            cstmt.setString(9,utilizador.getMorada());
            cstmt.setString(10,utilizador.getEmail());
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
    public boolean alterarUtilizador(Utilizador utilizador) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packUtilizador.alterarUtilizador(?,?,?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2,utilizador.getIdUtilizador());
            cstmt.setString(3,utilizador.getBi());
            cstmt.setString(4, utilizador.getNomeUtilizador());
            cstmt.setString(5,utilizador.getNomeCompleto());
            cstmt.setString(6,utilizador.getSexo());
            cstmt.setString(7,utilizador.getDataNascimento());
            cstmt.setString(8,utilizador.getTelefone());
            cstmt.setString(9,utilizador.getMorada());
            cstmt.setString(10,utilizador.getEmail());
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
    public boolean alterarSenhaUtilizador(long idUtilizador,String newSenhaUtilizador) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packUtilizador.alterarSenhaUtilizador(?,?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2, idUtilizador);
            cstmt.setString(3, newSenhaUtilizador);
            
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
    public boolean apagarUtilizador(long idUtilizador) throws SQLException{
        CallableStatement cstmt = null;
        try{
            cstmt=con.prepareCall("{?=call packUtilizador.apagarUtilizador(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setLong(2,idUtilizador);
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
    public boolean isValidBiUtilizador(String biUtilizador) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Utilizador WHERE bi = ?");
            pst.setString(1, biUtilizador);
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
    public boolean isValidTelefoneUtilizador(String telefoneUtilizador) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Utilizador WHERE telefone = ?");
            pst.setString(1, telefoneUtilizador);
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
    public boolean isValidNomeUtilizador(String nomeUtilizador) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Utilizador WHERE nomeUtilizador = ?");
            pst.setString(1, nomeUtilizador);
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
    public boolean isValidEmailUtilizador(String emailUtilizador) throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            pst=con.prepareStatement("SELECT * FROM Utilizador WHERE email = ?");
            pst.setString(1, emailUtilizador);
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