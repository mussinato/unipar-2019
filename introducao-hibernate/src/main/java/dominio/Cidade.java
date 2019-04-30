package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tab_cidade")
public class Cidade { 

	@Id // @Id == PK
	@GeneratedValue // <- auto-incremento
	private Integer codigo;
	
	@Column(name = "nome_cidade", length=50, nullable=false)
	private String nomeCidade;
	
	@Column(length = 2, nullable=false)
	private String uf;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
}
