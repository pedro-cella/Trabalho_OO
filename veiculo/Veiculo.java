package veiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import manutencao.Combustivel;
import manutencao.Imposto;
import manutencao.Multa;
import manutencao.Financiamento;
import manutencao.Manutencao;
import manutencao.Seguro;
import excessoes.Excessoes;

public class Veiculo extends Excessoes{
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
public double getMotorizacao() {
	return motorizacao;
}
public void setMotorizacao(double motorizacao) {
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

//Possivel Polimorfismo- Inicio
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

public void imprimedados() {
	if(combustiveis.size() == 0) {
		JOptionPane.showMessageDialog(null, combustiveis.size() + " abastecimentos cadastrados");
	}else {
		for(int i = 0; i < combustiveis.size(); i++) {
			JOptionPane.showMessageDialog(null, "Tipo de Combustivel: " + combustiveis.get(i).getTipo_combustivel()
												+ "\nData do Abastecimento: " + combustiveis.get(i).getData_abastecimento()
												+ "\nKilometragem: " + combustiveis.get(i).getKilometragem()
												+ "\nValor Total: " + combustiveis.get(i).getValor_total()
												+ "\nTipo do Abastecimento: " + combustiveis.get(i).getTipo_abastecimento()
												+"\nPreco da gasolina: " + combustiveis.get(i).getValor_combustivel());
		}
	}
	
	if(impostos.size() == 0) {
		JOptionPane.showMessageDialog(null, combustiveis.size() + " impostos cadastrados\n");
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

}
