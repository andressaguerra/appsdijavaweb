<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>App SDI</title>
</head>
<body>

	<div class="container">
		<a href="/">Voltar</a>
		<h2>Tela de Cadastro</h2>
		<form action="/pessoa/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label>
				<input type="text" class="form-control" placeholder="Insira o seu nome" name="nome">
			</div>
	    
			<div class="form-group">
				<label>E-mail:</label>
				<input type="email" class="form-control" placeholder="Insira o seu e-mail" name="email">
			</div>
			
			<div class="form-group">
				<label>Salário:</label>
				<input type="text" class="form-control" placeholder="Insira o seu salário" name="salario">
			</div>
			
			<div class="form-group">
				<label>Meses:</label>
				<input type="text" class="form-control" placeholder="Insira a quantidade de meses" name="qtdeMeses">
			</div>
	    
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>