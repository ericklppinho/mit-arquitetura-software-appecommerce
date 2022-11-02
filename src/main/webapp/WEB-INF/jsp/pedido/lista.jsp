<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
            <title>Cadastramento de Pedidos</title>
        </head>

        <body>
            <div class="container mt-3">
                <h3>Pedidos: ${listagem.size()}</h3>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Cogigo</th>
                            <th>Status</th>
                            <th>Data</th>
                            <th>Cliente</th>
                            <th>Produtos</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="p" items="${listagem}">
                            <tr>
                                <td>${p.codigo}</td>
                                <td>${p.status}</td>
                                <td>${p.data}</td>
                                <td>${p.cliente.nome}</td>
                                <td>${p.produtos.size()}</td>
                                <td><a href="/pedido/${p.codigo}/excluir">excluir</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </body>

        </html>