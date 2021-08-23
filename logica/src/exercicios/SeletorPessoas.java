package exercicios;

import java.util.Scanner;

public class SeletorPessoas {
	public static void main(String[] args) {
		int menu = 0;
		String sexo = "";
		int idade = 0;
		String sair = "";
		int contHomens = 0;
		int contMulheres = 0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.print("Qual o Sexo? [M/F] ");
			sexo = entrada.next();
			System.out.println("Qual a idade? ");
			idade = entrada.nextInt();
			System.out.println("Qual a cor do cabelo? ");
			System.out.println("----------------------");
			System.out.println("[1] Preto");
			System.out.println("[2] Castanho");
			System.out.println("[3] Loiro");
			System.out.println("[4] Ruivo");
			menu = entrada.nextInt();
			
			
			if(sexo.equalsIgnoreCase("m") && idade > 18 && menu == 2) {
				contHomens = contHomens + 1;
			} else if(sexo.equalsIgnoreCase("f") && (idade <= 30 && idade >= 25) && menu == 3) {
				contMulheres = contMulheres + 1;
			}
			
			System.out.println("Deseja sair? ");
			sair = entrada.next();
		}while (!sair.equalsIgnoreCase("s"));
		
		System.out.println("Total de homens com mais de 18 anos e cabelos castanhos: " + contHomens);
		System.out.println("Total de mulheres entre 25 e 30 anos e cabelos loiros: " + contMulheres);
		
		entrada.close();
	}

}
