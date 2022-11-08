<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <title>Cadastramento de Roupas</title>
        </head>

        <body>
            <c:import url="/WEB-INF/jsp/menu.jsp" />

            <div class="container mt-3">
                <h3>Roupas: ${listagem.size()}</h3>

                <h4><a href="/roupa">Nova Roupa</a></h4>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Marca</th>
                            <th>Nome</th>
                            <th>Valor</th>
                            <th>Peso</th>

                            <th>Tamanho</th>
                            <th>Cor</th>
                            <th>Genero</th>
                            <th>Estampada</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="r" items="${listagem}">
                            <tr>
                                <td>${r.codigo}</td>
                                <td>${r.marca}</td>
                                <td>${r.nome}</td>
                                <td>${r.valor}</td>
                                <td>${r.peso}</td>

                                <td>${r.tamanho}</td>
                                <td>${r.cor}</td>
                                <td>${r.genero}</td>
                                <td>${r.estampada}</td>
                                <td><a href="/roupa/${r.codigo}/excluir">excluir</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </body>

        </html>