<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
            <title>Cadastramento de Eletronicos</title>
        </head>

        <body>
            <div class="container mt-3">
                <h3>Eletronicos: ${listagem.size()}</h3>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Marca</th>
                            <th>Nome</th>
                            <th>Valor</th>
                            <th>Peso</th>

                            <th>Voltagem</th>
                            <th>Bivolt</th>
                            <th>Altura</th>
                            <th>Comprimento</th>
                            <th>Profundidade</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="e" items="${listagem}">
                            <tr>
                                <td>${e.codigo}</td>
                                <td>${e.marca}</td>
                                <td>${e.nome}</td>
                                <td>${e.valor}</td>
                                <td>${e.peso}</td>

                                <td>${e.voltagem}</td>
                                <td>${e.bivolt}</td>
                                <td>${e.altura}</td>
                                <td>${e.comprimento}</td>
                                <td>${e.profundidade}</td>
                                <td><a href="/eletronico/${e.codigo}/excluir">excluir</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </body>

        </html>