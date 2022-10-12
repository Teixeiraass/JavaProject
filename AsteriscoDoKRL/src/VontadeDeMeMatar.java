
import java.util.*;

public class VontadeDeMeMatar {

	public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero");
		num = ler.nextInt();
		
		
					//for parte de cima
		for(int i = 0; i <= num; i++) {			//determina o numero de linas na parte de cima
			for(int k = num - i; k > 0; k--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		for(int i = 0; i <= num; i++) {
			for(int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for(int k = num - i - 1; k > 0; k--) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
				
	}

}
