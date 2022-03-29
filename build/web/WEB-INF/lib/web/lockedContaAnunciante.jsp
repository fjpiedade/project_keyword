<%-- 
    Document   : lockedContaAnunciante
    Created on : 14/Ago/2012, 13:32:59
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
                <h4>Conta de Anunciante Bloqueada</h4>
         
                <div id="formulario">
                    <%    
                        out.println("<span class=\"no\">Lamentamos, mas esta Conta de Anunciante Esta Bloqueada</span>");
                        out.println("\n<span class=\"no\">Para Activa-la informe os Dados da Conta Abaixo e Prima Activar!</span>");
                    %>
                    <form id="frmAnuncianteEntrar" method="POST" action="SeverletActivarAnunciante">
                        <fieldset>
                            <label>
                                <span>e-Mail do Anunciante</span>
                                <input type="text" name="emailAnunciante" />
                            </label>
                            <label>
                                <span>Senha do Anunciante</span>
                                <input type="password" name="senhaAnunciante"/>
                            </label>
                            <input type="submit" value="Activar" name="activar" class="send" />
                        </fieldset>
                    </form> 
                    <h2><a href="index.jsp">Voltar no Index</a></h2>
                </div><!--Fim do Formulario -->
                
            </div><!--Fim do Corpo -->
            
        </div><!--Fim do Principal -->
        
    </body>
</html>