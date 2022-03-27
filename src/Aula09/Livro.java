package Aula09;

public class Livro implements Publicacao {
	private String titulo, autor;
	private int totPaginas, pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + "" + ",\n" + " leitor=" + leitor.getNome()
				+ "o genero do leitor:" + leitor.getSexo() + "Idade do leitor:" + leitor.getIdade() + "\n, totPaginas="
				+ totPaginas + ", pagAtual=" + pagAtual + ", aberto=" + aberto;
	}

	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.leitor = leitor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	@Override
	public void abrir() {
		if (aberto == false) {
			this.aberto = true;
		} else {
			this.aberto = true;
			System.out.println("o livro já está aberto");
		}
	}

	@Override
	public void fechar() {
		if (aberto == true) {
			this.aberto = false;
		} else {
			this.aberto = false;
			System.out.println("o livro já está fechado");
		}
	}

	@Override
	public void folhear(int p) {
		this.pagAtual = p;
	}

	@Override
	public void avancarPag() {
		if (pagAtual <= getTotPaginas())
			this.pagAtual = (this.pagAtual + 1);
	}

	@Override
	public void voltarPag() {
		if (pagAtual <= 0) {
			System.out.println("o livro não tem nenhuma pagina para voltar");
		} else {
			this.pagAtual = (this.pagAtual - 1);

		}
	}

}
