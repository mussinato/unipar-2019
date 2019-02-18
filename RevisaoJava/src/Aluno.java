
public class Aluno {
	private Integer codigo;
	private String nome;
	private String sobrenome;
	
	public Aluno() {
		
	}
	
	// Sobrescrevendo o método construtor
	public Aluno(Integer codigo, String nome, String sobrenome) {
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	// Encapsulamento dos atributos (get/set)
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
}
