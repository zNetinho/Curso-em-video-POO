package Aula12;

public class Peixe extends Animal{
	private String corEscama;
	private String sexo;
	
	@Override
	public void locomover () {
		System.out.println("nadando");
	}
	@Override
	public void alimentando () {
		System.out.println("comendo");
	}
	@Override
	public void emitirSom () {
		System.out.println("peixe não faz som");
	}
	public void fazerBolha () {
		System.out.println("soltou uma bolha");
	}
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	public String apresentar() {
		return "Peixe Cor Escama= " + corEscama  + ", Nome= " + getNome()
				+ "\n, Peso= " + getPeso() + ", Idade= " + getIdade() +"O sexo: " + getSexo(sexo) + "\n";
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
		
	}
	public String getSexo(String sexo) {
		return sexo;
	}
	
}
