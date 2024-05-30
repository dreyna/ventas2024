$(document).ready(function (){
    listar();
});
function listar(){
    $.get("pc",{"opcion":1}, function (data) {
        var x = JSON.parse(data);
        $("#tablita tbody tr").remove(); 
        for(var i = 0;i<x.length;i++){
            $("#tablita").append("<tr><td>"+(i+1)+"</td><td>"+x[i].idproducto+"</td><td>"+x[i].nombre+"</td><td>"+x[i].precio+"</td><td>"+x[i].stock+"</td><td>"+x[i].idcategoria+"</td><td><a href='#' onclick='editar("+x[i].idr+")'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar("+x[i].idr+")'><i class='fas fa-trash-alt'></i></a></td></tr>");
        }
    });
}