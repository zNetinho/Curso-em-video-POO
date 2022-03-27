package Aula09;

public class Principal {

	public static void main(String[] args) {
		Pessoa[] pessoa = new Pessoa[3];
		Livro[] livros = new Livro[3];

		pessoa[0] = new Pessoa("Neto", "Masculino", 24);
		pessoa[1] = new Pessoa("Joana", "Feminino", 54);
		pessoa[2] = new Pessoa("Junior", "Masculino", 22);
//		pessoa[3] = new Pessoa("Memesvaldo", "Masculino", 27);

		livros[0] = new Livro("Heartstopper: Minha pessoa favorita (vol. 2)", "Alice Oseman", 320, pessoa[2]);
		livros[1] = new Livro("Enquanto eu não te encontro", "Pedro Rhuas", 272, pessoa[1]);
		livros[2] = new Livro("Vermelho, branco e sangue azu", "Casey McQuiston", 392, pessoa[0]);
		
		System.out.println(livros[0].detalhes());
		System.out.println(livros[1].detalhes());
		System.out.println(livros[2].detalhes());
		
	}
}
