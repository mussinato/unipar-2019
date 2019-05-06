package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tab_veiculo")
public class Veiculo {
	@Id
	@GeneratedValue
	private Integer codigo;
	
	@ManyToOne
	@JoinColumn(name="cod_cidade")
	private Cidade cidade;
	
	@Column(nullable = false)
	private String modelo;
	
	@Column(nullable = false)
	private String marca;
	
	@Column(name="ano_fabricacao", nullable=false)
	private Integer anoFabricacao;
	
	@Column(name="ano_modelo", nullable=false)
	private Integer anoModelo;
	
	@Column(name="valor_tabela_fipe", scale=10, precision=2)
	private Double valorTabelaFipe;
	
	@Column(name="data_cadastro", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Column(nullable=false)
	private Boolean vendido;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Double getValorTabelaFipe() {
		return valorTabelaFipe;
	}

	public void setValorTabelaFipe(Double valorTabelaFipe) {
		this.valorTabelaFipe = valorTabelaFipe;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Boolean getVendido() {
		return vendido;
	}

	public void setVendido(Boolean vendido) {
		this.vendido = vendido;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
}
