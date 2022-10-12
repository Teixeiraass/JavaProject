package atividade2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salario;
		int tempEmpresa;
		
		System.out.println("Digite o salario:");
		salario = entrada.nextDouble();
		System.out.println("Digite o tempo de empresa:");
		tempEmpresa = entrada.nextInt();
		
		if(tempEmpresa >= 5) {
			double salAjust =  salario + salario * 20 / 100;
			System.out.println("Seu salario foi ajustado em 20%, ficando com o valor de: " + salAjust);
		}
		else {
			double salAjust = salario + salario * 10 / 100;
			System.out.println("Seu salario foi ajustado em 10%, ficando com o valor de: " + salAjust);
		}
	}

}
