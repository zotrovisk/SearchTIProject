function alteraEtapa(etapa){
  $('#tabEtapas a[href="#etapa'+etapa+'"]').tab('show');
}

function exibePopover(dica){
  $('#'+dica).popover('show');
}
function escondePopover(dica){
  $('#'+dica).popover('hide');
}
function validaFormulario(){
  let nome = $('#nome').val();
  let email = $('#email').val();
  let cidade = $('#cidade').val();
  let estado = $('#estado').val();
  let facebook = $('#facebook').val();
  let twitter = $('#twitter').val();
  if(nome == ''){
    alteraEtapa(1);
    $('#nome').focus();
    $('#nome').tooltip('show');
    setTimeout(function () {
      $('#nome').tooltip('destroy');
    }, 3000);
    return;
  }
  if(email == ''){
    alteraEtapa(1);
    $('#email').focus();
    $('#email').tooltip('show');
    setTimeout(function () {
      $('#email').tooltip('destroy');
    }, 3000);
    return;
  }
  if(cidade == ''){
    alteraEtapa(2);
    $('#cidade').focus();
    $('#cidade').tooltip('show');
    setTimeout(function () {
      $('#cidade').tooltip('destroy');
    }, 3000);
    return;
  }
  if(estado == ''){
    alteraEtapa(2);
    $('#estado').focus();
    $('#estado').tooltip('show');
    setTimeout(function () {
      $('#estado').tooltip('destroy');
    }, 3000);
    return;
  }
  if(facebook == ''){
    //alteraEtapa(3);
    $('#facebook').focus();
    $('#facebook').tooltip('show');
    setTimeout(function () {
      $('#facebook').tooltip('destroy');
    }, 3000);
    return;
  }
  if(twitter == ''){
    //alteraEtapa(3);
    $('#twitter').focus();
    $('#twitter').tooltip('show');
    setTimeout(function () {
      $('#twitter').tooltip('destroy');
    }, 3000);
    return;
  }

  console.log(nome,email,cidade,estado,facebook,twitter);
}
