<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" />
<title>Lista de universidades</title>
</head>
<body>
<h1>Lista de universidades</h1>
<p>Aqui você pode ver a lista de universidades, editá-las, removê-las ou atualizá-las.</p>
<table class="table" border="1px" cellpadding="0" cellspacing="0" >
<thead class="thead-dark">
<tr>
<th width="10%">id</th><th width="15%">nome</th><th width="15%">telefone</th><th width="15%">endereço</th><th width="15%">país</th><th width="15%">idioma</th><th width="10%">actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="universidade" items="${universidades}">
<tr>
	<td>${universidade.id}</td>
	<td>${universidade.nome}</td>
	<td>${universidade.telefone}</td>
	<td>${universidade.endereco}</td>
	<td>${universidade.pais}</td>
	<td>${universidade.idioma}</td>
	<td>
	<a href="${pageContext.request.contextPath}/universidade/edit/${universidade.id}.html">Editar</a><br/>
	<a href="${pageContext.request.contextPath}/universidade/delete/${universidade.id}.html">Deletar</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a class="btn btn-primary"href="${pageContext.request.contextPath}/index.html">Voltar</a></p>

</body>
</html>