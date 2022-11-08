<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <title>Cadastramento de Eletronico</title>
        </head>

        <body>
            <c:import url="/WEB-INF/jsp/menu.jsp" />

            <div class="container mt-3">
                <h2>Eletronico</h2>

                <form action="/eletronico/incluir" method="post">
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
                        <label>Voltagem:</label>
                        <input type="text" class="form-control" placeholder="Entre com a voltagem" name="voltagem">
                    </div>

                    <div class="form-group">
                        <label>Bivolt:</label>
                        <input type="text" class="form-control" placeholder="É bivolt?" name="bivolt">
                    </div>

                    <div class="form-group">
                        <label>Altura:</label>
                        <input type="text" class="form-control" placeholder="Entre com a altura" name="altura">
                    </div>

                    <div class="form-group">
                        <label>Comprimento:</label>
                        <input type="text" class="form-control" placeholder="Entre com o comprimento"
                            name="comprimento">
                    </div>

                    <div class="form-group">
                        <label>Profundidade:</label>
                        <input type="text" class="form-control" placeholder="Entre com a profundidade"
                            name="profundidade">
                    </div>

                    <button type="submit" class="btn btn-default">Cadastrar</button>
                </form>

            </div>
        </body>

        </html>