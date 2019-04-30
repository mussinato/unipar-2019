package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tab_veiculo")
public class Veiculo {
	@Id	
	private Integer codigo;
	
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
}
