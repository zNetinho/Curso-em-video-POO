package Aula12;

public class Reptil extends Animal{
	
	private String corEscama;
	private int membros;
	private boolean venenoso ;
	private String sexo;
	
	@Override
	public void locomover () {
		System.out.println("rastejando");
	}
	@Override
	public void alimentando () {
		System.out.println("o reptil esta sendo alimentado");
	}
	@Override
	public void emitirSom () {
		if (venenoso == true) {
			System.out.println("Som de guizos");
		}else {
			System.out.println("Som de reptil");
		}
	}
	
	
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String apresentar() {
		return "Reptil: Cor da Escama= " + corEscama + ", membros= " + membros + "\n, venenoso=" + venenoso
	    + ", Nome= " + getNome() + " Peso= " + getPeso() + ", Idade= " + getIdade() + "\n";
				
	}
	
}
