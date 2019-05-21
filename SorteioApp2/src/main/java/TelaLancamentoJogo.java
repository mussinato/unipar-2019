import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLancamentoJogo extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNumeros;
	private JComboBox txtTipoJogo;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnCancelar;
	private JTextField textField;
	

	/**
	 * Create the frame.
	 */
	public TelaLancamentoJogo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 34, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblTipoDoJogo = new JLabel("Tipo do Jogo");
		lblTipoDoJogo.setBounds(10, 59, 74, 14);
		contentPane.add(lblTipoDoJogo);
		
		JLabel lblNumeros = new JLabel("Numeros");
		lblNumeros.setBounds(10, 84, 63, 14);
		contentPane.add(lblNumeros);
		
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		txtCodigo.setBounds(92, 31, 56, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtTipoJogo = new JComboBox();
		txtTipoJogo.setEnabled(false);
		txtTipoJogo.setBounds(92, 55, 140, 22);
		contentPane.add(txtTipoJogo);
		
		txtNumeros = new JTextField();
		txtNumeros.setEnabled(false);
		txtNumeros.setBounds(92, 81, 140, 20);
		contentPane.add(txtNumeros);
		txtNumeros.setColumns(10);
		
		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
				desabilitaCampos(false);
				btnNovo.setEnabled(false);
				btnSalvar.setEnabled(true);
				btnCancelar.setEnabled(true);
			}
		});
		btnNovo.setBounds(0, 0, 89, 23);
		contentPane.add(btnNovo);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				desabilitaCampos(true);
				limparCampos();
				btnNovo.setEnabled(true);
				btnSalvar.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});
		btnSalvar.setEnabled(false);
		btnSalvar.setBounds(99, 0, 89, 23);
		contentPane.add(btnSalvar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
				desabilitaCampos(true);
				btnNovo.setEnabled(true);
				btnSalvar.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(198, 0, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 107, 63, 14);
		contentPane.add(lblCpf);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(92, 104, 140, 20);
		contentPane.add(textField);
	}
	
	private void limparCampos() {
		txtCodigo.setText(null);
		txtNumeros.setText(null);
		txtTipoJogo.setSelectedItem(null);
	}
	
	private void desabilitaCampos(boolean value) {
		txtNumeros.setEnabled(!value);
		txtTipoJogo.setEnabled(!value);
	}
}
