package br.unipar.jsfaula;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="testeCtrl")
@ViewScoped
public class TesteController {
	
	private Integer numero = 0;
	
	private String campo1;
	private List<Carro> lista = new ArrayList<>();
	private List<Pessoa> pessoas = new ArrayList<>();
	
	private Integer codigo;
	private String nome;
	private String email;
	
	public void salvar() {
		Pessoa pes = new Pessoa();
		pes.setCodigo(codigo);
		pes.setNome(nome);
		pes.setEmail(email);
		
		pessoas.add(pes);
		
		codigo = null;
		nome = null;
		email = null;
	}
	
	
	public void imprimir() {
		System.out.println("Numero: "+numero);
	}
	
	public void somar() {
		numero += 1;
	}
	
	public void diminuir() {
		numero -= 1;
	}

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

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public List<Pessoa> getPessoas() {
		return pessoas;
	}


	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
