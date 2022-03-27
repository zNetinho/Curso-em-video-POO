package Aula14;

public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;

	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.filme.setViews(filme.getViews() + 1);
		this.espectador.setTotAssistido(espectador.getTotAssistido() + 1);
		this.espectador.setExp(espectador.getExp() + 50);
	}

	public void avaliar() {
		this.filme.setCurtidas(filme.getCurtidas() + 1);
		this.filme.setAvaliacao(filme.getAvaliacao() + 1);
	}

	public void avaliar(int nota) {
		this.filme.setCurtidas(filme.getCurtidas() + 1);
		this.filme.setAvaliacao(filme.getAvaliacao() + nota);
	}

	public void avaliar(float porc) {
		this.filme.setCurtidas(filme.getCurtidas() + 1);
		this.filme.setAvaliacao(filme.getAvaliacao() + porc);
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	public String descricao() {
		return "Espectador= " + espectador + ", filme= " + filme;
	}

}
