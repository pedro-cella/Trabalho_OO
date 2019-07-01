package veiculo;
import manutencao.Combustivel;

public class Veiculo {
private String marca;
private String modelo;
private int ano_fabricacao;
private int ano_modelo;
private float motorizacao;
public String combustivel;
private String cor;
private String placa;
private String renavam;

Combustivel comb = new Combustivel();

public Veiculo(){
	
}

public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getAno_fabricacao() {
	return ano_fabricacao;
}
public void setAno_fabricacao(int ano_fabricacao) {
	this.ano_fabricacao = ano_fabricacao;
}
public int getAno_modelo() {
	return ano_modelo;
}
public void setAno_modelo(int ano_modelo) {
	this.ano_modelo = ano_modelo;
}
public float getMotorizacao() {
	return motorizacao;
}
public void setMotorizacao(float motorizacao) {
	this.motorizacao = motorizacao;
}
public String getCombustivel() {
	return combustivel;
}
public void setCombustivel(String combustivel) {
	this.combustivel = combustivel;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getRenavam() {
	return renavam;
}
public void setRenavam(String renavam) {
	this.renavam = renavam;
}


	
	
	
}
