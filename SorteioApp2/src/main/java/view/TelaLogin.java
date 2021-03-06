package view;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.LoginCtrl;
import model.dao.Conexao;
import model.dao.UsuarioDao;
import model.domain.Usuario;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtSenha;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
					
					Conexao.getConexao();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = txtUsuario.getText().toUpperCase(); 
				String senha = new String(txtSenha.getPassword()).toUpperCase();
				
				LoginCtrl ctrl = new LoginCtrl(TelaLogin.this);
				ctrl.login(usuario, senha);
			}
		});
		btnLogin.setBounds(45, 168, 161, 23);
		contentPane.add(btnLogin);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(45, 120, 161, 23);
		contentPane.add(txtSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(45, 48, 161, 23);
		contentPane.add(txtUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(45, 103, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(45, 31, 46, 14);
		contentPane.add(lblUsurio);
	}
}
