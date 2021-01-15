package modulo01_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>();
		
		lista.add("Mario");
		lista.add("Bob");
		lista.add("Alex");
		lista.add("Anna");
		lista.add(2, "Marco");
		
		System.out.println(lista.size());
		for(String nomes : lista) {
			System.out.println(nomes);
		}
		System.out.println("-----------------------");
		lista.removeIf(nomes -> nomes.charAt(0)== 'M');
		for(String x : lista) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		System.out.println("Index of Bob: "+ lista.indexOf("Bob"));
		System.out.println("----------------------");
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println(result);
		System.out.println("---------------------");
		String nome = lista.stream().filter(x ->x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}

}
