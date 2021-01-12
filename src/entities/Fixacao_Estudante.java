package entities;

public class Fixacao_Estudante {
	public String nome;
	public double nota1, nota2, nota3;
	
	public double notaFinal(){
		return nota1+nota2+nota3;
	}
	public double pontosFaltando() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		}else
			return 0.0;
	}
}
