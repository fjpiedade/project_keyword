<%-- 
    Document   : utilizadores
    Created on : 11/Jul/2012, 22:48:20
    Author     : fernandojoao protectePageUser/
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="dao.*"%>
<%@page import="model.*"%>
<%@page import="controle.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="utilizadorBean" scope="session" class="controle.UtilizadorControle"/>
<%//@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                    <a href="criarContaUtilizador.jsp">Criar Novo Utilizador</a>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="../SeverletSairUtilizador">SAIR</a>
                </div><!--Menu do Site -->
            </div>
            <div id="conteudoAnuncios">

                <table border="1">
                    <tr>
                        <td><strong><p>#</p></strong></td><td><strong><p>ID</p></strong></td><td><strong><p>Nome Completo</p></strong></td><td><strong><p>Morada</p></strong></td><td><strong><p>Telefone</p></strong></td><td><strong><p>e-Mail</p></strong></td><td colspan="2" class="ali"><strong><p>Opções</p></strong></td>
                    </tr>
                    <%
                        UtilizadorControle listaUtilizador = new UtilizadorControle();
                        List<Utilizador> returnUtilizador = new LinkedList<Utilizador>();
                        returnUtilizador = listaUtilizador.getListOfUtilizador();
                        int i = 0;
                        while (i < returnUtilizador.size()) {
                    %>
                    <tr>
                        <td><% out.println(i + 1);%></td>
                        <td><% out.println(returnUtilizador.get(i).getIdUtilizador());%></td>
                        <td><% out.println(returnUtilizador.get(i).getNomeCompleto());%></td>
                        <td><% out.println(returnUtilizador.get(i).getMorada());%></td>
                        <td><% out.println(returnUtilizador.get(i).getTelefone());%></td>
                        <td><% out.println(returnUtilizador.get(i).getEmail());%></td>
                        <td class="ali">
                            <a href="utilizadorView.jsp?idutilizador=<% out.println(returnUtilizador.get(i).getIdUtilizador());%>">
                                Detalhes
                            </a>
                        </td>
                        <td class="ali">
                            <a href="../ServletApagarUtilizador?idutilizador=<% out.println(returnUtilizador.get(i).getIdUtilizador());%>" onclick="return confirm('Deseja Realmente Eliminar Utilizador(a)?');">
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
