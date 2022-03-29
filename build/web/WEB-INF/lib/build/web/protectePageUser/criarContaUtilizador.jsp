<%-- 
    Document   : criarContaUtilizador
    Created on : 17/Jul/2012, 14:49:12
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
                    <a href="utilizadores.jsp">CANCELAR</a>
                </div><!--Menu do Site -->
            </div>

            <div id="conteudoAnuncios">
                <form id="formUtilizador" method="POST" action="../SeverletCriarUtilizador">
                    <fieldset>
                        <label>
                            <span>Nome Completo *</span>
                            <input type="text" id="nomeCompleto" name="nomeCompleto" />
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
                            <input type="date" id="dataNascimento" name="dataNascimento" />
                        </label>
                        <label>
                            <span>Bilhete de Identidade *</span>
                            <input type="text" id="bi" name="bi" />
                        </label>
                        <label>
                            <span>Morada *</span>
                            <input type="text" id="morada" name="morada" />
                        </label>
                        <label>
                            <span>Telefone</span>
                            <input type="text" id="telefone" name="telefone" />
                        </label>
                        <label>
                            <span>e-Mail</span>
                            <input type="text" id="email1" name="email" />
                        </label>
                        <label>
                            <span>Nome de Utilizador *</span>
                            <input type="text" id="nomeUtilizador" name="nomeUtilizador"/>
                        </label>
                        <label>
                            <span>Senha de Acesso á Conta *</span>
                            <input type="password" id="senha" name="senha"/>
                        </label>
                        <label>
                            <span>Confirmar Senha *</span>
                            <input type="password" id="senhaConfirmar" name="senhaConfirmar" equalto="#senha"/>
                        </label>
                        <div>
                            <input type="submit" value="Criar Conta" name="criar" class="send" />
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
