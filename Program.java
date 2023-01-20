import java.util.Locale;
import java.util.Scanner;

import entities.Classe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Gabriel", "Juliana", "Joana"};
		
		for ( int i = 0; i < vect.length; i++) { //for tradicional
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------------");
		
		for (String obj : vect) { //Exemplo de for each gerando o mesmo resultado acima
			System.out.println(obj);
		}
		
		System.out.println("------------------------");
		
		int[] numeros = new int[] {1, 2, 3, 4, 5};
		
		for (int potencia : numeros) { //for each utilizando números inteiros
			potencia *= potencia;
			System.out.println(potencia);
		}
		
		System.out.println("------------------------");
		
		System.out.println("Faça 3 cadastros");
		Classe[] vetor = new Classe[3];
		for (int i = 0; i < vetor.length; i++) { //for each utilizando classe e objeto
			System.out.printf("%dº cadastro:\n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			
			Classe classe = new Classe(nome, idade, altura);
			vetor[i] = classe;
			
		}
		System.out.println("Informações alteradas: ");
		for (Classe alterar : vetor) {
			alterar.setNome("Glub " + alterar.getNome());
			System.out.println("Nome: " + alterar.getNome());
			
			alterar.setIdade(alterar.getIdade() * 2);
			System.out.println("Idade: " + alterar.getIdade());
			
			alterar.setAltura(alterar.getAltura() + 1.0);
			System.out.println("Altura: " + alterar.getAltura());
		}
		

		
		
		sc.close();
	}

}
