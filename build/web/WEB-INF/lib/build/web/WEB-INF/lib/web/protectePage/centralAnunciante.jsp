<%-- 
    Document   : centralAnunciante
    Created on : 18/Jun/2012, 22:26:45
    Author     : fernandojoao
--%>

<%@page import="model.Anunciante"%>
<%@page import="controle.AnuncianteControle"%>
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
                    <a href="anuncios.jsp">Anuncios</a>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="../SeverletSairAnunciante">SAIR</a>
                </div><!--Menu do Site -->
            </div>

            <div id="conteudoAnuncios">
                <div id="foto">
                    <img src="../imagens/semfoto.jpg" alt="Palavra Chave" />
                </div><!--Fim do foto-->
                <div id="anuncio">
                    <%
                        Anunciante anunciante = new Anunciante();
                        AnuncianteControle anuncianteCtrl = new AnuncianteControle();
                        long idAnunciante = Long.parseLong(request.getSession().getAttribute("idAnunciante").toString());
                        anunciante = anuncianteCtrl.getAnunciante(idAnunciante);
                    %>
                    <form id="formentrar" method="POST" action="">
                        <fieldset>
                            <label>
                                <span>ID</span>
                                <input type="text" name="id" value="<% out.println(request.getSession().getAttribute("idAnunciante"));%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Nome do Anunciante</span>
                                <input type="text" name="nomeAnunciante" value="<% out.println(anunciante.getNomeAnunciante());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Morada</span>
                                <input type="text" name="morada" value="<% out.println(anunciante.getMorada());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Telefone</span>
                                <input type="text" name="telefone" value="<% out.println(anunciante.getTelefone());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>e-Mail</span>
                                <input type="text" name="email" value="<% out.println(anunciante.getEmail());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Conta Criada</span>
                                <input type="text" name="datacriada" value="<% out.println(anunciante.getDatacriado());%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Estado da Conta</span>
                                <input type="text" name="estado" value="<% out.println(anunciante.getEstado());%>" disabled="true"/>
                            </label>
                        </fieldset>
                    </form>
                </div><!--Fim do anuncio -->
            </div><!--Fim conteudoAnuncios -->

            <div id="footAcoes">
                <div id="accoes">
                    <a href="alterarAnunciante.jsp">ALTERAR CONTA</a>        
                </div><!--Menu do Site -->
                <div id="accoes">
                    <a href="alterarSenhaAnunciante.jsp">ALTERAR SENHA</a>      
                </div><!--Menu do Site -->
                <div id="accoes">
                    <a href="SeverletBloquearAnunciante" onclick="return confirm('Deseja Realmente Bloquear a Conta?');">BLOQUEAR CONTA</a>        
                </div><!--Menu do Site -->
            </div><!--Fim do footAction -->
        </div>
    </body>
</html>
