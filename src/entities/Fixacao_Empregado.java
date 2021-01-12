package entities;

public class Fixacao_Empregado {
	public String nome;
	public double salarioGrosso, imposto;
	
	public double salarioLiquido() {
		return salarioGrosso - imposto;
	}
	public void aumentoSalarial(double porcentagem) {
		salarioGrosso += salarioGrosso * porcentagem /100;
	}
	public String toString() {
		return nome
				+", "
				+"$ "
				+String.format("%.2f", salarioLiquido());
	}
}
