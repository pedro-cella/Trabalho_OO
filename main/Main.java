package main;
import javax.swing.JOptionPane;

import excessoes.CombustivelIncompativelException;
import excessoes.DescricaoEmBrancoException;
import excessoes.ValorInvalidoException;
import manutencao.Combustivel;
import manutencao.Imposto;
import manutencao.Financiamento;
import manutencao.Multa;
import manutencao.Seguro;
import manutencao.Manutencao;
import veiculo.Veiculo;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int opcao, N, i = 0, escolha;
		String quantidade, tipo, numero;
		ArrayList<Veiculo> listadeVeiculos = new ArrayList<>();
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
					//quantidade = JOptionPane.showInputDialog("Quantos veiculos deseja cadastrar: \n");
					//N = Integer.parseInt(quantidade);
					//for(i = 0; i < N; i++)
					int n = 1;
					int i1 = 0;
					do{
						Veiculo veiculo = new Veiculo();
						try {
							veiculo.setMarca(JOptionPane.showInputDialog("Digite a marca: \n"));
						} catch (DescricaoEmBrancoException e) {
							e.printStackTrace();
						}
						try {
							veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo: \n"));
						} catch (DescricaoEmBrancoException e) {
							e.printStackTrace();
						}
						try {
							veiculo.setAno_fabricacao(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricacao: \n")));
						} catch (ValorInvalidoException e) {
							e.printStackTrace();
						}
						try {
							veiculo.setAno_modelo(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do modelo: \n")));
						}catch(ValorInvalidoException e){
							e.printStackTrace();
						}
						try {
							veiculo.setMotorizacao(Double.parseDouble(JOptionPane.showInputDialog("Digite a motorizacao: \n")));
						}catch (ValorInvalidoException e) {
							e.printStackTrace();
						}
						try {
							veiculo.setCombustivel(JOptionPane.showInputDialog("Digite o tipo de combustivel: \n"));
						}catch(DescricaoEmBrancoException e) {
							e.printStackTrace();
						}catch(CombustivelIncompativelException e) {
							e.printStackTrace();
						}
						try {
							veiculo.setCor(JOptionPane.showInputDialog("Digite a cor: \n"));
						}catch(DescricaoEmBrancoException e) {
							e.printStackTrace();
						}
						try {
							veiculo.setPlaca(JOptionPane.showInputDialog("Digite a placa: \n"));
						}catch(DescricaoEmBrancoException e) {
							e.printStackTrace();
						}
						try {
							veiculo.setRenavam(JOptionPane.showInputDialog("Digite o renavam: \n"));
						}catch(DescricaoEmBrancoException e) {
							e.printStackTrace();
						}
						listadeVeiculos.add(veiculo);
						JOptionPane.showMessageDialog(null, "Carro cadastrado !");
						
						int pergunta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais carros? \n");
						
						if(pergunta==1) {
							break;
						}else{
							i1++;
							n++;
						}
					}while(i1<n);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + " carros cadastrados\n");
					numero = JOptionPane.showInputDialog("Para qual deles voce deseja registrar o abastecimento: \n");
					i = Integer.parseInt(numero);
					Combustivel abastecimento = listadeVeiculos.get(i).CadastroAbastecimento();
					try {
						abastecimento.setData_abastecimento(JOptionPane.showInputDialog("Data do abastecimento: \n"));
					}catch(DescricaoEmBrancoException e) {
						e.printStackTrace();
					}
					try {
						abastecimento.setKilometragem(Integer.parseInt(JOptionPane.showInputDialog("Kilometragem atual: ")));
					}catch(ValorInvalidoException e) {
						e.printStackTrace();
					}
					try {
						abastecimento.setTipo_abastecimento(JOptionPane.showInputDialog("Qual o tipo de abastecimento: \n1- Tanque-Cheio\n2- Tanque-Nao-Cheio\n"));
					}catch(DescricaoEmBrancoException e) {
						e.printStackTrace();
					}
					try {
						abastecimento.setTipo_combustivel(JOptionPane.showInputDialog("Tipo de combustivel: "));
					}catch(DescricaoEmBrancoException e) {
						e.printStackTrace();
					}catch(CombustivelIncompativelException e) {
						e.printStackTrace();
					}
					try {
						abastecimento.setValor_combustivel(Float.parseFloat(JOptionPane.showInputDialog("Preco da gasolina: \n")));
					}catch(ValorInvalidoException e) {
						e.printStackTrace();
					}
					try {
						abastecimento.setValor_total(Float.parseFloat(JOptionPane.showInputDialog("Valor total do abastecimento: \n")));
					}catch(ValorInvalidoException e) {
						e.printStackTrace();
					}
					listadeVeiculos.get(i).adDes(abastecimento);
					JOptionPane.showMessageDialog(null, "Abastecimento cadastrado !");
					break;
				case 3:
					tipo = JOptionPane.showInputDialog("Qual o tipo de despesa: \n1- Impostos e afins\n2- Manutencao");
					escolha = Integer.parseInt(tipo);
					switch(escolha) {
						case 1:
							String selecione = JOptionPane.showInputDialog("Qual tipo de despesa gostaria de cadastrar: "
																			+ "\n1- Imposto"
																			+ "\n2- Multa"
																			+ "\n3- Financiamento"
																			+ "\n4- Seguro");
							int suaescolha = Integer.parseInt(selecione);
							switch(suaescolha) {
								case 1:
									JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + " carros cadastrados\n");
									numero = JOptionPane.showInputDialog("Para qual deles voce deseja registrar o imposto: \n");
									i = Integer.parseInt(numero);
									Imposto imposto = new Imposto();
									try {
										imposto.setNome_despesa(JOptionPane.showInputDialog("Nome da despesa: \n"));
									}catch(DescricaoEmBrancoException e) {
										e.printStackTrace();
									}
									try {
										imposto.setAno_despesa(JOptionPane.showInputDialog("Ano despesa: \n"));
									}catch(ValorInvalidoException e) {
										e.printStackTrace();
									}
									try {
										imposto.setCategoria(JOptionPane.showInputDialog("Categoria: \n"));
									}catch(DescricaoEmBrancoException e) {
										e.printStackTrace();
									}
									try {
										imposto.setValor_despesa(Double.parseDouble(JOptionPane.showInputDialog("Valor da despesa: ")));
									}catch(ValorInvalidoException e) {
										e.printStackTrace();
									}
									listadeVeiculos.get(i).adDes(imposto);
									break;
								case 2:
									JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + " carros cadastrados\n");
									numero = JOptionPane.showInputDialog("Para qual deles voce deseja registrar a multa: \n");
									i = Integer.parseInt(numero);
									Multa multa = new Multa();
									try {
										multa.setNome_despesa(JOptionPane.showInputDialog("Nome da despesa: \n"));
									}catch(DescricaoEmBrancoException e) {
										e.printStackTrace();
									}
									try {
										multa.setAno_despesa(JOptionPane.showInputDialog("Ano despesa: \n"));
									}catch(ValorInvalidoException e) {
										e.printStackTrace();
									}
									try {
										multa.setCategoria(JOptionPane.showInputDialog("Categoria: \n"));
									}catch(DescricaoEmBrancoException e) {
										e.printStackTrace();
									}
									try {
										multa.setValor_despesa(Double.parseDouble(JOptionPane.showInputDialog("Valor da despesa: ")));
									}catch(ValorInvalidoException e) {
										e.printStackTrace();
									}
									listadeVeiculos.get(i).adDes(multa);
									break;
								case 3:
									JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + " carros cadastrados\n");
									numero = JOptionPane.showInputDialog("Para qual deles voce deseja registrar o financiamento: \n");
									i = Integer.parseInt(numero);
									Financiamento financiamento= new Financiamento();
									try {
										financiamento.setNome_despesa(JOptionPane.showInputDialog("Nome da despesa: \n"));
									}catch(DescricaoEmBrancoException e) {
										e.printStackTrace();
									}
									try {
										financiamento.setAno_despesa(JOptionPane.showInputDialog("Ano despesa: \n"));
									}catch(ValorInvalidoException e) {
										e.printStackTrace();
									}
									try {
										financiamento.setCategoria(JOptionPane.showInputDialog("Categoria: \n"));
									}catch(DescricaoEmBrancoException e) {
										e.printStackTrace();
									}
									try {
										financiamento.setValor_despesa(Double.parseDouble(JOptionPane.showInputDialog("Valor da despesa: ")));
									}catch(ValorInvalidoException e) {
										e.printStackTrace();
									}
									listadeVeiculos.get(i).adDes(financiamento);
									break;
								case 4:
									JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + " carros cadastrados\n");
									numero = JOptionPane.showInputDialog("Para qual deles voce deseja registrar o seguro: \n");
									i = Integer.parseInt(numero);
									Seguro seguro = new Seguro();
									try {
										seguro.setNome_despesa(JOptionPane.showInputDialog("Nome da despesa: \n"));
									}catch(DescricaoEmBrancoException e) {
										e.printStackTrace();
									}
									try {
										seguro.setAno_despesa(JOptionPane.showInputDialog("Ano despesa: \n"));
									}catch(ValorInvalidoException e) {
										e.printStackTrace();
									}
									try {
										seguro.setCategoria(JOptionPane.showInputDialog("Categoria: \n"));
									}catch(DescricaoEmBrancoException e) {
										e.printStackTrace();
									}
									try {
										seguro.setValor_despesa(Double.parseDouble(JOptionPane.showInputDialog("Valor da despesa: ")));
									}catch(ValorInvalidoException e) {
										e.printStackTrace();
									}
									listadeVeiculos.get(i).adDes(seguro);
									break;
							}
							break;
						case 2:
							JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + " carros cadastrados\n");
							numero = JOptionPane.showInputDialog("Para qual deles voce deseja registrar a manutencao: \n");
							i = Integer.parseInt(numero);
							Manutencao manutencao = new Manutencao();
							try {
								manutencao.setNome_despesa(JOptionPane.showInputDialog("Nome: \n"));
							}catch(DescricaoEmBrancoException e) {
								e.printStackTrace();
							}
							try {
								manutencao.setValor_despesa(Double.parseDouble(JOptionPane.showInputDialog("Valor da manutencao: \n")));
							}catch(ValorInvalidoException e) {
								e.printStackTrace();
							}
							listadeVeiculos.get(i).adDes(manutencao);
							
							break;
					}
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + " carros cadastrados\n");
					numero = JOptionPane.showInputDialog("De qual deles voce deseja o relatorio: \n");
					i = Integer.parseInt(numero);
					listadeVeiculos.get(i).imprimedados();
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Existem " + listadeVeiculos.size() + " carros cadastrados\n");
					numero = JOptionPane.showInputDialog("De qual deles voce deseja o relatorio: \n");
					i = Integer.parseInt(numero);
					String selecione = JOptionPane.showInputDialog("Bem vindo ao relatorio de desempenho\nEscolha uma opcao para prossegir: "
																	+ "\n1- Consumo do veiculo."
																	+ "\n2- Custo do km rodado.");
					int suaop = Integer.parseInt(selecione);
					switch(suaop) {
						case 1:
							listadeVeiculos.get(i).consumo_veiculo();
							break;
						case 2:
							listadeVeiculos.get(i).custo_km_rodado();
					}
					break;
				}
		}while(opcao != 6);
	}

}