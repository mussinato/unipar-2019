
public class Aluno extends Pessoa {
	private Integer codigo;
	private String sobrenome;
	private Double mensalidade;
	
	public Aluno() {
		
	}
	
	// Sobrescrevendo o método construtor
	public Aluno(Integer codigo, String nome, String sobrenome) {
		this.codigo = codigo;
		this.setNome(nome);
		this.sobrenome = sobrenome;
	}
	
	// Sobrescrevendo o método imprimir 
	public void imprimir() {
		System.out.println(getNome()+" - "+mensalidade);
	}
	
	// Encapsulamento dos atributos (get/set)
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
}
