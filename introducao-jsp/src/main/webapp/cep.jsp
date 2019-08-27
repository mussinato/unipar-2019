<%@ page import="com.github.gilbertotorrezan.viacep.se.ViaCEPClient" %>
<%@ page import="com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco" %>
<html>
<body>
<h2>CEP</h2>

<% 
	String cep = request.getParameter("cep");

	if (cep != null){
		out.println("Consultando cep "+cep+"<br/><br/>");
		
		ViaCEPClient client = new ViaCEPClient();
		ViaCEPEndereco endereco = client.getEndereco(cep);
		
		if (endereco != null){
			out.println("Endereço: "+endereco.getLogradouro()+"<br/>");
			out.println("Bairro: "+endereco.getBairro()+"<br/>");
			out.println("Complemento: "+endereco.getComplemento()+"<br/>");
			out.println("Cidade: "+endereco.getLocalidade()+"<br/>");
			out.println("UF: "+endereco.getUf());
			
			session.setAttribute("ultimo_cep",cep);
		} else {
			out.println("Cep não encontrado!");
		}
	}
%>


</body>
</html>
