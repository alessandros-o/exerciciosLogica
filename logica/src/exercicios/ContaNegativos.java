package exercicios;

import java.util.Scanner;

public class ContaNegativos {
	public static void main(String[] args) {
		
		int cont = 1;
		int qtdNegativo = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos n�mero deseja digitar: ");
		int qtd = entrada.nextInt();
		
		do {
			System.out.print("Digite um n�mero: ");
			int num = entrada.nextInt();
			if(num < 0) {
				qtdNegativo = qtdNegativo + 1;
			}
			cont++;
		} while (cont <= qtd);
		System.out.println("A quantidade de n�meros negativos digitados foi: " + qtdNegativo);
		entrada.close();
	}

}
