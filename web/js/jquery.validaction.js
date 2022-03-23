/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    //$("#conteudoAnuncios").hide();
    $("#criarAnunciante").click(function(){
       $('#conteudoAnuncios').attr('Title', 'Cadastrar Anuncian').dialog({width:550,
           closeOnEscape: false, draggable: false, resizable: false, show:'fade',modal:true});
    });
    var form= $("#criarContaAnunciante") ;
    var nomeAnunciante=$("#nomeAnunciante");
    var nomeAnuncianteInfo=$("#nomeAnuncianteInfo");
    var morada=$("#morada");
    var moradaInfo=$("#moradaInfo");
    var telefone=$("#telefone");
    var telefoneInfo=$("#telefoneInfo");
    var email=$("#email");
    var emailInfo=$("#emailInfo");
    var senha=$("#senha");
    var senhaInfo=$("#senhaInfo");
    var senhaConfirmar=$("#senhaConfirmar");
    var senhaConfirmarInfo=$("#senhaConfirmarInfo");
    var state=false;
   
    nomeAnunciante.keyup(validateNomeAnunciante());
    
    function validateNomeAnunciante(){
        if(nomeAnunciante.val().length<=4){
            nomeAnunciante.removeClass('valid');
            nomeAnuncianteInfo.removeClass('valid');
            nomeAnunciante.addClass('error');
            nomeAnuncianteInfo.addClass('error');
            nomeAnuncianteInfo.text("Infome por favor um Nome com pelo menos 4 Caracteres!");
            state=false;
        }else{
            nomeAnunciante.removeClass('error');
            nomeAnuncianteInfo.removeClass('error');
            nomeAnunciante.addClass('valid');
            nomeAnuncianteInfo.addClass('valid');
            nomeAnuncianteInfo.text("Nome do Anunciante Correcto!");
            state=true;
        }
        return state;
    }
    
    $("#criarAnunciante").click(function(){
        var all=$("form").serialize();
        if(validateNomeAnunciante()==true){
            $.ajax({
                type: "POST",
                url: "",
                data: all,
                success: function(data){
                    if(data!=0){
                        alert("Sucesso! You Have Restri...");
                    }else{
                        alert("Check your Erros");
                    }
                }
            });
        }else{
            alert("Check your Erros");
        }
    });
    
    $("input.telefone").mask("(999) 999-9999");
    
});

