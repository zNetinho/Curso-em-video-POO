package Aula11;

public class Bolsita extends Aluno{
	public Bolsita(String nome, String sexo, int idade, String curso, int matricula) {
		super(nome, sexo, idade, curso, matricula);
		// TODO Auto-generated constructor stub
	}

	private float bolsa;
	
	@Override
	public void pagarMensalidade () {
		System.out.println("Aluno e bolsita pagamento facilitado pagando mensalidade");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String apresentar() {
		return "bolsita " + getNome() + " faz curso de: " + getCurso() + " sua matricula: " + getMatricula() 
		+ "\n a sua bolsa e do valor de: " + getBolsa() + " idade: " + getIdade();
	}
	
	
}