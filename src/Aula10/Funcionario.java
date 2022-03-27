package Aula10;

public class Funcionario extends Pessoa {

	public Funcionario(String nome, String sexo, int idade) {
		super(nome, sexo, idade);

	}

	private String funcao;
	private int salario;

	public void receberAumento(int aumento) {
		this.setSalario(getSalario() + aumento );  
	}
	public void promocao (String promocao) {
		this.setFuncao(promocao);	
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

}
