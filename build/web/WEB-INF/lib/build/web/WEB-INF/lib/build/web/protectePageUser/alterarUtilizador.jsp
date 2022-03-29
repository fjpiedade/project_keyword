<%-- 
    Document   : alterarUtilizador
    Created on : 16/Ago/2012, 22:31:05
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
        <script language="JavaScript" src="../js/jquery-1.7.1.min.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.validate.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.maskedinput.js" type="text/javascript"></script>
        <script language="JavaScript" src="../js/jqueryvalidateUsers.js" type="text/javascript"></script>
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
                    <h4>Dados da Conta do Utilizador!</h4>
                </div><!--Menu do Site -->
                <div id="menu1">
                    <a href="centralUtilizador.jsp">CANCELAR</a>
                </div><!--Menu do Site -->
            </div>
            <div id="conteudoAnuncios">
                <%
                        Utilizador utilizador = new Utilizador();
                        UtilizadorControle utilizadorCtrl = new UtilizadorControle();
                        long idUtilizador = Long.parseLong(request.getSession().getAttribute("idUtilizador").toString());
                        utilizador = utilizadorCtrl.getUtilizador(idUtilizador);
                    %>
                <form id="formUtilizador" method="POST" action="../SeverletAlterarUtilizador?idutilizador=<% out.println(idUtilizador);%>">
                    <fieldset>
                        <label>
                            <span>ID</span>
                            <input type="text" id="idUtilizador" name="idUtilizador" value="<% out.println(idUtilizador);%>" disabled="true"/>
                        </label>
                        <label>
                            <span>Nome Completo *</span>
                            <input type="text" id="nomeCompleto" name="nomeCompleto" value="<% out.println(utilizador.getNomeCompleto());%>"/>
                        </label>
                        <label>
                            <span>Género *</span>
                            <select id="genero" name="genero" class="combos">
                                <option value="Masculino">Masculino</option>
                                <option value="Feminino">Feminino</option>
                            </select>
                        </label>
                        <label>
                            <span>Data de Nascimento *</span>
                            <input type="text" id="dataNascimento" name="dataNascimento" value="<% out.println(utilizador.getDataNascimento());%>"/>
                        </label>
                        <label>
                            <span>Bilhete de Identidade *</span>
                            <input type="text" id="bi" name="bi" value="<% out.println(utilizador.getBi());%>"/>
                        </label>
                        <label>
                            <span>Morada *</span>
                            <input type="text" id="morada" name="morada" value="<% out.println(utilizador.getMorada());%>"/>
                        </label>
                        <label>
                            <span>Telefone</span>
                            <input type="text" id="telefone" name="telefone" value="<% out.println(utilizador.getTelefone());%>"/>
                        </label>
                        <label>
                            <span>e-Mail</span>
                            <input type="text" id="email1" name="email" value="<% out.println(utilizador.getEmail());%>"/>
                        </label>
                        <label>
                            <span>Nome de Utilizador *</span>
                            <input type="text" id="nomeUtilizador" name="nomeUtilizador" value="<% out.println(utilizador.getNomeUtilizador());%>"/>
                        </label>
                        <div>
                            <input type="submit" value="Alterar Conta" name="criar" class="send" />
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
