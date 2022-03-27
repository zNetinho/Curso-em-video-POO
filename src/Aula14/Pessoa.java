package Aula14;

public class Pessoa {
	private String nome, sexo;
	private int idade, exp;
	
	public void fazerAniversario() {
		this.setIdade(getIdade() + 1);
		
	}
	public void ganharExp (int exp) {
		this.setExp(getExp() + exp); 
	}

	public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.exp = exp;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
}