package veiculo;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import manutencao.Combustivel;

public class Veiculo {
private ArrayList<Combustivel> combustiveis;
private String marca;
private String modelo;
private int ano_fabricacao;
private int ano_modelo;
private float motorizacao;
public String combustivel;
private String cor;
private String placa;
private String renavam;

public Veiculo(){
	this.combustiveis = new ArrayList<>();
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

public void adComb(Combustivel tmpComb) {
	combustiveis.add(tmpComb);
}

public void imprimedados() {
	for(int i = 0; i < combustiveis.size(); i++) {
		JOptionPane.showMessageDialog(null, "Tipo de Combustivel " + combustiveis.get(i).getTipo_combustivel()
											+ "\nTipo de Abastecimento " + combustiveis.get(i).getData_abastecimento()
											+ "\nTipo de Kilometragem " + combustiveis.get(i).getKilometragem()
											+ "\nTipo de Valor Total " + combustiveis.get(i).getValor_total()
											+ "\nTipo de Abastecimento " + combustiveis.get(i).getTipo_abastecimento()
											+"\nTipo de VCombustive " + combustiveis.get(i).getValor_combustivel());
	}
	
}

}
