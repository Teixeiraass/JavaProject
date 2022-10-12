package asterisco;

import java.util.Scanner;
		
		
public class Exercicio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um numero");
		numero = ler.nextInt();
		
		for(int i = numero; i >= 1; i--) {
			for(int a = numero; a >= 1; a--) {
				System.out.print("*");
			}
			System.out.print("\n");
			numero--;
		}
	}

}
