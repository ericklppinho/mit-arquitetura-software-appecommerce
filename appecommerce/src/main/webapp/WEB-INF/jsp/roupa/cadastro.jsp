<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <title>Cadastramento de Roupa</title>
        </head>

        <body>
            <c:import url="/WEB-INF/jsp/menu.jsp" />

            <div class="container mt-3">
                <h2>Roupa</h2>

                <form action="/roupa/incluir" method="post">
                    <div class="form-group">
                        <label>Marca:</label>
                        <input type="text" class="form-control" placeholder="Entre com a marca" name="marca">
                    </div>

                    <div class="form-group">
                        <label>Nome:</label>
                        <input type="text" class="form-control" placeholder="Entre com o nome" name="nome">
                    </div>

                    <div class="form-group">
                        <label>Valor:</label>
                        <input type="text" class="form-control" placeholder="Entre com o valor" name="valor">
                    </div>

                    <div class="form-group">
                        <label>Peso:</label>
                        <input type="text" class="form-control" placeholder="Entre com o peso" name="peso">
                    </div>

                    <div class="form-group">
                        <label>Tamanho:</label>
                        <input type="text" class="form-control" placeholder="Entre com o tamanho" name="tamanho">
                    </div>

                    <div class="form-group">
                        <label>Estampada:</label>
                        <input type="text" class="form-control" placeholder="É estampada?" name="estampada">
                    </div>

                    <div class="form-group">
                        <label>Cor:</label>
                        <input type="text" class="form-control" placeholder="Entre com a cor" name="cor">
                    </div>

                    <div class="form-group">
                        <label>Genero:</label>
                        <input type="text" class="form-control" placeholder="Entre com o genero" name="genero">
                    </div>

                    <button type="submit" class="btn btn-default">Cadastrar</button>
                </form>

            </div>
        </body>

        </html>