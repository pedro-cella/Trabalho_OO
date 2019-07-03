package main;
import javax.swing.JOptionPane;
import veiculo.Veiculo;
import manutencao.Combustivel;
import java.util.ArrayList;
public class Relatorio_simples{
public int posicao;
public Veiculo veiculo;
public Combustivel abastecimento;

Relatorio_simples(){
	
}

public int getPosicao() {
	return posicao;
}

public void setPosicao(int posicao) {
	this.posicao = posicao;
}

public Veiculo cadastrarVeiculo() {
	
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
	return veiculo;
}

public Combustivel cadastrarAbastecimento() {
	this.abastecimento = new Combustivel();
	abastecimento.setData_abastecimento(JOptionPane.showInputDialog("Data do abastecimento: \n"));
	abastecimento.setKilometragem(Integer.parseInt(JOptionPane.showInputDialog("Kilometragem atual: ")));
	abastecimento.setTipo_abastecimento(JOptionPane.showInputDialog("Qual o tipo de abastecimento: \n1- Tanque-Cheio\n2- Tanque-Nao-Cheio\n"));
	abastecimento.setTipo_combustivel(veiculo.getCombustivel());
	abastecimento.setValor_combustivel(Float.parseFloat(JOptionPane.showInputDialog("Preco da gasolina: \n")));
	abastecimento.setValor_total(Float.parseFloat(JOptionPane.showInputDialog("Valor total do abastecimento: \n")));
	return abastecimento;
}

public String imprimirVeiculo() {
	String relatorio;
	relatorio = JOptionPane.showMessageDialog(null, "Data: " + this.abastecimento.getData_abastecimento());
	return relatorio;
}

}
