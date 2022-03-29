<%-- 
    Document   : anuncios
    Created on : 17/Jul/2012, 14:56:49
    Author     : fernandojoao
--%>

<%@page import="controle.AnuncioControle"%>
<%@page import="com.sun.corba.se.impl.naming.cosnaming.InterOperableNamingImpl"%>
<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page import="dao.AnuncioDAO"%>
<%@page import="model.Anuncio"%>
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
        <link rel="stylesheet" type="text/css" href="../css/estiloAll.css" />
        <title>.::Palavra Chave::.</title>
    </head>
    <body>
        <div id="topAll">
            Central de Anunciante - [ <strong><a href="centralAnunciante.jsp"><% out.println(request.getSession().getAttribute("nomeAnunciante"));%></a></strong> ] [ Bem - Vindo ]
            <div id="logoTipo">
                <a href="../index.jsp">
                    <img src="../imagens/logoTypeMix.png" alt="Palavra Chave" />
                </a>
            </div><!--Fim Logotipo -->
        </div>

        <div id="espacoAll">

        </div>

        <div id="corpoAll">

            <div id="menu_base">
                <div id="menu">
                    <a href="centralAnunciante.jsp">Inicio</a>
                    <a href="criarAnuncio.jsp">Criar Novo Anúncio</a>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="../SeverletSairAnunciante">SAIR</a>
                </div><!--Menu do Site -->
            </div>

            <div id="conteudoAnuncios">

                <table border="1">
                    <tr>
                        <td><strong><p>#</p></strong></td><td><strong><p>ID</p></strong></td><td><strong><p>Frase Promocional</p></strong></td><td><strong><p>Url</p></strong></td><td><strong><p>Título</p></strong></td><td><strong><p>Palavra Chave</p></strong></td><td><strong><p>Custo</p></strong></td><td><strong><p># Cliques Válido</p></strong></td><td><strong><p>Estado</p></strong></td><td><strong><p>Data</p></strong></td><td colspan="2" class="ali"><strong><p>Opções</p></strong></td>
                    </tr>
                    <%
                        long idAnunciante = (Long) request.getSession().getAttribute("idAnunciante");
                        AnuncioControle listaNum = new AnuncioControle();
                        long numLinha = listaNum.getAnuncioNum(idAnunciante);

                        AnuncioControle listaAnuncio = new AnuncioControle();
                        List<Anuncio> returnAnuncio = new LinkedList<Anuncio>();
                        returnAnuncio = listaAnuncio.getListOfAnuncioAnunciante(idAnunciante);
                        int i = 0;
                        while (i < numLinha) {
                    %>
                    <tr>
                        <td><% out.println(i+1);%></td>
                        <td><% out.println(returnAnuncio.get(i).getIdAnuncio());%></td>
                        <td><% out.println(returnAnuncio.get(i).getFrasePromocional());%></td>
                        <td><% out.println(returnAnuncio.get(i).getUrl());%></td>
                        <td><% out.println(returnAnuncio.get(i).getTitulo());%></td>
                        <td><% out.println(returnAnuncio.get(i).getPalavraChave());%></td>
                        <td><% out.println(returnAnuncio.get(i).getCustoClique());%></td>
                        <td><% out.println(returnAnuncio.get(i).getNumCliqueValido());%></td>
                        <td><% out.println(returnAnuncio.get(i).getEstado());%></td>
                        <td><% out.println(returnAnuncio.get(i).getDataCriado());%></td>
                        <td class="ali">
                            <a href="alterarAnuncio.jsp?idanuncio=<% out.println("" + returnAnuncio.get(i).getIdAnuncio());%>">
                                Alterar
                            </a>
                        </td>
                        <td class="ali">
                            <%
                                if (returnAnuncio.get(i).getEstado().equals("Activo")) {
                                    out.println("<a href=\"../SeverletBloquearAnuncio?idanuncio="+ returnAnuncio.get(i).getIdAnuncio() +"\" onclick=\"return confirm(\'Deseja Realmente Bloquear o Anúncio?\');\">Bloquear</a>");
                                } else {
                                    out.println("<a href=\"../SeverletActivarAnuncio?idanuncio="+ returnAnuncio.get(i).getIdAnuncio() +"\" onclick=\"return confirm(\'Deseja Realmente Activar o Anúncio?\');\">Activar</a>");
                                }
                            %>
                        </td>
                    </tr>
                    <%
                            i++;
                        }
                    %>
                </table>
            </div><!--fim do Conteudo de Anuncios -->
        </div>
    </body>
</html>
