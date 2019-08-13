package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.dao.UsuarioDao;
import model.domain.Usuario;
import view.Principal;

public class LoginCtrl {
	
	private JFrame tela;
	
	public LoginCtrl(JFrame tela) {
		this.tela = tela;
	}

	public void login(String usuario, String senha) {
		// pesquisar o usuario no banco por usuario e senha
		UsuarioDao dao = new UsuarioDao();
		Usuario usuarioConsulta = dao.login(usuario, senha);
		
		// se encontrar = abre a tela principal
		// se NÃO encontrar = abre uma mensagem e não faz login
		
		if (usuarioConsulta != null) {
			tela.dispose();
			
			Principal principal = new Principal();
			principal.setExtendedState(JFrame.MAXIMIZED_BOTH); // tela abre maximizada
			principal.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, 
					"Usuário e/ou senha inválido(s).",
					"Atenção!",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
