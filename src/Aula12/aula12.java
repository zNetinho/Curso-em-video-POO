package Aula12;

public class aula12 {

	public static void main(String[] args) {

		Mamifero mamifero = new Mamifero();
		mamifero.setNome("Bernardo");
		mamifero.setMembros(4);
		mamifero.setPeso(20.3f);
		mamifero.setIdade(3);
		mamifero.setSexo("Macho");
		mamifero.setCorDoPelo("caramelo");
		
		System.out.println(mamifero.apresentar() + "\n");
		
		Reptil reptil = new Reptil ();
		reptil.setNome("Fogur");
		reptil.setMembros(0);
		reptil.setPeso(8.3f);
		reptil.setIdade(3);
		reptil.setSexo("Macho");
		reptil.setCorEscama("pretas");
		reptil.setVenenoso(true);
		
		System.out.println(reptil.apresentar());
		
		Peixe peixe= new Peixe();
		peixe.setNome("rufus");
		peixe.setMembros(2);
		peixe.setPeso(2.3f);
		peixe.setIdade(1);
		peixe.setSexo("Femea");
		peixe.setCorEscama("pratas");
		
		System.out.println(peixe.apresentar());
		
		Ave ave = new Ave();
		ave.setNome("anastacia");
		ave.setMembros(2);
		ave.setIdade(1);
		ave.setPeso(0.6f);
		ave.setSexo("femea");
		ave.setCorDaPena("azul");
		ave.setExotica(true);
		
		System.out.println(ave.apresentar());
	}

}
