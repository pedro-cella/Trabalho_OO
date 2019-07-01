package excessoes;

import javax.swing.JOptionPane;

public class Excessoes {
	
	
	public String DescricaoEmBrancoException(String descricao) {
		while(descricao == null) {
			descricao = JOptionPane.showInputDialog("Por favor, digite uma descricao valida: \n");
		
		}
			return descricao;
	}
	public String CombustivelIncompativelException (String combustivel) {
		while (combustivel.toLowerCase() != "gasolina" || combustivel.toLowerCase()!= "alcool" || combustivel.toLowerCase()!= "diesel") {
			combustivel = JOptionPane.showInputDialog("Por favor, digite um combustivel valido: \n");
		}
		return combustivel;
	}
	public double ValorInvalidoException(double valor) {
		while(valor<=0) {
			valor = Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite um valor valido: \n"));
		}
		return valor;
	}
	
}
	
