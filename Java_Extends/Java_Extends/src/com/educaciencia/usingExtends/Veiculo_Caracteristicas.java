package com.educaciencia.usingExtends;

public class Veiculo_Caracteristicas {

	public String nome;
	public String fabricante;
	public String cor;
	public String motor;
	public String combustivel;

	public Veiculo_Caracteristicas() {
	}

	public Veiculo_Caracteristicas(String nome, String fabricante, String cor, String motor, String combustivel) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.cor = cor;
		this.motor = motor;
		this.combustivel = combustivel;
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
