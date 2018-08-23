<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Página para adicionar universidades</title>
</head>
<body>
<h1>Página para adicionar universidades</h1>
<p>Aqui você pode adicionar uma nova universidade</p>
<form:form method="POST" action="${pageContext.request.contextPath}/universidade/add.html" modelAttribute="universidade">
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
		<td>Endereço:</td>
		<td><form:input path="endereco" /></td>
	</tr>
		<tr>
		<td>País:</td>
		<td><form:input path="pais" /></td>
	</tr>
		<tr>
		<td>Idioma:</td>
		<td><form:input path="idioma" /></td>
	</tr>
	<tr>
		<td><input type="submit" value="Adicionar" /></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>

<p><a href="${pageContext.request.contextPath}/index.html">Voltar</a></p>
</body>
</html>