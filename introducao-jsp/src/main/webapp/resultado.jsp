<html>
<body>
<h2>Resultado</h2>

<% 
	String usuario = request.getParameter("usuario");
	String senha = request.getParameter("senha");

	if (usuario.equals("UNIPAR") && 
			senha.equals("UNIPAR")){
		out.println("<h1>LOGADO</h1>");
		
		session.setAttribute("usuariologado",usuario);
		
	} else {
		out.println("<h1>USU�RIO OU SENHA INV�LIDA</h1>");
	}
	
%>


</body>
</html>
