package Aula07;

public class Lutador implements LutadorFicha {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, String categoria,
			int vitorias, int derrotas) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.setCategoria();
		this.vitorias = vitorias;
		this.derrotas = derrotas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();

	}

	private void setCategoria() {
		if (this.getPeso() < 55) {
			this.setCategoria("invalida");
		} else if (this.getPeso() > 55 && this.getPeso() <= 70.3) {
			this.categoria = "leve";
		} else if (this.getPeso() > 70.3 && this.getPeso() < 83.9) {
			this.categoria = "medio";
		} else if (this.getPeso() > 83.9 && this.getPeso() < 120.2) {
			this.categoria = "pesado";
		} else {
			System.out.println("peso do lutador e invalido");
		}

	}// metodo categorizar

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (this.getPeso() < 55) {
//			this.setCategoria("invalida");
		} else if (this.getPeso() <= 70.3) {
			this.setCategoria("leve");
		} else if (this.getPeso() <= 83.9) {
//			this.setCategoria("Medio");
		} else if (this.getPeso() <= 120.2) {
			this.setCategoria("pesado");
		} else {
			System.out.println("peso do lutador e invalido");
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	@Override
	public void apresentar() {
		System.out.println("o lutador de hoje é: " + this.getNome());
		System.out.println("vem de : " + getNacionalidade());
		System.out.println("a idade atual do lutador é " + getIdade());
		System.out.println("medindo atualmente: " + getAltura());
		System.out.println("e na categoria " + getCategoria());
		System.out.println("-----------------");

	}

	@Override
	public void status() {
		System.out.println("o lutador tem o peso: " + getPeso());
		System.out.println("tem: " + getVitorias() + " no seu card");
		System.out.println("e ja teve: " + getDerrotas() + "no octogono");
	}

	@Override
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}

	@Override
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}

	@Override
	public void empatarLuta() {

	}

}
