import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class TelaLancamentoJogo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	

	/**
	 * Create the frame.
	 */
	public TelaLancamentoJogo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLanamentoDoJogo = new JLabel("Lan\u00E7amento do Jogo");
		lblLanamentoDoJogo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLanamentoDoJogo.setBounds(30, 21, 165, 25);
		contentPane.add(lblLanamentoDoJogo);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(30, 73, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblTipoDoJogo = new JLabel("Tipo do Jogo");
		lblTipoDoJogo.setBounds(30, 126, 74, 14);
		contentPane.add(lblTipoDoJogo);
		
		JLabel lblNumeros = new JLabel("Numeros");
		lblNumeros.setBounds(30, 176, 46, 14);
		contentPane.add(lblNumeros);
		
		textField = new JTextField();
		textField.setBounds(103, 70, 92, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(103, 122, 92, 22);
		contentPane.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 173, 140, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
