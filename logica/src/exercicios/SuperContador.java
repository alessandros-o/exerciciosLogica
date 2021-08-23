package exercicios;

import java.util.Scanner;

public class SuperContador {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int cont = 1;
		int menu = 0;
		do {
			System.out.println("|      MENU     |");
			System.out.println("=================");
			System.out.println("| [1] De 1 a 10 |");
			System.out.println("| [2] De 10 a 1 |");
			System.out.println("| [3] Sair      |");
			menu = entrada.nextInt();
			if (menu == 1) {
				while(cont <= 10) {
					System.out.print(cont + "..");
					cont++;
				}
			}else if (menu == 2) {
				cont = 10;
				while(cont >=  1) {
					System.out.print(cont + "..");
					cont--;
				}
			}
		}while (menu != 3);
		entrada.close();
	}	
}
