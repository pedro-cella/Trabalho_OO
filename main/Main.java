package main;
import javax.swing.JOptionPane;
import manutencao.Combustivel;
import veiculo.Veiculo;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int opcao, N, i;
		String quantidade;
		ArrayList<Veiculo> listadeVeiculos = new ArrayList<>();
		ArrayList<Combustivel> listadeAbastecimento = new ArrayList<>();
		JOptionPane.showMessageDialog(null, "Seja bem vindo ao Carrorama!\n");
		
		do {
				String Selecioneop = JOptionPane.showInputDialog("O que deseja fazer:\n1- Cadastrar veiculo\n2- Cadastrar abastecimento\n3- Cadastrar despesa\n4- Relatorio simples\n"
						+ "5- Relatorio de desempenho\n6- Sair");
				
				opcao = Integer.parseInt(Selecioneop);
				
				switch(opcao) {
				case 1:
					quantidade = JOptionPane.showInputDialog("Quantos veiculos deseja cadastrar: \n");
					N = Integer.parseInt(quantidade);
					for(i = 0; i < N; i++){
						Veiculo veiculo = new Veiculo();
						veiculo.setMarca(JOptionPane.showInputDialog("Digite a marca: \n"));
						veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo: \n"));
						veiculo.setAno_fabricacao(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricacao: \n")));
						veiculo.setAno_modelo(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do modelo: \n")));
						veiculo.setMotorizacao(Float.parseFloat(JOptionPane.showInputDialog("Digite a motorizacao: \n")));
						veiculo.setCombustivel(JOptionPane.showInputDialog("Digite o tipo de combustivel: \n"));// <---PEGAR ESSA INFORMACAO
						veiculo.setCor(JOptionPane.showInputDialog("Digite a cor: \n"));
						veiculo.setPlaca(JOptionPane.showInputDialog("Digite a placa: \n"));
						veiculo.setRenavam(JOptionPane.showInputDialog("Digite o renavam: \n"));
						listadeVeiculos.add(veiculo);
						JOptionPane.showMessageDialog(null, "Carro cadastrado !");
					}
					break;
				case 2:
					Combustivel abastecimento = new Combustivel();
					abastecimento.setData_abastecimento(JOptionPane.showInputDialog("Data do abastecimento: \n"));
					abastecimento.setKilometragem(Integer.parseInt(JOptionPane.showInputDialog("Kilometragem atual: ")));
					abastecimento.setTipo_abastecimento(JOptionPane.showInputDialog("Qual o tipo de abastecimento: \n1- Tanque-Cheio\n2- Tanque-Nao-Cheio\n"));
					abastecimento.setTipo_combustivel(listadeVeiculos.get(i).getCombustivel());
					abastecimento.setValor_combustivel(Float.parseFloat(JOptionPane.showInputDialog("Preco da gasolina: \n")));
					abastecimento.setValor_total(Float.parseFloat(JOptionPane.showInputDialog("Valor total do abastecimento: \n")));
					listadeAbastecimento.add(abastecimento);
					JOptionPane.showMessageDialog(null, "Abastecimento cadastrado !");
				}
					break;
				case 3:
					
					break;
			
		}while(opcao != 6);

	}

}
