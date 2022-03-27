package Aula07;

public class app {
	public static void main(String[] args) {
		
		Lutador lutador [] = new Lutador [6];
		
		lutador [0] = new Lutador ("netinho", "BR", 28, 1.65f,  90.0f, "", 3, 1);
		lutador [1] = new Lutador ("luizinho", "BR", 27, 1.70f,  85.0f, "", 4, 1);
		lutador [2] = new Lutador ("bruninho", "BR", 24, 1.71f,  75.0f, "", 2, 1);
		lutador [3] = new Lutador ("celio", "BR", 22, 1.72f,  70.0f, "", 1, 1);
		lutador [4] = new Lutador ("claudia", "BR", 26, 1.69f,  69.0f, "", 0, 1);
		lutador [5] = new Lutador ("thiago", "BR", 29, 1.74f,  55.0f, "", 1, 1);
		 
//		lutador [0].status();
//		lutador [0].apresentar();
		
		LutaAula08 luta = new LutaAula08();
		
		luta.marcarLuta(lutador[0], lutador[1]);
		luta.lutar();
		
	}
}
