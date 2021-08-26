package exercicios;

import java.util.Scanner;

public class SoComC {
	public static void main(String[] args) {
		
		String nome = "";
		String[] soC = new String[5];
		int tot = 0;
		int c = 0;
		Scanner entrada = new Scanner(System.in);
		
		for( ; c < 5; c++) {
			System.out.println("Digite o nome: ");
			soC[c] = entrada.next();
		}
		for(c = 0; c < 5; c++) {
			if(Character.toString(soC[c].charAt(0)).equals("C")) {
				tot = tot + 1;
				nome = soC[c];
			}
			System.out.println(nome);
		}
		
		System.out.println("Total de pessoas que começam com letra C é: " + tot);
		
		entrada.close();
	}

}
