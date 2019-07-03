package main;
import javax.swing.JOptionPane;
import manutencao.Combustivel;
import manutencao.Despesas;
import manutencao.Manutencao;
import veiculo.Veiculo;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int opcao, N, i = 0, escolha;
		String quantidade, tipo, numero;
		ArrayList<Veiculo> listadeVeiculos = new ArrayList<>();
		ArrayList<Combustivel> listadeAbastecimento = new ArrayList<>();
		ArrayList<Despesas> listadeDespesas = new ArrayList<>();
		ArrayList<Manutencao> listadeManutencoes = new ArrayList<>();
		JOptionPane.showMessageDialog(null, "Seja bem vindo ao Carrorama!\n");
		
		do {
				String Selecioneop = JOptionPane.showInputDialog("O que deseja fazer:\n"
						+ "1- Cadastrar veiculo\n"
						+ "2- Cadastrar abastecimento\n"
						+ "3- Cadastrar despesa\n"
						+ "4- Relatorio simples\n"
						+ "5- Relatorio de desempenho\n"
						+ "6- Sair");
				
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
						veiculo.setCombustivel(JOptionPane.showInputDialog("Digite o tipo de combustivel: \n"));
						veiculo.setCor(JOptionPane.showInputDialog("Digite a cor: \n"));
						veiculo.setPlaca(JOptionPane.showInputDialog("Digite a placa: \n"));
						veiculo.setRenavam(JOptionPane.showInputDialog("Digite o renavam: \n"));
						listadeVeiculos.add(veiculo);
						JOptionPane.showMessageDialog(null, "Carro cadastrado !");
					}
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + " carros cadastrados\n");
					numero = JOptionPane.showInputDialog("Para qual deles voce deseja registrar o abastecimento: \n");
					i = Integer.parseInt(numero);
					Combustivel abastecimento = new Combustivel();
					abastecimento.setData_abastecimento(JOptionPane.showInputDialog("Data do abastecimento: \n"));
					abastecimento.setKilometragem(Integer.parseInt(JOptionPane.showInputDialog("Kilometragem atual: ")));
					abastecimento.setTipo_abastecimento(JOptionPane.showInputDialog("Qual o tipo de abastecimento: \n1- Tanque-Cheio\n2- Tanque-Nao-Cheio\n"));
					abastecimento.setTipo_combustivel(listadeVeiculos.get(i).getCombustivel());
					abastecimento.setValor_combustivel(Float.parseFloat(JOptionPane.showInputDialog("Preco da gasolina: \n")));
					abastecimento.setValor_total(Float.parseFloat(JOptionPane.showInputDialog("Valor total do abastecimento: \n")));
					listadeVeiculos.get(i).adComb(abastecimento);
					//listadeVeiculos.get(listadeVeiculos.size() - 1).adComb(abastecimento);
					JOptionPane.showMessageDialog(null, "Abastecimento cadastrado !");
					break;
				case 3:
					tipo = JOptionPane.showInputDialog("Qual o tipo de despesa: \n1- Imposto\n2- Manutencao");
					escolha = Integer.parseInt(tipo);
					switch(escolha) {
						case 1:
							Despesas despesa = new Despesas();
							despesa.setAno_despesa(JOptionPane.showInputDialog("Data: \n"));
							despesa.setCategoria(JOptionPane.showInputDialog("Categoria: \n"));
							despesa.setDescricao(JOptionPane.showInputDialog("Descricao: \n"));
							despesa.setValor_total(Double.parseDouble(JOptionPane.showInputDialog("Valor total: \n")));
							despesa.calculaValor_total(despesa.getValor_total());
							listadeDespesas.add(despesa);
							break;
						case 2:
							Manutencao manutencao = new Manutencao();
							manutencao.setNome_despesa(JOptionPane.showInputDialog("Nome: \n"));
							manutencao.setOdometro(listadeAbastecimento.get(i).getKilometragem());
							listadeManutencoes.add(manutencao);
							break;
					}
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + "carros cadastrados\n");
					numero = JOptionPane.showInputDialog("De qual deles voce deseja o relatorio: \n");
					i = Integer.parseInt(numero);
					listadeVeiculos.get(i).imprimedados();
					break;
				}
		}while(opcao != 6);
	}

}