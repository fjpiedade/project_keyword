<%-- 
    Document   : seleccao
    Created on : 28/Jul/2012, 19:28:06
    Author     : fernandojoao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilo.css" />
        <script language="JavaScript" src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script language="JavaScript" src="js/jquery.validate.js" type="text/javascript"></script>
        <script language="JavaScript" src="js/jquery.maskedinput.js" type="text/javascript"></script>
        <script language="JavaScript" src="js/jquery.entrarApp.js" type="text/javascript"></script>
        <title>.::Palavra Chave::.</title>
    </head>
    <body>
        <div id="topAll">

            Anúncio por Palavra Chave!
            <div id="logoTipo">
                <a href="index.jsp">
                    <img src="imagens/logoTypeMix.png" alt="Palavra Chave" />
                </a>
            </div><!--Fim Logotipo -->
        </div>
        <div id="principal">

            <div id="corpo">
                <h1>Selecção de Anúncios por Palavra Chave</h1>

                <div id="menuS">
                    <form id="formSelect" method="POST" action="selecionarAnuncio.jsp">
                        <input type="text" id="palavraChave" name="palavraChave" placeholder='Infome um Texto para Extair Palavras Chave' />
                        <input type="submit" value="Seleccionar" name="seleccionar" class="send" />
                    </form> 
                </div><!--Fim do Formulario -->
                <div id="menuA">
                    <a href="index.jsp">Voltar no Início</a>
                </div>
            </div><!--Fim do Corpo -->

        </div><!--Fim do Principal -->

    </body>
</html>
