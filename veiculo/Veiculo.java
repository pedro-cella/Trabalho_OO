package veiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import excessoes.CombustivelIncompativelException;
import excessoes.DescricaoEmBrancoException;
import excessoes.ValorInvalidoException;
import manutencao.Combustivel;
import manutencao.Imposto;
import manutencao.Multa;
import manutencao.Financiamento;
import manutencao.Manutencao;
import manutencao.Seguro;

public class Veiculo{
private ArrayList<Combustivel> combustiveis;
private ArrayList<Imposto> impostos;
private ArrayList<Multa> multas;
private ArrayList<Financiamento> financiamentos;
private ArrayList<Seguro> seguros;
private ArrayList<Manutencao> manutencoes;
private String marca;
private String modelo;
private int ano_fabricacao;
private int ano_modelo;
private double motorizacao;
public String combustivel;
private String cor;
private String placa;
private String renavam;
private double totalDesp = 0; //variavel global

public Veiculo(){
	this.combustiveis = new ArrayList<>();
	this.impostos = new ArrayList<>();
	this.multas = new ArrayList<>();
	this.financiamentos = new ArrayList<>();
	this.seguros = new ArrayList<>();
	this.manutencoes = new ArrayList<>();
}

public String getMarca() {
	return marca;
}
public void setMarca(String marca) throws DescricaoEmBrancoException{
	if(marca.isEmpty())
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) throws DescricaoEmBrancoException{
	if(modelo.isEmpty())
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.modelo = modelo;
}
public int getAno_fabricacao() {
	return ano_fabricacao;
}
public void setAno_fabricacao(int ano_fabricacao) throws ValorInvalidoException{
	if(ano_fabricacao < 1950 || ano_fabricacao > 2020) {
		throw new ValorInvalidoException("Ano de fabricação inválido!");
	}else {
		this.ano_fabricacao = ano_fabricacao;
	}
}
public int getAno_modelo() {
	return ano_modelo;
}
public void setAno_modelo(int ano_modelo) throws ValorInvalidoException{
	if(ano_modelo < 1950 || ano_modelo > 2020) {
		throw new ValorInvalidoException("Ano do modelo inválido!");
	}else {
		this.ano_modelo = ano_modelo;
	}
}
public double getMotorizacao() {
	return motorizacao;
}
public void setMotorizacao(double motorizacao) throws ValorInvalidoException {
	if(motorizacao < 1.0 || motorizacao > 8.1) {
		throw new ValorInvalidoException("Motorização inválida!");
	}else {
		this.motorizacao = motorizacao;
	}
}
public String getCombustivel() {
	return combustivel;
}
public void setCombustivel(String combustivel) throws DescricaoEmBrancoException,CombustivelIncompativelException {
	if(combustivel.isEmpty()) {
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	}else {
		this.combustivel = combustivel;
	}
}
public String getCor() {
	return cor;
}
public void setCor(String cor) throws DescricaoEmBrancoException {
	if(cor.isEmpty())
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.cor = cor;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) throws DescricaoEmBrancoException {
	if(placa.isEmpty())
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.placa = placa;
}
public String getRenavam() {
	return renavam;
}

public void setRenavam(String renavam) throws DescricaoEmBrancoException{
	if(renavam.isEmpty())
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.renavam = renavam;
}

//Polimorfismo- Inicio
public void adDes(Combustivel tmpComb) {
	combustiveis.add(tmpComb);
}

public void adDes(Imposto tmpImp) {
	impostos.add(tmpImp);
}

public void adDes(Multa tmpMult) {
	multas.add(tmpMult);
}

public void adDes(Financiamento tmpFin) {
	financiamentos.add(tmpFin);
}

public void adDes(Seguro tmpSeg) {
	seguros.add(tmpSeg);
}

public void adDes(Manutencao tmpManut) {
	manutencoes.add(tmpManut);
}
//- Fim

public void imprimedados(){
	if(combustiveis.size() == 0) {
		JOptionPane.showMessageDialog(null, combustiveis.size() + " abastecimentos cadastrados");
	}else {
		int i;
		for(i = 0; i < combustiveis.size(); i++) {
			JOptionPane.showMessageDialog(null, "Tipo de Combustivel: " + combustiveis.get(i).getTipo_combustivel()
												+ "\nData do Abastecimento: " + combustiveis.get(i).getData_abastecimento()
												+ "\nValor Total: " + combustiveis.get(i).getValor_total()); 
		}
		if(combustiveis.size() == 1) {
			i = 0;
			JOptionPane.showMessageDialog(null, "\nKilometragem rodada: " + combustiveis.get(i).getKilometragem());
			JOptionPane.showMessageDialog(null, "\nQuantidade abastecida: " + (combustiveis.get(i).getValor_total()/combustiveis.get(i).getValor_combustivel()) + "L");
		}else {
				JOptionPane.showMessageDialog(null, "\nKilometragem rodada: "  + (combustiveis.get(combustiveis.size() - 1).getKilometragem() - combustiveis.get(combustiveis.size() - 2).getKilometragem()));
				JOptionPane.showMessageDialog(null, "\nQuantidade abastecida: " + (combustiveis.get(combustiveis.size() - 1).getValor_total()/combustiveis.get(combustiveis.size() - 1).getValor_combustivel()) + "L");
		}
		
	}
	
	if(impostos.size() == 0) {
		JOptionPane.showMessageDialog(null, impostos.size() + " impostos cadastrados\n");
	}else {
		for(int i = 0; i < impostos.size(); i++) {
			JOptionPane.showMessageDialog(null, "Nome da despesa: " + impostos.get(i).getNome_despesa()
												+ "\nAno: " + impostos.get(i).getAno_despesa()
												+ "\nCategoria: " + impostos.get(i).getCategoria()
												+ "\nValor do imposto: " + impostos.get(i).getValor_despesa());
		}
	}
	
	if(multas.size() == 0) {
		JOptionPane.showMessageDialog(null, multas.size() + " multas cadastradas\n");
	}else {
		for(int i = 0; i < multas.size(); i++) {
			JOptionPane.showMessageDialog(null, "Nome da despesa: " + multas.get(i).getNome_despesa()
												+ "\nAno: " + multas.get(i).getAno_despesa()
												+ "\nCategoria: " + multas.get(i).getCategoria()
												+ "\nValor da multa: " + multas.get(i).getValor_despesa());
		}
	}

	if(financiamentos.size() == 0) {
		JOptionPane.showMessageDialog(null, financiamentos.size() + " financiamentos cadastrados\n");
	}else {
		for(int i = 0; i < financiamentos.size(); i++) {
			JOptionPane.showMessageDialog(null, "Nome da despesa: " + financiamentos.get(i).getNome_despesa()
												+ "\nAno: " + financiamentos.get(i).getAno_despesa()
												+ "\nCategoria: " + financiamentos.get(i).getCategoria()
												+ "\nValor do financiamento: " + financiamentos.get(i).getValor_despesa());
		}
	}

	if(seguros.size() == 0) {
		JOptionPane.showMessageDialog(null, seguros.size() + " seguros cadastrados\n");
	}else {
		for(int i = 0; i < seguros.size(); i++) {
			JOptionPane.showMessageDialog(null, "Nome da despesa: " + seguros.get(i).getNome_despesa()
												+ "\nAno: " + seguros.get(i).getAno_despesa()
												+ "\nCategoria: " + seguros.get(i).getCategoria()
												+ "\nValor do seguro: " + seguros.get(i).getValor_despesa());
		}
	}
	
	if(manutencoes.size() == 0) {
		JOptionPane.showMessageDialog(null, manutencoes.size() + " manutencoes cadastradas\n");
	}else {
		for(int i = 0; i < manutencoes.size(); i++) {
			JOptionPane.showMessageDialog(null, "Nome da manutencao: " + manutencoes.get(i).getNome_despesa()
												+ "\nValor da manutencao: " + manutencoes.get(i).getValor_despesa());
		}
	}
}

public void consumo_veiculo() { //Problema de impressao corrigida
	if(combustiveis.size()%2 == 0) {
		if(combustiveis.get(combustiveis.size() - 2).getTipo_abastecimento().equalsIgnoreCase("Tanque-Cheio") && (combustiveis.get(combustiveis.size() - 1).getTipo_abastecimento().equalsIgnoreCase("Tanque-Cheio"))) {
			JOptionPane.showMessageDialog(null, "O consumo do seu veiculo e: "
					+ ((combustiveis.get(combustiveis.size() - 1).getKilometragem() - combustiveis.get(combustiveis.size() - 2).getKilometragem())/(combustiveis.get(combustiveis.size() - 1).getValor_total()/combustiveis.get(combustiveis.size() - 1).getValor_combustivel())));
		}
	}else {
		JOptionPane.showMessageDialog(null, "E necessario ter feito um numero de abastecimentos par para se ter o consumo do veiculo");
	}
}

public void custo_km_rodado() {//ESTA DANDO PROBLEMA DE ACESSO NO ARRAY
	
	if(combustiveis.size() == 1) {
	totalDesp = combustiveis.get(combustiveis.size() - 1).getValor_combustivel();
	}else if(combustiveis.size() >= 2){
		for(int i = 0; i < combustiveis.size(); i++){
			totalDesp += combustiveis.get(i).getValor_total();
		}
	}
	
	if(impostos.size() == 1) {
		totalDesp += impostos.get(impostos.size() - 1).getValor_despesa();
	}else if(impostos.size() >= 2){
		for(int i = 0; i < impostos.size(); i++){
			totalDesp += impostos.get(i).getValor_despesa();
		}
	}
	
	if(multas.size() == 1) {
		totalDesp += multas.get(multas.size() - 1).getValor_despesa();
	}else if(multas.size() >= 2){
		for(int i = 0; i < multas.size(); i++){
			totalDesp += multas.get(i).getValor_despesa();
		}
	}
	
	if(financiamentos.size() == 1) {
		totalDesp += financiamentos.get(financiamentos.size() - 1).getValor_despesa();
	}else if(financiamentos.size() >= 2){
		for(int i = 0; i < financiamentos.size(); i++){
			totalDesp += financiamentos.get(i).getValor_despesa();
		}
	}
	
	if(seguros.size() == 1) {
		totalDesp += seguros.get(seguros.size() - 1).getValor_despesa();
	}else if(seguros.size() >= 2){
		for(int i = 0; i < seguros.size(); i++){
			totalDesp += seguros.get(i).getValor_despesa();
		}
	}
	if(manutencoes.size() == 1) {
		totalDesp += manutencoes.get(manutencoes.size() - 1).getValor_despesa();
	}else if(seguros.size() >= 2){
		for(int i = 0; i < seguros.size(); i++){
			totalDesp += seguros.get(i).getValor_despesa();
		}
	}
	
	JOptionPane.showMessageDialog(null, "Custo do KM rodade: "+ totalDesp /(combustiveis.get(combustiveis.size() - 1).getKilometragem() - combustiveis.get(combustiveis.size() - 2).getKilometragem()));
	
	
}

}
