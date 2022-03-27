package Aula12;

public class Ave extends Animal {
	private String corDaPena;
	boolean exotica;
	private String sexo;

	@Override
	public void locomover() {
		System.out.println("voando");
	}

	@Override
	public void alimentando() {
		System.out.println("A ave está sendo alimentada");
	}

	@Override
	public void emitirSom() {
		if (exotica == true) {
			System.out.println("Cantando");
		} else {
			System.out.println("Som*");
		}

	}

	public void fazerNinho() {
		System.out.println("fazendo ninho");
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
		
	}
	public String getSexo (String sexo) {
		return sexo;
	}
	

	public String getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}

	public boolean isExotica() {
		return exotica;
	}

	public void setExotica(boolean exotica) {
		this.exotica = exotica;
	}

	
	public String apresentar() {
		return "Ave Cor da Pena= " + corDaPena + ", exotica= \n" + exotica + ", Nome= " + getNome() + ", Peso= "
				+ getPeso() + ", Idade= " + getIdade() + "\n, quantos membros? = " + getMembros() + "\n";
	}
	
}
