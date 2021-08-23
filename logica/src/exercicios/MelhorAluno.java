package exercicios;

import java.util.Scanner;

public class MelhorAluno {
	public static void main(String[] args) {
		
		int cont = 1;
		double maior = 0;
		String alunoCamp = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos a turma tem? ");
		int c = entrada.nextInt();
		System.out.println("--------------------------------------");
		
		while (cont <= c) {
			System.out.println("Aluno " + cont);
			System.out.println("Nome do aluno: ");
			String aluno = entrada.next();
			System.out.println("Nota de " + aluno + ":");
			double nota = entrada.nextDouble();
			System.out.println("--------------------------------------");
			
			if(nota > maior) {
				maior = nota;
				alunoCamp = aluno;
			}
			
			cont++;
		}
		
		System.out.println("O maior aproveitamento foi do aluno " + alunoCamp + " com a nota " + maior);
		
		entrada.close();
	}

}
