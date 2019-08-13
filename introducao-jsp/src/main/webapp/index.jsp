<%
	String aula = "Padrões e Frameworks";    
%>

<html>
<body>
<h2>Hello World!</h2>
<h3><% out.println("Unipar"); %></h3>
Aula: <%= aula %>
<br/><br/>
<% 
	for (int i = 0; i<10; i++){
		out.println("Numero: <b>"+i+"</b><br/>");
	}
%>
</body>
</html>
