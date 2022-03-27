package Aula12;

public abstract class Animal {
	protected String nome;
	protected float peso;
	protected int idade, membros;
	
	public void locomover () {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public void alimentando () {
		
	}
	public void emitirSom () {
		
	}
	

}
