package estrutura;

import javax.swing.JOptionPane;

import java.util.Random;


public class repeticao {

	public static void main(String[] args) {
		int kill, soma, fase;
		double media;
		String resp = "s";
		
		soma = 0;
		fase = 0;
		
		/*for(int i = 1; i <= 5; i++) {
			kill = Integer.parseInt(
					JOptionPane.showInputDialog("Digite o numero de abates da fase " + fase));
			
			if(kill > 100 || kill < 0) {
				JOptionPane.showMessageDialog(null, "Numero invalido");
				break;
			}
			
			soma = soma + kill;
			fase++;
		}*/
		
		/*while(resp.equals("s") || resp.equals("S")) {
			kill = Integer.parseInt(
					JOptionPane.showInputDialog("Digite o numero de abates da fase"));
			
			if(kill > 100 || kill < 0) {
				JOptionPane.showMessageDialog(null, "Numero invalido");
				break;
			}
			
			soma = soma + kill;
			
			resp = JOptionPane.showInputDialog("Deseja continuar? (S para sim, N para não");
			
			fase++;
		}
		media = soma / fase;
		
		JOptionPane.showMessageDialog(null, "A media de abates é: " + media);*/
		
		
		Random gerador = new Random();
		
		
		int numR,numU; 
		
		numR = gerador.nextInt(10);
		numU = 0;
		
		
		while(numR != numU) {
			numU = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
			if(numU > numR) {
				JOptionPane.showMessageDialog(null, "Você tem que tentar um numero um menor");
			}
			else if(numU < numR) {
				JOptionPane.showMessageDialog(null, "Você tem que tentar um numero maior");
			}
		}
		
		JOptionPane.showMessageDialog(null, "O numero do computador é: " + numR + " O seu numero é: " + numU);
		

	}

}
