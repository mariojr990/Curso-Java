package modulo01_POO;

public class For_each {
	public static void main (String [] args) {
		String[] vect =new String [] {"Mario, Bob, Alex"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for(String nome : vect) {
			System.out.println(nome);
		}
	}
}
