/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready( function() {
    $("#frmAnuncio").validate({
        // Define as regras
        rules:{
            frasePromocional:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            url:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            titulo:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true
            },
            palavraChave:{
                // campoEmail será obrigatório (required) e precisará ser um e-mail válido (email)
                required: true
            },
            numClique:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true,
                digits:true
            },
            custoClique:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: true,
                number:true
            }
        },
        // Define as mensagens de erro para cada regra
        messages:{
            frasePromocional:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite uma Frase Promocional para o Seu Anúncio!"
            },
            url:{
                // campoNome será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite uma Url para o seu Anúncio!"
            },
            titulo:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite o Titulo do Anúncio!"
            },
            palavraChave:{
                // campoEmail será obrigatório (required) e precisará ser um e-mail válido (email)
                required: "Digite uma Palavra Chave!"
            },
            numClique:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite o Número de Cliques Inicial!",
                digits:"Digite apenas Digitos!"
            },
            custoClique:{
                // campoMensagem será obrigatório (required) e terá tamanho mínimo (minLength)
                required: "Digite o Custo por Clique Desejavel!",
                number:"Digite apenas Número!"
            }
        }
    });
    
    //$("#numClique").mask("999999");
    //$("#custoClique").mask("999.999");
    
});
