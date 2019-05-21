import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaTipoJogo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtCodigo;
	private JComboBox<Integer> txtQuantidade;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnCancelar;
	

	/**
	 * Create the frame.
	 */
	public TelaTipoJogo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setBounds(10, 68, 65, 14);
		contentPane.add(lblDescrio);
		
		txtDescricao = new JTextField();
		txtDescricao.setEnabled(false);
		txtDescricao.setBounds(82, 65, 247, 20);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(10, 100, 73, 14);
		contentPane.add(lblQuantidade);
		
		txtQuantidade = new JComboBox<Integer>();
		txtQuantidade.setEnabled(false);
		txtQuantidade.addItem(1);
		txtQuantidade.addItem(2);
		txtQuantidade.addItem(3);
		txtQuantidade.addItem(4);
		txtQuantidade.addItem(5);
		txtQuantidade.addItem(6);
		txtQuantidade.addItem(7);
		txtQuantidade.addItem(8);
		txtQuantidade.addItem(9);
		
		txtQuantidade.setBounds(82, 96, 57,    22);
		contentPane.add(txtQuantidade);
		
		JLabel lblCdigo = new JLabel("Código");
		lblCdigo.setBounds(10, 37, 46, 14);
		contentPane.add(lblCdigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		txtCodigo.setBounds(82, 34, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
				String descricao = txtDescricao.getText();
				Integer quantidade = (Integer)txtQuantidade.getSelectedItem();
				
				btnNovo.setEnabled(true);
				btnSalvar.setEnabled(false);
				btnCancelar.setEnabled(false);
				
				desabilitaCampos(true);
				limparCampos();
			}
		});
		btnSalvar.setEnabled(false);
		btnSalvar.setBounds(99, 0, 89, 23);
		contentPane.add(btnSalvar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNovo.setEnabled(true);
				btnSalvar.setEnabled(false);
				btnCancelar.setEnabled(false);
				
				desabilitaCampos(true);
				limparCampos();
			}
		});
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(198, 0, 89, 23);
		contentPane.add(btnCancelar);
	}
	
	private void limparCampos() {
		txtCodigo.setText(null);
		txtDescricao.setText(null);
		txtQuantidade.setSelectedItem(null);
	}
	
	private void desabilitaCampos(boolean value) {
		txtDescricao.setEnabled(!value);
		txtQuantidade.setEnabled(!value);
	}
}
