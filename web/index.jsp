<%-- 
    Document   : index
    Created on : 30 may. 2024, 10:21:10
    Author     : ProfCisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container">
            <div>
                <h1>Ventas</h1>
                <hr>
                <div class="w-50">
                    <form>
                        <div class="mt-3">
                            <label class="fs-5 fw-bold">Categoria:</label>
                            <select class="form-select" name="cat" id="cat">

                            </select>
                        </div>
                        <div class="mt-3">
                            <label class="fs-5 fw-bold">Producto:</label>
                            <input type="text" class="form-control" id="nombre" placeholder="Producto">
                        </div>
                        <div class="mt-3">
                            <label class="fs-5 fw-bold">Precio:</label>
                            <input type="number" class="form-control" id="precio" placeholder="Prcio">
                        </div>
                        <div class="mt-3">
                            <label class="fs-5 fw-bold">Stock:</label>
                            <input type="number" class="form-control" id="stock" placeholder="Stock">
                        </div>
                        <div class="mt-3 d-grid gap-2">
                            <button type="submit" class="btn btn-success" id="saveProducto">Guardar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="container">
            <table class="table" id="tablita">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">IDPRODUCTO</th>
                        <th scope="col">PRODUCTO</th>
                        <th scope="col">PRECIO</th>
                        <th scope="col">STOCK</th>
                        <th scope="col">IDCATEGORIA</th>
                        <th scope="col">ACCION</th>
                    </tr>
                </thead>
                <tbody>                    
                </tbody>
            </table>
        </div>
    </body>

    <script src="recursos/js/jquery-3.7.1.min.js"></script>
    <script src="recursos/js/producto.js"></script>
    <script src="recursos/js/categoria.js"></script>
</html>
