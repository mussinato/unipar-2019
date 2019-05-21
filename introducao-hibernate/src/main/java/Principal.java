import java.util.Date;

import javax.swing.JOptionPane;

import dao.CidadeDAO;
import dao.VeiculoDAO;
import dominio.Cidade;
import dominio.Veiculo;

public class Principal {
	
	public static void main(String[] args) {
		Cidade cid = new Cidade();
		cid.setNomeCidade("CIANORTE");
		cid.setUf("PR");
		
		CidadeDAO dao = new CidadeDAO();
		try {
			cid = dao.salvar(cid);
			JOptionPane.showMessageDialog(null, "Cidade cadastrada com sucesso.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
		try {
			dao.excluir(cid);
			JOptionPane.showMessageDialog(null, "Cidade excluida com sucesso.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
		
		Veiculo vei = new Veiculo();
		vei.setAnoFabricacao(2019);
		vei.setAnoModelo(2019);
		vei.setDataCadastro(new Date());
		vei.setMarca("BMW");
		vei.setModelo("350i");
		vei.setValorTabelaFipe(180000.0);
		vei.setVendido(true);
		vei.setCidade(cid);
		
		VeiculoDAO daoVeiculo = new VeiculoDAO();
		try {
			vei = daoVeiculo.salvar(vei);
			JOptionPane.showMessageDialog(null, "Veículo salvo com sucesso.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}

}
