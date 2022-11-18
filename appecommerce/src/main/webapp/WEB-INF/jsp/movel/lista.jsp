<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <title>Cadastramento de Moveis</title>
        </head>

        <body>
            <c:import url="/WEB-INF/jsp/menu.jsp" />

            <div class="container mt-3">
                <h3>Moveis: ${listagem.size()}</h3>

                <h4><a href="/movel">Novo Movel</a></h4>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Marca</th>
                            <th>Nome</th>
                            <th>Valor</th>
                            <th>Peso</th>

                            <th>Material</th>
                            <th>Espelho</th>
                            <th>Altura</th>
                            <th>Comprimento</th>
                            <th>Profundidade</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="m" items="${listagem}">
                            <tr>
                                <td>${m.codigo}</td>
                                <td>${m.marca}</td>
                                <td>${m.nome}</td>
                                <td>${m.valor}</td>
                                <td>${m.peso}</td>

                                <td>${m.material}</td>
                                <td>${m.espelho}</td>
                                <td>${m.altura}</td>
                                <td>${m.comprimento}</td>
                                <td>${m.profundidade}</td>
                                <td><a href="/movel/${m.codigo}/excluir">excluir</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </body>

        </html>