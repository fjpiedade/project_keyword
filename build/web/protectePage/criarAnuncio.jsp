<%-- 
    Document   : criarAnuncio
    Created on : 18/Jul/2012, 12:14:41
    Author     : fernandojoao
--%>

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
                <form id="frmAnuncio" method="POST" action="../SeverletCriarAnuncio">
                    <fieldset>
                        <label>
                            <span>Frase Promocional *</span>
                            <input type="text" id="frasePromocional" name="frasePromocional"/>
                        </label>
                        <label>
                            <span>Url *</span>
                            <input type="text" id="url" name="url"/>
                        </label>
                        <label>
                            <span>Título *</span>
                            <input type="text" id="titulo" name="titulo"/>
                        </label>
                        <label>
                            <span>Palavra Chave *</span>
                            <input type="text" id="palavraChave" name="palavraChave"/>
                        </label>
                        <label>
                            <span>Número de Clique *</span>
                            <input type="text" id="numClique" name="numClique" />
                        </label>
                        <label>
                            <span>Escolha Seu Orçamento ( AKZ ) *</span>
                            <input type="text" id="custoClique" name="custoClique"/>
                        </label>
                        <div>
                            <input type="submit" value="Criar Anúncio" name="criar" class="send" />
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>