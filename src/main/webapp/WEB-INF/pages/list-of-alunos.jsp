<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" />
<title>Lista de alunos</title>
</head>
<body>
<h1>Lista de alunos</h1>
<p>Aqui você pode ver a lista de alunos, editá-los, removê-los ou atualizá-los.</p>
<table class="table" border="1px" cellpadding="0" cellspacing="0" >
<thead class="thead-dark">
<tr>
<th width="15%">cpf</th><th width="15%">nome</th><th width="15%">curso</th><th width="15%">endereço</th><th width="15%">telefone</th><th width="15%">universidade</th><th width="15%">coordinador</th><th width="15%">intercambio</th><th width="10%">actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="aluno" items="${alunos}">
<tr>
	<td>${aluno.CPF}</td>
	<td>${aluno.nome}</td>
	<td>${aluno.curso}</td>
	<td>${aluno.endereco}</td>
	<td>${aluno.telefone}</td>
	<c:forEach var="uni" items="${universidades}">
	 <c:if test="${aluno.universidade == uni.id}">
	 	<td>${uni.nome}</td>
	 </c:if>
	</c:forEach>
	<td>${aluno.coordinador}</td>
	<td>${aluno.intercambio}</td>
	<td>
	<a href="${pageContext.request.contextPath}/aluno/edit/${aluno.CPF}.html">Editar</a><br/>
	<a href="${pageContext.request.contextPath}/aluno/delete/${aluno.CPF}.html">Deletar</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a class="btn btn-primary" href="${pageContext.request.contextPath}/index.html">Voltar</a></p>

</body>
</html>