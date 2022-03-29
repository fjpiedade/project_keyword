<%-- 
    Document   : utilizadorAllAnuncios
    Created on : 16/Ago/2012, 22:33:56
    Author     : fernandojoao
--%>

<%@page import="model.Anuncio"%>
<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page import="controle.AnuncioControle"%>
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
            Central de Utilizador - [ <strong><a href="centralUtilizador.jsp"><% out.println(request.getSession().getAttribute("nomeUtilizador"));%></a></strong> ] [ Administrador(a) ]
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
                    <a href="centralUtilizador.jsp">Inicio</a>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="../SeverletSairUtilizador">SAIR</a>
                </div><!--Menu do Site -->
            </div>

            <div id="conteudoAnuncios">
                <table border="1">
                    <tr>
                        <td><strong><p>#</p></strong></td><td><strong><p>ID</p></strong></td><td><strong><p>Frase Promocional</p></strong></td><td><strong><p>Url</p></strong></td><td><strong><p>Título</p></strong></td><td><strong><p>Palavra Chave</p></strong></td><td><strong><p>Custo</p></strong></td><td><strong><p># Cliques</p></strong></td><td><strong><p># Válido</p></strong></td><td><strong><p>Estado</p></strong></td><td><strong><p>Data</p></strong></td><td colspan="2" class="ali"><strong><p>Opções</p></strong></td>
                    </tr>
                    <%
                        AnuncioControle listaAnuncio = new AnuncioControle();
                        List<Anuncio> returnAnuncio = new LinkedList<Anuncio>();
                        returnAnuncio = listaAnuncio.getListOfAnuncio();
                        int i = 0;
                        while (i < returnAnuncio.size()) {
                    %>
                    <tr>
                        <td><% out.println(i + 1);%></td>
                        <td><% out.println(returnAnuncio.get(i).getIdAnuncio());%></td>
                        <td><% out.println(returnAnuncio.get(i).getFrasePromocional());%></td>
                        <td><% out.println(returnAnuncio.get(i).getUrl());%></td>
                        <td><% out.println(returnAnuncio.get(i).getTitulo());%></td>
                        <td><% out.println(returnAnuncio.get(i).getPalavraChave());%></td>
                        <td><% out.println(returnAnuncio.get(i).getCustoClique());%></td>
                        <td><% out.println(returnAnuncio.get(i).getNumeroClique());%></td>
                        <td><% out.println(returnAnuncio.get(i).getNumCliqueValido());%></td>
                        <td><% out.println(returnAnuncio.get(i).getEstado());%></td>
                        <td><% out.println(returnAnuncio.get(i).getDataCriado());%></td>
                        <td class="ali">
                            <%
                                if (returnAnuncio.get(i).getEstado().equals("Activo")) {
                                    out.println("<a href=\"../SeverletBloquearAllAnuncio?idanuncio=" + returnAnuncio.get(i).getIdAnuncio() + "\" onclick=\"return confirm(\'Deseja Realmente Bloquear o Anúncio?\');\">Bloquear</a>");
                                } else {
                                    out.println("<a href=\"../SeverletActivarAllAnuncio?idanuncio=" + returnAnuncio.get(i).getIdAnuncio() + "\" onclick=\"return confirm(\'Deseja Realmente Activar o Anúncio?\');\">Activar</a>");
                                }
                            %>
                        </td>
                        <td class="ali">
                            <a href="../SeverletApagarAllAnuncio?idanuncio=<% out.println(returnAnuncio.get(i).getIdAnuncio());%>" onclick="return confirm('Deseja Realmente Eliminar Anúncio?');">
                                Eliminar
                            </a>
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