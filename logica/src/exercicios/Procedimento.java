package exercicios;

import java.util.Scanner;

public class Procedimento {
	double mai;
	void cabecalho() {
		System.out.println("-------------------------------------");
		System.out.println("         DETECTOR DE PESADOS         ");
		System.out.println("O maior peso até agora: " + this.mai + "Kg");
		System.out.println("-------------------------------------");
	}
	public static void main(String[] args) {
		int i = 0;
		String n, pesado = "";
		double p = 0;
		Procedimento p1 = new Procedimento();
		Scanner entrada = new Scanner(System.in);
		
		p1.cabecalho();
//		System.out.println("-------------------------------------");
//		System.out.println("         DETECTOR DE PESADOS         ");
//		System.out.println("O maior peso até agora: " + mai + "Kg");
//		System.out.println("-------------------------------------");
		
		for(i = 1; i < 5; i++) {
			System.out.println("Digite o nome: ");
			n = entrada.next();
			System.out.println("Digite o peso: ");
			p = entrada.nextDouble();
			if(p > p1.mai) {
				p1.mai = p;
				pesado = n;
			}
			p1.cabecalho();
//			System.out.println("-------------------------------------");
//			System.out.println("         DETECTOR DE PESADOS         ");
//			System.out.println("O maior peso até agora: " + mai + "Kg");
//			System.out.println("-------------------------------------");
		}
		System.out.println("=================================================");
		System.out.println("A pessoa mais pesada até agora foi " + pesado + " com " + p1.mai + " quilos.");
		
		entrada.close();
	}

}
