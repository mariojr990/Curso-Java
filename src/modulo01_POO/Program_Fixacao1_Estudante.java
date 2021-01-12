package modulo01_POO;

import java.util.Locale;
import java.util.Scanner;

import entities.Fixacao_Estudante;

public class Program_Fixacao1_Estudante {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Fixacao_Estudante es = new Fixacao_Estudante();
		
		System.out.printf("Digite seu nome: ");
		es.nome = sc.nextLine();
		es.nota1 = sc.nextDouble();
		es.nota2 = sc.nextDouble();
		es.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", es.notaFinal());
		
		if (es.notaFinal() < 60) {
			System.out.println("REPROVOU");
			System.out.printf("Faltam %.2f pontos%n ", es.pontosFaltando() );
		}else
			System.out.println("APROVADO");
		
		sc.close();
		
		
	}
}
