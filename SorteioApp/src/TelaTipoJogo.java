import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaTipoJogo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox<Integer> comboQuantidade;
	

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
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setBounds(24, 52, 46, 14);
		contentPane.add(lblDescrio);
		
		textField = new JTextField();
		textField.setBounds(88, 49, 247, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(24, 88, 73, 14);
		contentPane.add(lblQuantidade);
		
		Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};
		DefaultComboBoxModel<Integer> modelCombobox = new DefaultComboBoxModel<>(numeros);
		comboQuantidade = new JComboBox<Integer>(modelCombobox);
		
		comboQuantidade.setBounds(89, 84, 57, 22);
		contentPane.add(comboQuantidade);
		
		JLabel lblCdigo = new JLabel("Código");
		lblCdigo.setBounds(24, 21, 46, 14);
		contentPane.add(lblCdigo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 18, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
