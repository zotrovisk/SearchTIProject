function alteraEtapa(etapa){
  $('#tabEtapas a[href="#etapa'+etapa+'"]').tab('show');
}

function exibePopover(dica){
  $('#'+dica).popover('show');
}
function escondePopover(dica){
  $('#'+dica).popover('hide');
}
