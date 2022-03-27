package Aula11;

public class Aluno extends Pessoa {
	
	private String curso;
	private int matricula;
	
	public void cancelarMatricula() {
		
	}
	
	public void pagarMensalidade () {
		System.out.println("Pagando mensalidade");
	}

	public Aluno(String nome, String sexo, int idade, String curso, int matricula) {
		super(nome, sexo, idade);
		this.curso = curso;
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.setCurso(curso);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String apresentarAluno() {
		return "Aluno: "+ this.getNome() + " curso= " + curso + ", matricula=" + matricula + "]";
	}


	
	
}
