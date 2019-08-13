package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.dao.LancamentoJogoDao;
import model.dao.TipoJogoDao;
import model.domain.LancamentoJogo;
import model.domain.TipoJogo;

public class TelaLancamentoJogo extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNumeros;
	private JComboBox<TipoJogo> txtTipoJogo;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnCancelar;
	private JTextField txtCpf;
	private JTable table;
	private DefaultTableModel modelo = new DefaultTableModel();
	

	/**
	 * Create the frame.
	 */
	public TelaLancamentoJogo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 416);
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
		
		txtTipoJogo = new JComboBox<TipoJogo>();
		txtTipoJogo.setEnabled(false);
		txtTipoJogo.setBounds(92, 55, 140, 22);
		contentPane.add(txtTipoJogo);
		
		List<TipoJogo> tipos = new TipoJogoDao().buscarTodos();
		for (TipoJogo t : tipos) {
			txtTipoJogo.addItem(t);
		};
		
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
				try {
					Integer codigo = txtCodigo.getText() != null && !txtCodigo.getText().equals("") ? Integer.valueOf(txtCodigo.getText()) : null;
					String numeros = txtNumeros.getText();
					String cpf = txtCpf.getText();
					TipoJogo tipoJogo = (TipoJogo) txtTipoJogo.getSelectedItem();
					
					if (numeros == null || numeros.equals("")) {
						throw new Exception("Os números são obrigatórios.");
					}
					if (cpf == null || cpf.equals("")) {
						throw new Exception("O cpf é obrigatório.");
					}
					if (tipoJogo == null) {
						throw new Exception("O tipo de jogo é obrigatório.");
					}
					
					LancamentoJogo lancamento = new LancamentoJogo();
					lancamento.setCodigo(codigo);
					lancamento.setCpf(cpf);
					lancamento.setNumeros(numeros);
					lancamento.setTipoJogo(tipoJogo);
					
					LancamentoJogoDao dao = new LancamentoJogoDao();
					dao.salvar(lancamento);
					
					btnNovo.setEnabled(true);
					btnSalvar.setEnabled(false);
					btnCancelar.setEnabled(false);
					
					desabilitaCampos(true);
					limparCampos();
					atualizarLista();
					
					JOptionPane.showMessageDialog(null, "Lançamento de jogo salvo com sucesso.");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
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
		
		txtCpf = new JTextField();
		txtCpf.setEnabled(false);
		txtCpf.setColumns(10);
		txtCpf.setBounds(92, 104, 140, 20);
		contentPane.add(txtCpf);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 130, 444, 258);
		contentPane.add(scrollPane);
		
		modelo.addColumn("Código");
		modelo.addColumn("CPF");
		modelo.addColumn("Tipo de Jogo");
		modelo.addColumn("Números");
		
		table = new JTable(modelo);
		
		// Evita editar a grid com 2 cliques
		table.setDefaultEditor(Object.class, null);
				
		scrollPane.setViewportView(table);
		
		atualizarLista();
	}
	
	private void limparCampos() {
		txtCodigo.setText(null);
		txtNumeros.setText(null);
		txtTipoJogo.setSelectedItem(null);
		txtCpf.setText(null);
	}
	
	private void desabilitaCampos(boolean value) {
		txtNumeros.setEnabled(!value);
		txtTipoJogo.setEnabled(!value);
		txtCpf.setEnabled(!value);
	}
	
	private void atualizarLista() {
		LancamentoJogoDao dao = new LancamentoJogoDao();
		List<LancamentoJogo> lancamentos = dao.buscarTodos();
		
		modelo.setNumRows(0); // limpa a tabela
		
		for (LancamentoJogo t : lancamentos) {
			modelo.addRow(new Object[] {t.getCodigo(),t.getCpf(),t.getTipoJogo().getDescricao(),t.getNumeros()});
		}
	}
}
