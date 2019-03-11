import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;

public class TelaTipoJogo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	

	/**
	 * Create the frame.
	 */
	public TelaTipoJogo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(24, 52, 46, 14);
		contentPane.add(lblDescrio);
		
		textField = new JTextField();
		textField.setBounds(88, 49, 247, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(24, 88, 73, 14);
		contentPane.add(lblQuantidade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(89, 84, 46, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Tipo de Jogo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(24, 11, 111, 30);
		contentPane.add(lblNewLabel);
	}

}
