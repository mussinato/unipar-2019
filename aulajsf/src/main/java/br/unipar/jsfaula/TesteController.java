package br.unipar.jsfaula;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="testeCtrl")
@ViewScoped
public class TesteController {
	
	private String campo1;
	private List<Carro> lista = new ArrayList<>();

	public void teste() {
		System.out.println("CAMPO TEXTO: "+campo1);
		lista.add(new Carro("FIAT", "UNO", 1995, "BRANCO"));
		lista.add(new Carro("FIAT", "PALIO", 2007, "PRETO"));
		lista.add(new Carro("VOLKSWAGEN", "GOL", 2013, "BRANCO"));
		lista.add(new Carro("VOLKSWAGEN", "GOLF", 2007, "PRETO"));
		lista.add(new Carro("CHEVROLET", "MONZA", 1985, "BORDO"));
		lista.add(new Carro("CHEVROLET", "CRUZE", 2019, "BRANCO"));
	}

	public String getCampo1() {
		return campo1;
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	public List<Carro> getLista() {
		return lista;
	}

	public void setLista(List<Carro> lista) {
		this.lista = lista;
	}
	
	
}
