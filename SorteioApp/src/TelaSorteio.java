import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class TelaSorteio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	

	/**
	 * Create the frame.
	 */
	public TelaSorteio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSorteio = new JLabel("Sorteio");
		lblSorteio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSorteio.setBounds(29, 22, 106, 26);
		contentPane.add(lblSorteio);
		
		JLabel lblTipoJogo = new JLabel("Tipo Jogo");
		lblTipoJogo.setBounds(29, 73, 46, 14);
		contentPane.add(lblTipoJogo);
		
		JButton btnSortear = new JButton("Sortear");
		btnSortear.setBounds(29, 123, 134, 23);
		contentPane.add(btnSortear);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(85, 69, 78, 22);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(29, 193, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(29, 171, 78, 14);
		contentPane.add(lblResultado);
	}

}
