package modulo01_POO;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program_Fixacao1_Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Fixacao1_Retangulo rt = new Fixacao1_Retangulo();
		
		System.out.println("Entre com os valores da base e da altura: ");
		rt.height = sc.nextDouble();
		rt.width = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rt.area());
		System.out.printf("Perimentro = %.2f%n", rt.perimeter());
		System.out.printf("Diagonal = %.2f%n", rt.diagonal());
		
		sc.close();
	}

}
