package com.educaciencia.usingExtends;

public class Veiculo_de_Passeio extends Veiculo_Caracteristicas {

	public String portas;
	public String lugares;

	public Veiculo_de_Passeio() {
	}

	public Veiculo_de_Passeio(String portas, String lugares) {
		this.portas = portas;
		this.lugares = lugares;
	}

	public Veiculo_de_Passeio(String portas, String lugares, String nome, String fabricante, String cor, String motor,
			String combustivel) {
		super(nome, fabricante, cor, motor, combustivel);
		this.portas = portas;
		this.lugares = lugares;
	}

	public String getPortas() {
		return portas;
	}

	public void setPortas(String portas) {
		this.portas = portas;
	}

	public String getLugares() {
		return lugares;
	}

	public void setLugares(String lugares) {
		this.lugares = lugares;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

}
