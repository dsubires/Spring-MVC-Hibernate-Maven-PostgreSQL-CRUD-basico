<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Página para adicionar alunos</title>
</head>
<body>
<h1>Página para adicionar alunos</h1>
<p>Aqui você pode adicionar uma nova aluno</p>
<form:form method="POST" action="${pageContext.request.contextPath}/aluno/add.html" modelAttribute="aluno">
<table>
<tbody>
	<tr>
		<td>CPF:</td>
		<td><form:input path="CPF" /></td>
	</tr>
	<tr>
		<td>Nome:</td>
		<td><form:input path="nome" /></td>
	</tr>
	<tr>
		<td>Curso:</td>
		<td><form:input path="curso" /></td>
	</tr>	
	<tr>
		<td>Endereço:</td>
		<td><form:input path="endereco" /></td>
	</tr>
	<tr>
		<td>Telefone:</td>
		<td><form:input path="telefone" /></td>
	</tr>
<!-- <tr>
		<td>Coordinador:</td>
		<td><form:input path="coordinador" /></td>
	</tr>
		<tr>
		<td>Intercambio:</td>
		<td><form:input path="intercambio" /></td>
	</tr>-->
	<tr>
		<td>Universidade:</td>
		<td>
		    <form:select path="universidade">
  		    <c:forEach var="universidade" items="${universidades}">
            	<option value="${universidade.id }">${universidade.nome }</option>                                                  
        	</c:forEach>
-->        	
			</form:select>
		</td>
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