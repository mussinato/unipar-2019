package view;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSorteio extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	private JComboBox txtTipoJogo;
	private JButton btnSortear;

	/**
	 * Create the frame.
	 */
	public TelaSorteio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoJogo = new JLabel("Tipo Jogo");
		lblTipoJogo.setBounds(10, 11, 66, 14);
		contentPane.add(lblTipoJogo);
		
		btnSortear = new JButton("Sortear");
		btnSortear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSortear.setBounds(336, 7, 88, 23);
		contentPane.add(btnSortear);
		
		txtTipoJogo = new JComboBox();
		txtTipoJogo.setBounds(106, 7, 217, 22);
		contentPane.add(txtTipoJogo);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(95, 58, 162, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 61, 78, 14);
		contentPane.add(lblResultado);
	}

}
