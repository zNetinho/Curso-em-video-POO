package orientacaoObjeto;

public class Caneta {
		String cor, modelo;
		float ponta;
		int carga;
		boolean tampada;
		
		void status ( ) {
			System.out.println("" + this.modelo);
			System.out.println("" + this.cor);
			System.out.println("" + this.carga);
			System.out.println("" + this.ponta);
			System.out.println("" + this.tampada);
			
		}
		void rabiscar () {
			
		}
		void tampar () {
			this.tampada = true;
		}
		void destampar () {
			this.tampada = false;
		}
}
