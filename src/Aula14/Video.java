package Aula14;

public class Video implements AcoesVideo {

	private String titulo;
	private float avaliacao, views;
	private int curtidas;
	private boolean reproduzindo;

	public Video(String titulo, float avaliacao, float views, int curtidas, boolean reproduzindo) {
		super();
		this.titulo = titulo;
		this.avaliacao = avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}

	public float getViews() {
		return views;
	}

	public void setViews(float views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		if (isReproduzindo() == false) {
			System.out.println("o video estava pausado... reproduzindo");
		} else {
			System.out.println("o video ja esta reproduzindo");
		}
	}

	@Override
	public void pause() {
		if (isReproduzindo() == true) {
			System.out.println("video pausado");

		} else {
			System.out.println("o video ja esta parado");
		}
	}

	@Override
	public void like() {
		this.setCurtidas(getCurtidas() + 1);
	}


	public String descricao() {
		return "titulo= " + titulo + ", avaliacao= " + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo= " + reproduzindo + "]";
	}

	
}
