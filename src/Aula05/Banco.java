package Aula05;

public class Banco {
	// Atributos
	public int numeroConta;
	public String tipo, dono;
	public float saldo;
	public boolean status;

	// metodos
	public void estadoAtual() {
		System.out.println("---------------------------");
		System.out.println("" + this.getDono());
		System.out.println("" + this.getNumeroConta());
		System.out.println("" + this.getSaldo());
		System.out.println("" + this.getTipo());
		System.out.println("" + this.isStatus());
		System.out.println("---------------------------");
	}

	public void abrirConta() {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo.equalsIgnoreCase("cc")) {
			this.setSaldo(50);
		} else if (tipo.equalsIgnoreCase("cp")) {
			this.setSaldo(150);
		}
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("");
		} else if (this.getSaldo() < 0) {
			System.out.println("");
		} else {
			this.setStatus(false);
		}
	}

	public void depositar(float valor) {
		if (this.isStatus() == false) {
			System.out.println("");
		} else {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("");
		}
	}

	public void sacar(float valor) {
		if (this.isStatus() == false) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(getSaldo() - valor);
				System.out.println("" + getSaldo());
			}
		} else {
			System.out.println("não realizado");
		}
	}

	public void pagarMensalidade() {

	}

	// metodos especiais
	public Banco() {
		this.setSaldo(0);
		this.status = false;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
