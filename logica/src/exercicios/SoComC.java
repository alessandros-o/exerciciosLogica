package exercicios;

import java.util.Scanner;

public class SoComC {
	public static void main(String[] args) {
		
		String nome = "";
		String[] soC = new String[2];
		int tot = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int c = 0; c < 2; c++) {
			System.out.println("Digite o nome: ");
			soC[c] = entrada.next();
		}
		
		System.out.println(soC[0].charAt(0));
		entrada.close();
	}

}
