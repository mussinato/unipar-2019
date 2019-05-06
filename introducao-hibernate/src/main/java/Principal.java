import javax.swing.JOptionPane;

import dao.CidadeDAO;
import dominio.Cidade;

public class Principal {
	
	public static void main(String[] args) {
		Cidade cid = new Cidade();
		cid.setNomeCidade("CIANORTE");
		cid.setUf("PR");
		
		CidadeDAO dao = new CidadeDAO();
		try {
			dao.salvar(cid);
			JOptionPane.showMessageDialog(null, "Cidade cadastrada com sucesso.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}

}
