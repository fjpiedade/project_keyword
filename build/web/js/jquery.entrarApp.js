/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready( function() {
    $("#frmEntrar").validate({
        // Define as regras
        rules:{
            emailAnunciante:{
                // campoEmail será obrigatório (required) e precisará ser um e-mail válido (email)
                required: true, 
                email: true
            },
            senhaAnunciante:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            }
        },
        // Define as mensagens de erro para cada regra
        messages:{
            emailAnunciante:{
                required: "Digite o seu e-mail para Entrar!",
                email: "Digite um e-Mail válido para Entrar!"
            },
            senhaAnunciante:{
                required: "Digite Sua Senha de Forma Correcta!"
            }
        }
    });
    
    $("#frmEntrarUtilizador").validate({
        // Define as regras
        rules:{
            nomeUtilizador:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            senhaUtilizador:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            }
        },
        // Define as mensagens de erro para cada regra
        messages:{
            nomeUtilizador:{
                required: "Digite seu Nome de Utilizador!"
            },
            senhaUtilizador:{
                required: "Digite Sua Senha de Forma Correcta!"
            }
        }
    });
    
    $("#formSelect").validate({
        // Define as regras
        rules:{
            palavraChave:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            }
        },
        // Define as mensagens de erro para cada regra
        messages:{
            palavraChave:{
                required: "Infome um Texto para Extair Palavras Chave!"
            }
        }
    });
    
});