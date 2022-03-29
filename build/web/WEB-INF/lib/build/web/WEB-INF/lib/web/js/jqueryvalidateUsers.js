/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready( function() {
    $("#formUtilizador").validate({
        // Define as regras
        rules:{
            nomeCompleto:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            dataNascimento:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            genero:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            bi:{
                // campoEmail será obrigatório (required) e precisará ser um e-mail válido (email)
                required: true
            },
            morada:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            telefone:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                requerid:false
            },
            email1:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                email: true
            },
            nomeUtilizador:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            senha:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            senhaConfirmar:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true,
                equalTo:senha
            }
        },
        // Define as mensagens de erro para cada regra
        messages:{
            nomeCompleto:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite o seu Nome Completo!"
            },
            dataNascimento:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Selecione a sua Data de Nascimento!"
            },
            genero:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Selecione o seu Genero Sexual!"
            },
            bi:{
                // campoEmail será obrigatório (required) e precisará ser um e-mail válido (email)
                required: "Digite o seu Número do Bilhete de Identidade!"
            },
            morada:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite a sua Morada!"
            },
            telefone:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                
            },
            email1:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                email: "Digite um Correio Electrônico Válido!"
            },
            nomeUtilizador:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite o seu Nome de Utilizador!"
            },
            senha:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite a sua Senha de Acesso!"
            },
            senhaConfirmar:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite a Confirmação da sua Senha de Acesso!",
                equalTo: "Digite uma Senha Identica a sua Senha de Acesso!"
            }
        }
    });
    
    $("#telefone").mask("999 999-999");
    $("#bi").mask("999999999aa999");
    
});

