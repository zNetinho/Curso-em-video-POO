package Aula06;

public class Controlador implements controle {
	private int volume;
	private boolean tocando, tocandoSom, ligado;

	public Controlador(int volume, boolean tocando, boolean tocandoSom, boolean ligado) {
		super();
		this.volume = volume;
		this.tocando = tocando;
		this.tocandoSom = tocandoSom;
		this.ligado = ligado;

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	public boolean isTocandoSom() {
		return tocandoSom;
	}

	public void setTocandoSom(boolean tocandoSom) {
		this.tocandoSom = tocandoSom;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	@Override
	public void ligar() {
		if (isLigado() == false) {
			ligar();
		} else if (isLigado() == true) {
			desligar();
		}

	}

	@Override
	public void desligar() {
		if (isLigado() == true) {
			ligar();
		} else if (isLigado() == false) {
			desligar();
		}

	}

	@Override
	public void volumeMais() {
		if (this.isLigado() == true) {
			if (getVolume() <= 100) {
				setVolume(+1);
			} else {
				System.out.println("TV desligada");
			}
		}

	}

	@Override
	public void volumeMenos() {

		if (getVolume() <= 0) {
			if (this.isLigado() == true) {
				if (this.getVolume() == 100) {
					setVolume(-1);
				}
				if (getVolume() == 0) {
					ligarMudo();
				}
			}
		}
	}

	@Override
	public void ligarMudo() {
		if (isLigado() == true) {
			if (getVolume() > 0) {
				setVolume(0);
				ligarMudo();
			}
		}
	}

	@Override
	public void desligarMudo() {
		if (isLigado() == true) {
			if (getVolume() == 0) {
				desligarMudo();
				setVolume(10);
			}
		}
	}

	@Override
	public void pause() {
		if (this.isTocando() == true) {
			pause();
		} else {
			play();
		}
	}

	@Override
	public void play() {
		if (this.isTocando() == false) {
			play();
		} else {
			pause();
		}
	}

}