<%-- 
    Document   : criarContaAnunciante
    Created on : 18/Jun/2012, 22:08:43
    Author     : fernandojoao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estiloAll.css" />
        <script language="JavaScript" src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script language="JavaScript" src="js/jquery.validate.js" type="text/javascript"></script>
        <script language="JavaScript" src="js/jquery.maskedinput.js" type="text/javascript"></script>
        <script language="JavaScript" src="js/jquery.validateAnunciante.js" type="text/javascript"></script>
        <title>.::Palavra Chave::.</title>
    </head>
    <body>
        <div id="topAll">
            Criar Conta de Anunciantes!
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
                    <h4>Dados da Conta do Anunciante!</h4>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="index.jsp">CANCELAR</a>
                </div><!--Menu do Site -->
            </div>
            <div id="conteudoAnuncios">
                <form id="frmAnunciante" method="POST" action="SeverletCriarAnunciante">
                    <fieldset>
                        <div>
                            <label for="nomeAnunciante">
                                <span>Nome do Anunciante *</span>
                                <input type="text" id="nomeAnunciante" name="nomeAnunciante" />
                            </label>
                        </div>
                        <div>
                            <label for="morada">
                                <span>Morada *</span>
                                <input type="text" id="morada" name="morada" />
                            </label>
                        </div>
                        <div>
                            <label for="telefone">
                                <span>Telefone</span>
                                <input type="text" id="telefone" name="telefone" maxlength="14" tabindex="10" value=""/>
                            </label>
                        </div>
                        <div>
                            <label for="email">
                                <span>e-Mail do Anunciante *</span>
                                <input type="text" id="email" name="email" />
                            </label>
                        </div>
                        <div>
                            <label for="senha">
                                <span> Senha do Anunciante *</span>

                                <input type="password" id="senha" name="senha"/>
                            </label>
                        </div>
                        <div>
                            <label for="senhaConfirmar">
                                <span>Confirmar Senha *</span>
                                <input type="password" id="senhaConfirmar" name="senhaConfirmar" equalto="#senha"/>
                            </label>
                        </div>
                        <div>
                            <input type="submit" value="Criar Conta" id="criarAnunciante" name="criarAnunciante" class="send"/>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
