package Aula12;

public class Mamifero extends Animal{
	
	private String corDoPelo, sexo;
	
	@Override
	public void locomover () {
		System.out.println("Correndo");
	}
	@Override
	public void alimentando () {
		System.out.println("O mamífero está sendo alimentado");
	}
	@Override
	public void emitirSom () {
		System.out.println("Som de mamífero");
	}
	public String getCorDoPelo() {
		return corDoPelo;
	}
	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String apresentar() {
		return "Mamifero Cor do Pelo= " + corDoPelo + ", sexo=" + sexo + 
			    "\n, Nome= " + getNome() + ", Peso= " + getPeso() + ", Idade= "
				+ getIdade() + ", Quantos Membros?= " + getMembros();
	}
	
 }
