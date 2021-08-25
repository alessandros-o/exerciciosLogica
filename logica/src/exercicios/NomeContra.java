package exercicios;

import java.util.Scanner;

public class NomeContra {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		 String nome = entrada.next();
		 int i = nome.length();
		 System.out.println(i);
		 
		 for( ; i >= 1 ; i--) {
			 System.out.print(nome.charAt(i - 1));
		 }
		entrada.close();
	}
}
