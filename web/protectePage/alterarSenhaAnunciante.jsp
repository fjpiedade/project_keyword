<%-- 
    Document   : alterarSenhaAnunciante
    Created on : 16/Ago/2012, 14:15:18
    Author     : fernandojoao
--%>

<%@page import="controle.AnuncianteControle"%>
<%@page import="model.Anunciante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/estiloAll.css" />
        <script language="JavaScript" src="../js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.validate.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.maskedinput.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jqueryValidateSenha.js" type="text/javascript"></script>
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
                    <h4>Alterar Senha da Conta do Anunciante!</h4>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="centralAnunciante.jsp">CANCELAR</a>
                </div><!--Menu do Site -->
            </div>

            <div id="conteudoAnuncios">
                <form id="frmSenha" method="POST" action="../SeverletAlterarSenhaAnunciante">
                    <fieldset>
                        <label>
                            <span>ID</span>
                            <input type="text" id="idAnunciante" name="idAnunciante" value="<% out.println(request.getSession().getAttribute("idAnunciante"));%>" disabled="true"/>
                        </label>
                        <label>
                            <span>Senha Antiga da Conta</span>
                            <input type="password" id="beforSenha" name="beforSenha"/>
                        </label>
                        <label>
                            <span>Nova Senha da Conta</span>
                            <input type="password" id="newSenha" name="newSenha"/>
                        </label>
                        <label>
                            <span>Confirmar Nova Senha</span>
                            <input type="password" id="senhaConfirmar" name="senhaConfirmar" equalto="#newSenha"/>
                        </label>
                        <div>
                            <input type="submit" value="Alterar Senha" name="alterarAnunciante" class="send" />
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
