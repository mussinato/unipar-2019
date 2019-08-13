package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.dao.UsuarioDao;
import model.domain.Usuario;
import view.TelaUsuario;

public class UsuarioCtrl {

	private TelaUsuario tela;
	
	public UsuarioCtrl(TelaUsuario tela) {
		this.tela = tela;
	}
	
	public void salvar(Usuario usuario) {
		try {
			if (usuario.getUsuario() == null || usuario.getUsuario().equals("")) {
				throw new Exception("O usu�rio � obrigat�rio.");
			}
			if (usuario.getSenha() == null || usuario.getSenha().equals("")) {
				throw new Exception("A senha � obrigat�ria.");
			}
			
			UsuarioDao dao = new UsuarioDao();
			
			Usuario verificaUK = dao.buscarPorUsuario(usuario.getUsuario());
			if (verificaUK != null) {
				throw new Exception("J� existe um usu�rio cadastrado "
						+ "com o mesmo nome.");
			}
			
			usuario = dao.salvar(usuario);
			
			tela.getModelo().addRow(new Object[] {usuario.getCodigo(),
					usuario.getUsuario()});
			
			JOptionPane.showMessageDialog(null, "Usu�rio salvo com sucesso.");
			
			tela.getBtnNovo().setEnabled(true);
			tela.getBtnSalvar().setEnabled(false);
			tela.getBtnCancelar().setEnabled(false);
			
			tela.getTxtCodigo().setText(null);
			tela.getTxtUsuario().setText(null);
			tela.getTxtSenha().setText(null);
			
			tela.getTxtCodigo().setEnabled(false);
			tela.getTxtUsuario().setEnabled(false);
			tela.getTxtSenha().setEnabled(false);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}
}
