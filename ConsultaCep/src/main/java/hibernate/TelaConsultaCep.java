package hibernate;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaConsultaCep extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtUf;

	public TelaConsultaCep() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		setSize(445, 236);
		
		txtCep = new JTextField();
		txtCep.setBounds(108, 11, 86, 20);
		getContentPane().add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setBounds(43, 13, 55, 16);
		getContentPane().add(lblCep);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(108, 42, 316, 20);
		getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblEnderelo = new JLabel("Endere\u00E7o");
		lblEnderelo.setBounds(43, 44, 55, 16);
		getContentPane().add(lblEnderelo);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(108, 73, 316, 20);
		getContentPane().add(txtComplemento);
		txtComplemento.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(19, 75, 79, 16);
		getContentPane().add(lblComplemento);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(108, 104, 316, 20);
		getContentPane().add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setBounds(43, 106, 55, 16);
		getContentPane().add(lblBairro);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(108, 135, 316, 20);
		getContentPane().add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCidade.setBounds(43, 137, 55, 16);
		getContentPane().add(lblCidade);
		
		txtUf = new JTextField();
		txtUf.setBounds(108, 166, 86, 20);
		getContentPane().add(txtUf);
		txtUf.setColumns(10);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUf.setBounds(43, 168, 55, 16);
		getContentPane().add(lblUf);
		
		JButton btnBuscarCep = new JButton("Buscar CEP");
		btnBuscarCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViaCEPClient client = new ViaCEPClient();
				try {
					ViaCEPEndereco endereco = client.getEndereco(txtCep.getText());
					
					if (endereco == null) {
						throw new Exception("CEP não encontrado!");
					}
					
					txtEndereco.setText(endereco.getLogradouro());
					txtBairro.setText(endereco.getBairro());
					txtCidade.setText(endereco.getLocalidade());
					txtComplemento.setText(endereco.getComplemento());
					txtUf.setText(endereco.getUf());					
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnBuscarCep.setBounds(204, 8, 118, 26);
		getContentPane().add(btnBuscarCep);
	}

}
