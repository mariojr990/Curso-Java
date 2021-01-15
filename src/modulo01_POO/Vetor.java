package modulo01_POO;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_Vect;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		Product_Vect[] vect = new Product_Vect[n];
		
		for (int i = 0; i < n; i++) {
			input.nextLine();
			String nome = input.nextLine();
			double preco = input.nextDouble();
			
			vect[i] = new Product_Vect(nome, preco);
		}
		
		double soma=0;
		
		for(int i=0; i<n; i++) {
			soma+=vect[i].getPreco();
		}
		double avg = soma/n;
		System.out.printf("Media= %.2f%n", avg);
		
		input.close();
	}

}
