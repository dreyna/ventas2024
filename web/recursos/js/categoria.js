$(document).ready(function (){
    listarCategoria();
});
function listarCategoria(){
   $.get("cc",{"opc1":1}, function (data) {
        var x = JSON.parse(data);
        //$("#tablita tbody tr").remove();
        $("#cat").append("<option value=0>Seleccionar Categoria</option>");
        for(var j = 0;j<x.length;j++){
            $("#cat").append("<option value='"+x[j].idcategorsaveProductoia+"'>"+x[j].nombre+"</option>");
        }
        
    });
}
$("#saveProducto").click(function (e){
     e.preventDefault();
    let categoria = $("#cat").val();
    let nombre = $("#nombre").val();
    let precio = $("#precio").val();
    let stock = $("#stock").val();
    $.post("pc",{"idcat":categoria,"nombre":nombre,"precio":precio,"stock":stock,"opc":2},function () {
        listarCategoria();
    });
});
