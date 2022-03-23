<%-- 
    Document   : activarAnuncianteMsn
    Created on : 14/Ago/2012, 14:36:47
    Author     : fernandojoao
--%>

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
                <h1>Bem-vindo de Volta ao Anúncio por Palavra Chave</h1>
                <h4>Conta de Anunciante Activada</h4>
         
                <div id="formulario">
                    <%  
                        out.println("\n<span class=\"yes\">Conta do Anunciante Activada!</span>");
                        out.println("\n<span class=\"yes\">Para Accessar a sua Conta Informe os Dados da Conta Abaixo e Prima Entrar!</span>");
                    %>
                    <form id="frmEntrar" method="POST" action="SeverletEntrarAnunciante">
                        <fieldset>
                            <label>
                                <span>e-Mail do Anunciante</span>
                                <input type="text" name="emailAnunciante" />
                            </label>
                            <label>
                                <span>Senha do Anunciante</span>
                                <input type="password" name="senhaAnunciante"/>
                            </label>
                            <input type="submit" value="Entrar" name="entrar" class="send" /> <h1>ou <a href="criarContaAnunciante.jsp">Criar Sua Conta de Anunciante</a></h1>
                        </fieldset>
                    </form> 
                    <h2><a href="seleccao.jsp">Selecção de Anúncios</a></h2> <h3><a href="entrarUtilizador.jsp">Utilizadores</a></h3>
                </div><!--Fim do Formulario -->
                
            </div><!--Fim do Corpo -->
        </div><!--Fim do Principal -->
        
    </body>
</html>
