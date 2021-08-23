package exercicios;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String r = "";
		do {
			int f = 1;
			System.out.println("Qual o fator? ");
			int fator = entrada.nextInt();
			int cont = fator;
		
			do {
				f = f * cont;
				cont--;
			} while(cont >= 1);
			System.out.println(f);
			System.out.println("Quer continuar? [s/n]");
			r = entrada.next();
		} while (r.equals("s"));	
		entrada.close();	
	}

}
