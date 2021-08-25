package exercicios;

import java.util.Scanner;

public class Repeticao1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int cont = 1;
		int n = 0;
		int s = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		while (cont <= 5) {
			System.out.println("Digite o " + cont + "º valor: ");
			n = entrada.nextInt();
			
//			if(cont == 1) {
//				maior = n;
//				menor = n;
//			}
			
			if (n > maior) {
				maior = n;
			}
			
			if (n < menor) {
				menor = n;
			}
			s += n;
			cont = cont + 1;
		}
		System.out.println("A soma de todos os valores foi: " + s);
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O menor número digitado foi: " + menor);
		entrada.close();
	}

}
