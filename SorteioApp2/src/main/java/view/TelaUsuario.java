package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.UsuarioCtrl;
import model.dao.UsuarioDao;
import model.domain.Usuario;

public class TelaUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	private JButton btnSalvar;
	private JButton btnCancelar;
	private JButton btnNovo;
	
	private void atualizarLista() {
		UsuarioDao dao = new UsuarioDao();
		List<Usuario> usuarios = dao.buscarTodos();
		
		modelo.setNumRows(0); // limpa a tabela
		
		for (Usuario u : usuarios) {
			modelo.addRow(new Object[] {u.getCodigo(),u.getUsuario()});
		}
	}
	

	/**
	 * Create the frame.
	 */
	public TelaUsuario() {
		setResizable(false);
		setTitle("Cadastro de Usu�rio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		txtCodigo.setBounds(84, 31, 64, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 34, 56, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblNewLabel = new JLabel("Usuario *");
		lblNewLabel.setBounds(10, 59, 56, 14);
		contentPane.add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setEnabled(false);
		txtUsuario.setBounds(84, 56, 153, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha *");
		lblSenha.setBounds(10, 84, 46, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setEnabled(false);
		txtSenha.setBounds(84, 81, 153, 20);
		contentPane.add(txtSenha);
		
		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNovo.setEnabled(false);
				btnSalvar.setEnabled(true);
				btnCancelar.setEnabled(true);
				
				txtCodigo.setEnabled(true);
				txtUsuario.setEnabled(true);
				txtSenha.setEnabled(true);
			}
		});
		btnNovo.setBounds(0, 0, 89, 23);
		contentPane.add(btnNovo);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setEnabled(false);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = txtCodigo.getText();
				String usuario = txtUsuario.getText();
				String senha = new String(txtSenha.getPassword());
					
				Usuario user = new Usuario();
				user.setUsuario(usuario);
				user.setSenha(senha);
				
				UsuarioCtrl ctrl = new UsuarioCtrl(TelaUsuario.this);
				ctrl.salvar(user);
			}
		});
		btnSalvar.setBounds(99, 0, 89, 23);
		contentPane.add(btnSalvar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNovo.setEnabled(true);
				btnSalvar.setEnabled(false);
				btnCancelar.setEnabled(false);
				
				txtCodigo.setText(null);
				txtUsuario.setText(null);
				txtSenha.setText(null);
				
				txtCodigo.setEnabled(false);
				txtUsuario.setEnabled(false);
				txtSenha.setEnabled(false);
			}
		});
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(198, 0, 89, 23);
		contentPane.add(btnCancelar);
		
		modelo.addColumn("C�digo");
		modelo.addColumn("Usu�rio");
		
		tabela = new JTable(modelo);
		
		// Evita editar a grid com 2 cliques
		tabela.setDefaultEditor(Object.class, null);
		
		JScrollPane scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(0, 120, 444, 313);
		contentPane.add(scrollPane);
		
		atualizarLista();
		
	}


	public JTextField getTxtCodigo() {
		return txtCodigo;
	}


	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}


	public JTextField getTxtUsuario() {
		return txtUsuario;
	}


	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}


	public JPasswordField getTxtSenha() {
		return txtSenha;
	}


	public void setTxtSenha(JPasswordField txtSenha) {
		this.txtSenha = txtSenha;
	}


	public DefaultTableModel getModelo() {
		return modelo;
	}


	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}


	public JButton getBtnSalvar() {
		return btnSalvar;
	}


	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}


	public JButton getBtnCancelar() {
		return btnCancelar;
	}


	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}


	public JButton getBtnNovo() {
		return btnNovo;
	}


	public void setBtnNovo(JButton btnNovo) {
		this.btnNovo = btnNovo;
	}
	
	
}
