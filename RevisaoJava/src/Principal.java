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
		
	}
	
	public static void imprimir(List<Integer> valores) {
		for (Integer n : valores) {
			System.out.println(n);
		}
	}
	
}
