package Aula11;

public class aula11 {
	public static void main(String[] args) {
		
		Visitante v1 = new Visitante("neto", "masculino312", 24);
		
		System.out.println(v1.apresentar());
		//exemplo de uma herança pobre
		
		Aluno aluno1 = new Aluno("Neto", "Masculino", 24, "POO", 30);
		
		System.out.println(aluno1.apresentarAluno());
		//exemplo de uma herança um pouco mais composta onde herdamos os metodos e atributos
		//e acresentamos mais
		
		Bolsita bolsita1 = new Bolsita ("Neto", "masculino", 24, "POO", 30);
		bolsita1.setBolsa(30.5f);
		System.out.println(bolsita1.apresentar());
		
	}
}
