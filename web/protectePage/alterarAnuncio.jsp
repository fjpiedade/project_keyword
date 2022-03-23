<%-- 
    Document   : alterarAnuncio
    Created on : 16/Ago/2012, 15:35:51
    Author     : fernandojoao
--%>

<%@page import="controle.AnuncioControle"%>
<%@page import="model.Anuncio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/estiloAll.css" />
        <script language="JavaScript" src="../js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.validate.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.maskedinput.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jqueryValidateAnuncios.js" type="text/javascript"></script>
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
                    <h4>Dados do Novo Anúncio!</h4>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="anuncios.jsp">CANCELAR</a>
                </div><!--Menu do Site -->
            </div>

            <div id="conteudoAnuncios">
                <%
                    Anuncio anuncio = new Anuncio();
                    AnuncioControle anuncioCtrl = new AnuncioControle();
                    long idAnuncio = Long.parseLong(request.getParameter("idanuncio").toString());
                    anuncio = anuncioCtrl.getAnuncio(idAnuncio);
                %>
                <form id="frmAnuncio" method="POST" action="../SeverletAlterarAnuncio?idanuncio=<% out.println(""+idAnuncio);%>">
                    <fieldset>
                        <label>
                            <span>ID</span>
                            <input type="text" name="idanuncio" disabled="true" value="<% out.println(idAnuncio);%>"/>
                        </label>
                        <label>
                            <span>Frase Promocional</span>
                            <input type="text" name="frasePromocional" value="<% out.println(anuncio.getFrasePromocional());%>"/>
                        </label>
                        <label>
                            <span>Url</span>
                            <input type="text" name="url" value="<% out.println(anuncio.getUrl());%>"/>
                        </label>
                        <label>
                            <span>Título</span>
                            <input type="text" name="titulo" value="<% out.println(anuncio.getTitulo());%>"/>
                        </label>
                        <label>
                            <span>Palavra Chave</span>
                            <input type="text" name="palavraChave" value="<% out.println(anuncio.getPalavraChave());%>"/>
                        </label>
                        <label>
                            <span>Número de Clique</span>
                            <input type="text" name="numClique" value="<% out.println(anuncio.getNumeroClique());%>"/>
                        </label>
                        <label>
                            <span>Escolha Seu Orçamento ( AKZ )</span>
                            <input type="text" name="custoClique" value="<% out.println(anuncio.getCustoClique());%>"/>
                        </label>
                        <div>
                            <input type="submit" value="Alterar Anúncio" name="criar" class="send" />
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
