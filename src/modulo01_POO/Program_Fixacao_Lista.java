package modulo01_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fixacao_Lista;

public class Program_Fixacao_Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Fixacao_Lista> funcionario = new ArrayList<>();
		
		System.out.println("Quantos Funcionarios seram registrados? ");
		int q = input.nextInt();
		
		
		
		
		
		input.close();
	}

}
