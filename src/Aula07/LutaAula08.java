package Aula07;

import java.util.Random;

public class LutaAula08 {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta (Lutador lutador1, Lutador lutador2) {
		if (lutador1.getCategoria().equalsIgnoreCase(lutador2.getCategoria()) && 
				lutador1 != lutador2) {
			this.aprovada = true;
			this.desafiado = lutador1;
			this.desafiante = lutador2;
		}else {
			this.aprovada = false;
			System.out.println("luta não pode acontecer, lutador e o mesmo ou categoria diferentes.");
		}
	}
	public void lutar () {
		if(aprovada == true) {
			System.out.println("O desafiado da noite");
			this.desafiado.apresentar();
			System.out.println("O desafiante da noite");
			this.desafiante.apresentar();
			
			Random vencedor = new Random();
			
			int ganhador = vencedor.nextInt(3);
			switch (ganhador) {
			case 1 ://empate 
				{
					System.out.println("empatou");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
			}
			case 2 ://vitoria desafiado
			{
					System.out.println("vitoria do Desafiado");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
			}
			case 3 ://vitoria desafiado
			{
					System.out.println("vitoria do Desafiado");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
			}
//			case 3 ://vitoria desafiante
//			{
//				System.out.println("o desafiante venceu");
//				this.desafiante.ganharLuta();
//				this.desafiado.perderLuta();
//				break;
//			}
			}
		}
	}
	
}
