import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmUsuario = new JMenuItem("Usuario");
		mntmUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaUsuario usuario = new TelaUsuario();
				usuario.setVisible(true);
			}
		});
		mnCadastro.add(mntmUsuario);
		
		JMenuItem mntmTipoJogo = new JMenuItem("Tipo Jogo");
		mntmTipoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaTipoJogo telaTipoJogo = new TelaTipoJogo();
				telaTipoJogo.setVisible(true);
			}
		});
		mnCadastro.add(mntmTipoJogo);
		
		JMenu mnCadastroJogo = new JMenu("Jogo");
		menuBar.add(mnCadastroJogo);
		
		JMenuItem mntmMegasena = new JMenuItem("Lanšamento do Jogo");
		mntmMegasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLancamentoJogo jogo = new TelaLancamentoJogo();
				jogo.setVisible(true);
			}
		});
		mnCadastroJogo.add(mntmMegasena);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSorteio = new JButton("Sorteio");
		btnSorteio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSorteio sorteio = new TelaSorteio();
				sorteio.setVisible(true);
			}
		});
		btnSorteio.setBounds(308, 189, 89, 23);
		contentPane.add(btnSorteio);
	}
}
