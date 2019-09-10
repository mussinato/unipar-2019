package introducao.jsp.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/restrito/*")
public class TesteFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse resp, 
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpServletRequest request = (HttpServletRequest) req;
		
		// Obter um objeto da sessao
		String usuarioLogado = (String) request.getSession()
				.getAttribute("usuariologado");
		
		// Liberar acesso a tela
		if (usuarioLogado != null && !usuarioLogado.equals("")) {
			chain.doFilter(req, resp);
		} else {
			//redireciona para outra pagina
			response.sendRedirect("../login.jsp");			
		}
	}

}
