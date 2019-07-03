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
	for(int i =0; i< combustiveis.size(); i++) {
		System.out.println("Tipo de Combustive " + combustiveis.get(i).getTipo_combustivel());
		System.out.println("Tipo de Abastecimento " + combustiveis.get(i).getData_abastecimento());
		System.out.println("Tipo de Kilomentragem " + combustiveis.get(i).getKilometragem());
		System.out.println("Tipo de Valor Total " + combustiveis.get(i).getValor_total());
		System.out.println("Tipo de Abastecimento " + combustiveis.get(i).getTipo_abastecimento());
		System.out.println("Tipo de VCombustive " + combustiveis.get(i).getValor_combustivel());
	}
	
}


public void cadastrarVeiculo() {
	Veiculo veiculo = new Veiculo();
	veiculo.setMarca(JOptionPane.showInputDialog("Digite a marca: \n"));
	veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo: \n"));
	veiculo.setAno_fabricacao(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricacao: \n")));
	veiculo.setAno_modelo(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do modelo: \n")));
	veiculo.setMotorizacao(Float.parseFloat(JOptionPane.showInputDialog("Digite a motorizacao: \n")));
	veiculo.setCombustivel(JOptionPane.showInputDialog("Digite o tipo de combustivel: \n"));
	veiculo.setCor(JOptionPane.showInputDialog("Digite a cor: \n"));
	veiculo.setPlaca(JOptionPane.showInputDialog("Digite a placa: \n"));
	veiculo.setRenavam(JOptionPane.showInputDialog("Digite o renavam: \n"));
	JOptionPane.showMessageDialog(null, "Carro cadastrado !");
}
}
