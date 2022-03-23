/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controle.AnuncianteControle;
import controle.AnuncioControle;
import controle.UtilizadorControle;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import model.Anunciante;
import model.Anuncio;
import model.Utilizador;
import oracle.sql.DATE;

/**
 *
 * @author fernandojoao
 */
public class TesteUtilizador {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        
         Utilizador user=new Utilizador(); UtilizadorDAO ctrl=new
         UtilizadorDAO();
         
         user.setBi("000107031LA030"); 
         user.setNomeUtilizador("fe");
         user.setSenhaUtilizador("fe"); 
         user.setNomeCompleto("Fernando Joao"); 
         user.setSexo("Masculino");
         user.setDataNascimento("09/04/1988"); 
         user.setTelefone("923947627");
         user.setMorada("Luanda-Viana"); 
         user.setEmail("fernandp.joao@gmail.com");
         boolean resultado = ctrl.inserirUtilizador(user);
         System.out.println("Result Add User "+resultado);
         
         /**
         * Anunciante user1=new Anunciante(); AnuncianteControle
         * ctrlAnunciante=new AnuncianteControle();
         * user1.setNomeAnunciante("Microsoft"); user1.setMorada("New York,
         * EUA"); user1.setTelefone("888999222");
         * user1.setEmail("microsoft@hotmail.com");
         * user1.setSenhaAnunciante("2"); user1.setEstado("Activa"); boolean
         * resultado11=ctrlAnunciante.inserirAnunciante(user1);
         * System.out.println("Result Add Publisher "+resultado11);
         * AnuncianteDAO ctrl1=new AnuncianteDAO(); String resultado1 =
         * ctrl1.getAnuncianteNome("microsoft@hotmail.com");
         *
         * AnuncianteDAO ctrl2=new AnuncianteDAO(); long resultado2 =
         * ctrl2.getAnuncianteID("microsoft@hotmail.com");
         *
         * System.out.println("Result Search Publisher "+resultado1+" ID
         * "+resultado2); Anuncio user1=new Anuncio();
         *
         *
         * AnuncioControle ctrlAnuncio=new AnuncioControle();
         * user1.setFrasePromocional("Microsoft");
         * user1.setUrl("www.msn.com/could"); user1.setTitulo("Could Computer");
         * user1.setPalavraChave("B"); user1.setCustoClique(200.09);
         * user1.setNumeroClique(5); user1.setNumCliqueValido(5);
         * user1.setIdAnunciante(2); user1.setEstado("Activo"); boolean
         * resultado11=ctrlAnuncio.inserirAnuncio(user1);
         * System.out.println("Result Add Publisher Insert = "+resultado11);
         *
         * AnuncioControle ctrlAnuncio=new AnuncioControle(); long
         * resultado11=ctrlAnuncio.getAnuncioNum(2); System.out.println("Result
         * Add Publisher Count = "+resultado11);
         *
         *
         * AnuncioControle anuncio = new AnuncioControle(); Anuncio pub=new
         * Anuncio(); pub=anuncio.getAnuncio(3); System.out.println("\n" +
         * pub.getIdAnuncio()); System.out.println("\n" +
         * pub.getFrasePromocional()); System.out.println("\n" + pub.getUrl());
         *
         *
         * AnuncioControle listaNum = new AnuncioControle(); long numLinha =
         * listaNum.getAnuncioNum(2); AnuncioControle listaAnuncio = new
         * AnuncioControle(); List<Anuncio> returnAnuncio =
         * listaAnuncio.getListOfAnuncioAnunciante(2); int i = 1; while (i <=
         * numLinha) { System.out.println("" +
         * returnAnuncio.get(i).getIdAnuncio()); System.out.println("" +
         * returnAnuncio.get(i).getFrasePromocional()); System.out.println("" +
         * returnAnuncio.get(i).getUrl()); i++; } AnuncioControle listaAnuncio =
         * new AnuncioControle(); List<Anuncio> returnAnuncio =
         * listaAnuncio.getListOfAnuncio(); int i = 0; while (i < 1) {
         * System.out.println("" + returnAnuncio.get(i).getIdAnuncio());
         * System.out.println("" + returnAnuncio.get(i).getFrasePromocional());
         * System.out.println("" + returnAnuncio.get(i).getUrl()); i++; }
         *
         *
         * AnuncianteControle ctrl2=new AnuncianteControle();
         * System.out.println("\nO Result is >> Bloquear " +
         * ctrl2.bloquearConta(2)); //System.out.println("\nO Result is Activar
         * >> " + ctrl2.activarConta(2)); System.out.println("\nO Result is
         * Locked >> " + ctrl2.isLockedAnunciante(2)); System.out.println("\nO
         * Result is e-Mail >> " +
         * ctrl2.isValidEmailAnunciante("microsoft@hotmail.com"));
         * System.out.println("\nO Result is Telefone >> " +
         * ctrl2.isValidTelefoneAnunciante("923947627"));
         *
         * long te=999; System.out.println("<a
         * href=\"SeverletBloquearAnuncio?idanuncio="+ te +"\" onclick=\"return
         * confirm(\'Deseja Realmente Bloquear o Anúncio?\');\">Bloquear</a>");
         *
         * Utilizador user=new Utilizador(); UtilizadorControle ctrl=new
         * UtilizadorControle();
         *
         * user.setBi("000107031LA032"); user.setNomeUtilizador("esdras");
         * user.setSenhaUtilizador("esdras"); user.setNomeCompleto("Esdras
         * Cristiano"); user.setSexo("Masculino");
         * user.setDataNascimento("16/05/2009"); user.setTelefone("923947123");
         * user.setMorada("Luanda-Popular"); user.setEmail("esdras@gmail.com");
         * boolean resultado = ctrl.inserirUtilizador(user);
         * System.out.println("Result Add User "+resultado); AnuncianteControle
         * ctrl2=new AnuncianteControle(); System.out.println("\nO Result is >>
         * Existe " + ctrl2.isThereAnuncio(64));
         */


        /*
        Connection con;
        Statement st;
        ResultSet rs;

       
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "palavrachave", "palavrachave");
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //rs = st.executeQuery("SELECT * FROM anuncio WHERE ROWNUM <=6 ORDER BY idanuncio");
            st.executeUpdate("DECLARE begin ctx_ddl.sync_index('indexPalavra', '2M'); end;");
            //rs = st.executeQuery("SELECT * FROM anuncio WHERE MATCHES(palavrachave,'" + request.getParameter("palavraChave") + "')>0 AND numCliqueValido>0 AND estado='Activo' AND ROWNUM <=6 ORDER BY idanuncio");
            rs = st.executeQuery("SELECT idanunciante, SUM(custoclique) AS SOMA FROM anuncio WHERE  MATCHES(palavrachave,'A B C D E F G H I J K L M N O P Q R S T U V X Z')>0 AND numCliqueValido>0 GROUP BY idanunciante ORDER BY SUM(custoclique) DESC, idanunciante");

            List<Object> returnAnunciante = new LinkedList<Object>();

            int j = 0;
            while (rs.next()) {
                if (j < 6) {
                    returnAnunciante.add(rs.getString("idanunciante"));
                    //System.out.println("Result Add User "+rs.getString("idanunciante"));
                }
                j = j + 1;
            }
            
            rs.close();
            con.close();
            
            
            //rs = st.executeQuery("SELECT * FROM anuncio WHERE ROWNUM <=6 ORDER BY idanuncio");
                        
            int k=0;
            while(k<returnAnunciante.size()){
                Class.forName("oracle.jdbc.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "palavrachave", "palavrachave");
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                st.executeUpdate("DECLARE begin ctx_ddl.sync_index('indexPalavra', '2M'); end;");
                rs = st.executeQuery("SELECT * FROM anuncio WHERE  MATCHES(palavrachave,'A B C D E F G H I J K L M N O P Q R S T U V X Z')>0 AND numCliqueValido>0 AND idanunciante = "+Long.parseLong(returnAnunciante.get(k).toString())+" AND ROWNUM <=1 ORDER BY custoclique DESC, numcliquevalido DESC, idanuncio");

                if(rs.next())
                    System.out.println("Result Add User "+rs.getString("idanuncio"));
                
                k++;
            }
            */
    }
}
