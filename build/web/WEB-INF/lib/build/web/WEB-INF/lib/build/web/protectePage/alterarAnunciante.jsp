<%-- 
    Document   : alterarAnunciante
    Created on : 10/Ago/2012, 22:35:21
    Author     : fernandojoao
--%>

<%@page import="controle.AnuncianteControle"%>
<%@page import="model.Anunciante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estiloAll.css" />
        <script language="JavaScript" src="../js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.validate.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.maskedinput.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.validateAnunciante.js" type="text/javascript"></script>
        <title>.::Palavra Chave::.</title>
    </head>
    <body>
        <div id="topAll">
            Alterar Conta de Anunciantes!
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
                    <h4>Alterar Conta do Anunciante!</h4>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="centralAnunciante.jsp">CANCELAR</a>
                </div><!--Menu do Site -->
            </div>
            
            <div id="conteudoAnuncios">
                    <%
                        Anunciante anunciante = new Anunciante();
                        AnuncianteControle anuncianteCtrl = new AnuncianteControle();
                        long idAnunciante = Long.parseLong(request.getSession().getAttribute("idAnunciante").toString());
                        anunciante = anuncianteCtrl.getAnunciante(idAnunciante);
                    %>
                    <form id="frmAnunciante" method="POST" action="../SeverletAlterarAnunciante">
                        <fieldset>
                            <label>
                                <span>ID</span>
                                <input type="text" name="idAnunciante" id="idAnunciante" value="<% out.println(request.getSession().getAttribute("idAnunciante"));%>" disabled="true"/>
                            </label>
                            <label>
                                <span>Nome do Anunciante</span>
                                <input type="text" name="nomeAnunciante" id="nomeAnunciante" value="<% out.println(anunciante.getNomeAnunciante());%>"/>
                            </label>
                            <label>
                                <span>Morada</span>
                                <input type="text" name="morada" id="morada" value="<% out.println(anunciante.getMorada());%>"/>
                            </label>
                            <label>
                                <span>Telefone</span>
                                <input type="text" name="telefone" id="telefone" value="<% out.println(anunciante.getTelefone());%>"/>
                            </label>
                            <label>
                                <span>e-Mail</span>
                                <input type="text" name="email" id="email" value="<% out.println(anunciante.getEmail());%>"/>
                            </label>
                            <div>
                                <input type="submit" value="Alterar Conta" name="alterarAnunciante" class="send" />
                            </div>
                        </fieldset>
                    </form>
            </div>
        </div>
    </body>
</html>
