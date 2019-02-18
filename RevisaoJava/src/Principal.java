import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		/*
		 * 1. Crie uma lista, adicione 5 n�meros e 
		 * calcule a soma e a m�dia dos valores.
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
		System.out.println("M�dia: "+media);
				
		/*
		 * 2. Crie um m�todo chamado "imprimir". 
		 * O m�todo dever� receber uma lista como par�metro 
		 * e imprimir seus valores no console. 
		 * Fa�a a chamada do m�todo (no main) passando 
		 * uma lista para ser impressa.
		 */
		imprimir(numeros);
		
		/*
		 * 3. Crie uma classe chamada "Aluno" com os atributos 
		 * codigo, nome e sobrenome. Crie uma lista do tipo 
		 * aluno e adicione 2 objetos na lista. Percorra a 
		 * lista e imprima o c�digo, nome e sobrenome no console.
		 */
		List<Aluno> alunos = new ArrayList<>();
		
		Aluno pessoa1 = new Aluno();
		pessoa1.setCodigo(10);
		pessoa1.setNome("JOAO");
		pessoa1.setSobrenome("DA SILVA");
		
		// Utilizn
		Aluno pessoa2 = new Aluno(20,"MARIA","DOS SANTOS"); 
		
		alunos.add(pessoa1);
		alunos.add(pessoa2);
		
		for (Aluno a : alunos) {
			System.out.println(a.getCodigo()+" - "+a.getNome()+" "+a.getSobrenome());
		}
		
	}
	
	public static void imprimir(List<Integer> valores) {
		for (Integer n : valores) {
			System.out.println(n);
		}
	}
	
}
