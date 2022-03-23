<%-- 
    Document   : utilizador
    Created on : 18/Jun/2012, 22:07:58
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
                <h1>Bem-vindo ao Anúncio por Palavra Chave</h1>
                <h4>Entra na Sua Conta de Utilizador, para gerir Aplicação</h4>
                <div id="formulario">
                    <form id="frmEntrarUtilizador" method="POST" action="SeverletEntrarUtilizador">
                        <fieldset>
                            <label for="nomeUtilizador">
                                <span>Nome do Utilizador *</span>
                                <input type="text" id="nomeUtilizador" name="nomeUtilizador" />
                            </label>
                            <label for="senhaUtilizador">
                                <span>Senha do Utilizador *</span>
                                <input type="password" id="senhaUtilizador" name="senhaUtilizador"/>
                            </label>
                            <input type="submit" value="Entrar" name="entrar" class="send" />
                        </fieldset>
                    </form>
                    <h2><a href="index.jsp"> Não Consegue Acessar Sua Conta</a></h2> <h3><a href="index.jsp">Voltar aos Anunciantes</a></h3>
                </div><!--Fim do Formulario -->
            </div><!--Fim do Corpo -->
        </div><!--Fim do Principal -->
        
        
    </body>
</html>
