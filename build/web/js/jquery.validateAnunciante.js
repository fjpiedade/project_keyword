/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready( function() {
    $("#frmAnunciante").validate({
        // Define as regras
        rules:{
            nomeAnunciante:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            morada:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            email:{
                // campoEmail será obrigatório (required) e precisará ser um e-mail válido (email)
                email: true,
                required: true
            },
            senha:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            senhaConfirmar:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true,
                equalTo: senha
            }
        },
        // Define as mensagens de erro para cada regra
        messages:{
            nomeAnunciante:{
                required: "Digite o seu Nome de Anunciante!"
            },
            morada:{
                required: "Digite Sua Morada!"
            },
            email:{
                email: "Digite um e-Mail válido!",
                required: "Digite Seu E-mail é Necessário!"
            },
            senha:{
                required: "Digite sua Senha de Anunciante!"
            },
            senhaConfirmar:{
                required: "Digite a Confirmação da sua Senha de Anunciante!",
                equalTo: "Digite uma Senha que Coincida!"
            }
        }
    });
    
    $("#telefone").mask("999 999-999");
    
});

