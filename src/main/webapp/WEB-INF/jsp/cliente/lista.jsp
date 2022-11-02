<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
            <title>Cadastramento de Clientes</title>
        </head>

        <body>
            <div class="container mt-3">
                <h3>Clientes: ${listagem.size()}</h3>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Nome</th>
                            <th>CPF</th>
                            <th>E-mail</th>
                            <th>Endereco</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="c" items="${listagem}">
                            <tr>
                                <td>${c.codigo}</td>
                                <td>${c.nome}</td>
                                <td>${c.cpf}</td>
                                <td>${c.email}</td>
                                <td>${c.endereco}</td>
                                <td><a href="/cliente/${c.codigo}/excluir">excluir</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </body>

        </html>