package com.educaciencia.usingExtends;

public class Veiculo_de_Carga extends Veiculo_Caracteristicas {

	public String eixos;
	public String comprimento;

	public Veiculo_de_Carga() {
	}

	public Veiculo_de_Carga(String eixos, String comprimento) {
		this.eixos = eixos;
		this.comprimento = comprimento;
	}

	public Veiculo_de_Carga(String eixos, String comprimento, String nome, String fabricante, String cor, String motor,
			String combustivel) {
		super(nome, fabricante, cor, motor, combustivel);
		this.eixos = eixos;
		this.comprimento = comprimento;
	}

	public String getEixos() {
		return eixos;
	}

	public void setEixos(String eixos) {
		this.eixos = eixos;
	}

	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
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
