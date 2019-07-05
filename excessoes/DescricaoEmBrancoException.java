package excessoes;
import javax.swing.JOptionPane;

public class DescricaoEmBrancoException extends Exception{
	
	public String DescricaoEmBrancoException(String descricao){
		while(descricao == null) {
			descricao = JOptionPane.showInputDialog("Por favor, digite uma descricao valida: \n");
		
		}
			return descricao;
	}
}
