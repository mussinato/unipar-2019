package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lancamento_jogo")
public class LancamentoJogo {
	@Id
	@GeneratedValue
	private Integer codigo;
	
	private String numeros;
	
	private String cpf;
	
	@ManyToOne
	@JoinColumn(name="tipo_jogo")
	private TipoJogo tipoJogo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNumeros() {
		return numeros;
	}

	public void setNumeros(String numeros) {
		this.numeros = numeros;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoJogo getTipoJogo() {
		return tipoJogo;
	}

	public void setTipoJogo(TipoJogo tipoJogo) {
		this.tipoJogo = tipoJogo;
	}
}
