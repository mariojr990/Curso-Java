package modulo01_POO;

import java.util.Scanner;

import entities.Fixacao_Pensao;

public class Program_Fixacao_Pensao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Fixacao_Pensao[] p = new Fixacao_Pensao[10];
		
		System.out.println("Quantos quartos seram alugados?");
		int n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Aluguel #" +i + ":");
			System.out.print("Nome: ");
			input.nextLine();
			String nome=input.nextLine();
			System.out.print("Email: ");
			String email = input.nextLine();
			System.out.print("Quarto: ");
			int quarto = input.nextInt();
			
			p[quarto] = new Fixacao_Pensao(nome, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i =0;i<10;i++) {
			if (p[i] != null) {
				System.out.println(i +": "+ p[i]);
			}
		}
	}

}
