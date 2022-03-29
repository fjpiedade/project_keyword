<%-- 
    Document   : utilizadorView
    Created on : 17/Jul/2012, 13:26:06
    Author     : fernandojoao
--%>

<%@page import="controle.UtilizadorControle"%>
<%@page import="model.Utilizador"%>
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
                    <a href="utilizadores.jsp">Voltar</a>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="../SeverletSairUtilizador">SAIR</a>
                </div><!--Menu do Site -->
            </div>
            
            <div id="conteudoAnuncios">
                <div id="foto">
                    <img src="../imagens/semfoto.jpg" alt="Palavra Chave" />
                </div><!--Fim do foto-->
                <div id="anuncio">
                    <%
                        Utilizador utilizador = new Utilizador();
                        UtilizadorControle utilizadorCtrl = new UtilizadorControle();
                        long idUtilizador = Long.parseLong(request.getParameter("idutilizador").toString());
                        utilizador = utilizadorCtrl.getUtilizador(idUtilizador);
                    %>
                    <form id="formentrar" method="POST" action="">
                        <fieldset>
                            <label>
                                <span>ID</span>
                                <input type="text" name="nomeCompleto" value="<% out.println(utilizador.getIdUtilizador());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Nome Completo</span>
                                <input type="text" name="nomeCompleto" value="<% out.println(utilizador.getNomeCompleto());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Género</span>
                                <input type="text" name="genero" value="<% out.println(utilizador.getSexo());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Data de Nascimento</span>
                                <input type="text" name="dataNascimento" value="<% out.println(utilizador.getDataNascimento());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Bilhete de Identidade</span>
                                <input type="text" name="bi" value="<% out.println(utilizador.getBi());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Morada</span>
                                <input type="text" name="morada" value="<% out.println(utilizador.getMorada());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Telefone</span>
                                <input type="text" name="telefone" value="<% out.println(utilizador.getTelefone());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>e-Mail</span>
                                <input type="text" name="email" value="<% out.println(utilizador.getEmail());%>" disabled="true"/>
                            </label>
                        </fieldset>
                    </form>
                </div><!--Fim do anuncio -->
            </div><!-- Fim do conteudoAll -->
        </div>
    </body>
</html>