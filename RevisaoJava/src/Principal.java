import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		/*
		 * 1. Crie uma lista, adicione 5 números e 
		 * calcule a soma e a média dos valores.
		 */
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(50);
		numeros.add(4);
		numeros.add(40);
		numeros.add(3);
		
		Integer soma = 0;
		for (Integer n : numeros) {
			soma += n;
		}
		Integer media = soma / numeros.size();
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+media);
				
		/*
		 * 2. Crie um método chamado "imprimir". 
		 * O método deverá receber uma lista como parâmetro 
		 * e imprimir seus valores no console. 
		 * Faça a chamada do método (no main) passando 
		 * uma lista para ser impressa.
		 */
		imprimir(numeros);
		
		/*
		 * 3. Crie uma classe chamada "Aluno" com os atributos 
		 * codigo, nome e sobrenome. Crie uma lista do tipo 
		 * aluno e adicione 2 objetos na lista. Percorra a 
		 * lista e imprima o código, nome e sobrenome no console.
		 */
		List<Aluno> alunos = new ArrayList<>();
		
		Aluno pessoa1 = new Aluno();
		pessoa1.setCodigo(10);
		pessoa1.setNome("JOAO");
		pessoa1.setSobrenome("DA SILVA");
		
		// Utilizando método construtor para passar os valores
		Aluno pessoa2 = new Aluno(20,"MARIA","DOS SANTOS"); 
		
		alunos.add(pessoa1);
		alunos.add(pessoa2);
		
		// Imprimindo a lista de alunos
		for (Aluno a : alunos) {
			System.out.println(a.getCodigo()+" - "+a.getNome()+" "+a.getSobrenome());
		}
		
		/*
		 * 4. Criar a classe Pessoa com o atributo nome.
		 * Criar a classe Professor que é uma pessoa.
		 * Alterar a classe Aluno para que seja uma pessoa.
		 * O professor tem salário e o aluno tem mensalidade.
		 * As classes deverão ter um método imprimir, que 
		 * exibirá o nome no console.
		 * Crie 1 objeto professor e outro aluno, passando
		 * todos os dados.
		 */
		
		Aluno a1 = new Aluno();
		a1.setNome("JOSE");
		a1.setMensalidade(715.0);
		
		Professor p1 = new Professor();
		p1.setNome("MARIA");
		p1.setSalario(9825.5);
		
		// Polimorfismo
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(a1);
		pessoas.add(p1);
		
		for (Pessoa pes : pessoas) {
			pes.imprimir();
		}
		
	}
	
	public static void imprimir(List<Integer> valores) {
		for (Integer n : valores) {
			System.out.println(n);
		}
	}
	
}
