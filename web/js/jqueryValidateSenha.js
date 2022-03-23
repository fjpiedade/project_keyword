/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready( function() {
    $("#frmSenha").validate({
        // Define as regras
        rules:{
            beforSenha:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            newSenha:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            senhaConfirmar:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true,
                equalTo: newSenha
            }
        },
        // Define as mensagens de erro para cada regra
        messages:{
            beforSenha:{
                required: "Digite a Senha de Acesso Antiga!"
            },
            newSenha:{
                required: "Digite a Nova Senha de Acesso!"
            },
            senhaConfirmar:{
                required: "Digite a Confirmação da sua Senha de Acesso!",
                equalTo: "Digite uma Senha de Acesso Identica a Nova!"
            }
        }
    }); 
});

