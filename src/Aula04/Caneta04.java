package Aula04;

public class Caneta04 {
	
	public String modelo;
	public float ponta;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public void status () {
		System.out.println("A caneta e: ");
		System.out.println("Modelo" + this.modelo);
		System.out.println("" + this.ponta);
		}
}
