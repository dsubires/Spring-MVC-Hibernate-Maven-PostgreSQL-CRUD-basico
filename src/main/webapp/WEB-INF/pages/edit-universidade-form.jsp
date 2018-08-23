<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>P�gina para editar universidade</title>
</head>
<body>
<h1>P�gina para editar universidade</h1>
<p>Aqui pode editar a universidade existente</p>
<p>${message}</p>
<form:form method="POST" action="${pageContext.request.contextPath}/universidade/edit/${universidade.id}.html" modelAttribute="universidade">
<table>
<tbody>
	<tr>
		<td>Nome:</td>
		<td><form:input path="nome" /></td>
	</tr>
	<tr>
		<td>Telefone:</td>
		<td><form:input path="telefone" /></td>
	</tr>
		<tr>
		<td>Endere�o:</td>
		<td><form:input path="endereco" /></td>
	</tr>
		<tr>
		<td>Pa�s:</td>
		<td><form:input path="pais" /></td>
	</tr>
		<tr>
		<td>Idioma:</td>
		<td><form:input path="idioma" /></td>
	</tr>
	<tr>
		<td><input type="submit" value="Edit" /></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>

<p><a href="${pageContext.request.contextPath}/index.html">Voltar</a></p>
</body>
</html>