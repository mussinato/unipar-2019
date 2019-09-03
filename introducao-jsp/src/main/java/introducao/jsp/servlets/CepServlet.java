package introducao.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

@WebServlet("/consultarCep")
public class CepServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String cep = req.getParameter("cep");

		out.println("<html>");
		out.println("<body>");
		
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
				
				req.getSession().setAttribute("ultimo_cep",cep);
			} else {
				out.println("Cep não encontrado!");
				resp.sendRedirect("index.jsp");
			}
			
			out.println("</body>");
			out.println("</html>");
		}
	}
}
