package Aula14;

public class Gafanhoto extends Pessoa{
	
	private String login;
	private int totAssistido;
	
	public void viuMaisUm () {
		setTotAssistido(getTotAssistido() + 1);
	}
	
	public void ganharExp () {
		
	}

	public Gafanhoto(String nome, String sexo, int idade, String login) {
		super(nome, sexo, idade);
		this.login = login;
		this.totAssistido = 0;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
}
