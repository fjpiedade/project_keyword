<%-- 
    Document   : utilizadorAnunciantes
    Created on : 5/Jul/2012, 23:31:09
    Author     : fernandojoao
--%>
<%@page import="model.Anunciante"%>
<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page import="controle.AnuncianteControle"%>
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
                        <td><strong><p>#</p></strong></td><td><strong><p>ID</p></strong></td><td><strong><p>Nome do Anunciante</p></strong></td><td><strong><p>Morada</p></strong></td><td><strong><p>Telefone</p></strong></td><td><strong><p>e-Mail</p></strong></td><td><strong><p>Data Criado</p></strong></td><td><strong><p>Estado</p></strong></td><td colspan="2" class="ali"><strong><p>Opções</p></strong></td>
                    </tr>
                    <%
                        AnuncianteControle listaAnunciante = new AnuncianteControle();
                        List<Anunciante> returnAnunciante = new LinkedList<Anunciante>();
                        returnAnunciante = listaAnunciante.getListOfAnunciante();
                        int i = 0;
                        while (i < returnAnunciante.size()) {
                    %>
                    <tr>
                        <td><% out.println(i + 1);%></td>
                        <td><% out.println(returnAnunciante.get(i).getIdanuciante());%></td>
                        <td><% out.println(returnAnunciante.get(i).getNomeAnunciante());%></td>
                        <td><% out.println(returnAnunciante.get(i).getMorada());%></td>
                        <td><% out.println(returnAnunciante.get(i).getTelefone());%></td>
                        <td><% out.println(returnAnunciante.get(i).getEmail());%></td>
                        <td><% out.println(returnAnunciante.get(i).getDatacriado());%></td>
                        <td><% out.println(returnAnunciante.get(i).getEstado());%></td>
                        <td class="ali">
                            <a href="utilizadorAnuncios.jsp?idAnunciante=<% out.println(returnAnunciante.get(i).getIdanuciante());%>">
                                Anúncios
                            </a>
                        </td>
                        <td class="ali">
                            <a href="../SeverletApagarAnunciante?idAnunciante=<% out.println(returnAnunciante.get(i).getIdanuciante());%>" onclick="return confirm('Deseja Realmente Apagar Anunciante e seus Anúncios?');">
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
