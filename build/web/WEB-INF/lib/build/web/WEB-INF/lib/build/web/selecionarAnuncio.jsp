<%-- 
    Document   : selecionarAnuncio
    Created on : 18/Jun/2012, 22:11:25
    Author     : fernandojoao
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloAll.css" />
        <title>.::Palavra Chave::.</title>
    </head>
    <body>
        <div id="topAll">

            Selecionar Anúncios!
            <div id="logoTipo">
                <a href="index.jsp">
                    <img src="imagens/logoTypeMix.png" alt="Palavra Chave" />
                </a>
            </div><!--Fim Logotipo -->
        </div>

        <div id="espacoAll">

        </div>

        <div id="corpoAll">
            <div id="menu_base">
                <div id="menu">
                    <label>
                        <input type="text" disabled="true" name="nome" value="<% out.println(request.getParameter("palavraChave"));%>" />
                    </label>
                    <!--<input type="submit" value="Seleccionar" name="seleccionar" class="send" />-->
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="seleccao.jsp"> VOLTAR </a>
                </div><!--Menu do Site -->
            </div>

            <div id="conteudoAnuncios">
                <%
                    Connection con;
                    Statement st;
                    ResultSet rs;

                    try {

                        Class.forName("oracle.jdbc.OracleDriver");
                        con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "palavrachave", "palavrachave");
                        st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                        //rs = st.executeQuery("SELECT * FROM anuncio WHERE ROWNUM <=6 ORDER BY idanuncio");
                        st.executeUpdate("DECLARE begin ctx_ddl.sync_index('indexPalavra', '2M'); end;");
                        //rs = st.executeQuery("SELECT * FROM anuncio WHERE MATCHES(palavrachave,'" + request.getParameter("palavraChave") + "')>0 AND numCliqueValido>0 AND estado='Activo' AND ROWNUM <=6 ORDER BY idanuncio");
                        rs = st.executeQuery("SELECT idanunciante, SUM(custoclique) AS SOMA FROM anuncio WHERE  MATCHES(palavrachave,'" + request.getParameter("palavraChave") + "')>0 AND numCliqueValido>0 GROUP BY idanunciante ORDER BY SUM(custoclique) DESC, idanunciante");
                        
                        List<Object> returnAnunciante = new LinkedList<Object>();
                        boolean achou=false;
                        
                        int j=0;
                        while (rs.next()) {
                                if(j<6){
                                    returnAnunciante.add(rs.getString("idanunciante"));
                                }
                                j=j+1;
                            }
                        
                        
                        int k=0;
                        while(k<returnAnunciante.size()){
                                returnAnunciante.get(k);
                                rs = st.executeQuery("SELECT * FROM anuncio WHERE  MATCHES(palavrachave,'A B C D E F G H I J K L M N O P Q R S T U V X Z')>0 AND numCliqueValido>0 AND idanunciante = "+Long.parseLong(returnAnunciante.get(k).toString())+" AND ROWNUM <=1 ORDER BY custoclique DESC, numcliquevalido DESC, idanuncio");
                                if(rs.next()){
                                achou=true;
                      
                %>
                <div id="anuncio">
                    <p><% out.println(k+1);%> ° Anúncio</p>
                    <h1><% out.println("" + rs.getString("titulo"));%></h1>
                    <h2><% out.println("" + rs.getString("frasepromocional"));%></h2>
                    <h3><a href="SeverletRegistarAnuncio?idanuncio=<% out.println(rs.getString("idanuncio"));%>"><% out.println(rs.getString("url"));%></a></h3>
                </div><!--fim da div Anuncio -->
                <%   
                    }
                    k++;
                }
                        
                        //out.println("<span class=\"yes\">Login Efectuado Com Sucesso!</span>");

                        //else
                        //  out.println("<span class=\"no\">Nome ou Senha do Utilizador Inválida!</span>");
                        if (!achou) {
                            out.println("<span class=\"no\">Não foi Encontrado Nenhum Anúncio refente ao Texto!</span>");

                        }
                    } catch (ClassNotFoundException errorCNF) {
                        out.println("<span class=\"no\">Houve Erro de Driver = " + errorCNF + ".</span>");
                    } catch (SQLException errorSQL) {
                        out.println("<span class=\"no\">Houve Erro na Conexão com a BD = " + errorSQL + ".</span>");
                    }
                %>
            </div><!--fim do Conteudo de Anuncios -->
        </div><!-- fim de Todo Corpo -->
    </body>
</html>
