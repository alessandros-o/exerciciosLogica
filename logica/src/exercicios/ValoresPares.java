package exercicios;

import java.util.Scanner;

public class ValoresPares {
	public static void main(String[] args) {
		
		int[] val = new int[7];
		
		int totPar = 0;
		Scanner entrada = new Scanner(System.in);
		
		for( int i = 0; i < 7; i++) {
			System.out.println("Digite um n�mero: ");
			val[i] = entrada.nextInt();
		}
		
		for( int i = 0; i < 7; i++) {
			if (val[i] % 2 == 0) {
				totPar = totPar + 1;
				System.out.println("O n�mero par est� na posi��o: " + i);
			}
		}
		System.out.println("O total de n�mero pares �: " + totPar);
		
		entrada.close();
	}

}
