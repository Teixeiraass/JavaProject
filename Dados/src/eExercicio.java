
import java.util.*;

public class eExercicio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random gerar = new Random();
		
		int dado1, dado2;
		
		

		for(int i = 1; i <= 1; i++) {
			System.out.println("Primeira rodada!");
			
			dado1 = gerar.nextInt(6);
			dado2 = gerar.nextInt(6);
			
			System.out.println("Dado 1: " + dado1);
			System.out.println("Dado 2: " + dado2);
			
			
			if(dado1 + dado2 == 7 || dado1 + dado2 == 7) {
				System.out.println("Você venceu");
			}else if(dado1 + dado2 == 2 || dado1 + dado2 == 3 || dado1 + dado2 == 12 ) {
				System.out.println("Você perdeu");
			}
			else {
				System.out.println("Ponto");
			}
		}
		
		dado1 = gerar.nextInt(6);
		dado2 = gerar.nextInt(6);
		
		while(dado1 + dado2 == 2 || dado1 + dado2 == 3 || dado1 + dado2 == 12 || dado1 + dado2 == 7) {
			System.out.println("Segunda rodada");
			
			dado1 = gerar.nextInt(6);
			dado2 = gerar.nextInt(6);
			
			System.out.println("Dado 1: " + dado1);
			System.out.println("Dado 2: " + dado2);
			
			if(dado1 + dado2 == 7) {
				System.out.println("Você perdeu");
				break;
			}
			else {
				System.out.println("Ponto");
			}
		}
	}

}
