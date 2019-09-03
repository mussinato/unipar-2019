<html>
<body>
<h2>Hello World!</h2>
<h3><% out.println("Unipar"); %></h3>

<form method="post" action="consultarCep">
	<input type="text" name="cep" />
	<button type="submit">Consultar</button>
</form>

<br/>

Último CEP pesquisado: <%= session.getAttribute("ultimo_cep") %>

</body>
</html>
