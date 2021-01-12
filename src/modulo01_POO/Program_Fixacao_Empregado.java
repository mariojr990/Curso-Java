package modulo01_POO;

import java.util.Locale;
import java.util.Scanner;

import entities.Fixacao_Empregado;

public class Program_Fixacao_Empregado {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Fixacao_Empregado emp = new Fixacao_Empregado();
		
		System.out.print("Digite seu nome: ");
		emp.nome = sc.nextLine();
		
		System.out.print("Digite seu salario bruto: ");
		emp.salarioGrosso = sc.nextDouble();
		
		System.out.print("Informe o valor do imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println("Funcionario: "+ emp.toString());
		System.out.println();
		
		System.out.print("Informe qual a porcentagem de aumento do salario: ");
		double porcentagem = sc.nextDouble();
		emp.aumentoSalarial(porcentagem);
		
		System.out.printf("Dados atualizados: "+ emp.toString());
		sc.close();
	}
}
