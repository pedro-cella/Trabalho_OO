package manutencao;

import excecoes.CombustivelIncompativelException;
import excecoes.DescricaoEmBrancoException;
import excecoes.ValorInvalidoException;
import veiculo.Veiculo;

public class Combustivel {
protected String data_abastecimento;
protected String tipo_combustivel;
protected int kilometragem;
public float valor_combustivel;
public float valor_total;
protected String tipo_abastecimento;

public Combustivel(){
	
}

public String getData_abastecimento() {
	return data_abastecimento;
}

public void setData_abastecimento(String data_abastecimento) {
	if(data_abastecimento.equalsIgnoreCase(null))
		throw new DescricaoEmBrancoException("Data inválida!");
	else
		this.data_abastecimento = data_abastecimento;
}

public String getTipo_combustivel() {
	return tipo_combustivel;
}

public void setTipo_combustivel(String tipo_combustivel) {
	if(tipo_combustivel.equalsIgnoreCase(null))
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
 	else if() // Nao sei como pegar a referencia para veiculo.getCombustivel e comparar com a entrada tipo_combustivel ##########################################
		this.tipo_combustivel = tipo_combustivel;
	else
		throw new CombustivelIncompativelException("Combustível Incompatível!");
}

public int getKilometragem() {
	return kilometragem;
}

public void setKilometragem(int kilometragem) {
	if() //Mesma coisa. Pegar o parametro de veiculo.getKilometragem e compara com a entrada kilometragem ###################################################
	this.kilometragem = kilometragem;
}

public float getValor_combustivel() {
	return valor_combustivel;
}

public void setValor_combustivel(float valor_combustivel) {
	if(valor_combustivel == 0.0f)
		throw new ValorInvalidoException("Valor inválido para o combustível!");
	else
		this.valor_combustivel = valor_combustivel;
}

public float getValor_total() {
	return valor_total;
}

public void setValor_total(float valor_total) {
	if (valor_total == 0.0f)
		throw new ValorInvalidoException("Valor total inválido!");
	else
		this.valor_total = valor_total;
}

public String getTipo_abastecimento() {
	return tipo_abastecimento;
}

public void setTipo_abastecimento(String tipo_abastecimento) {
	if(tipo_abastecimento.equalsIgnoreCase(null))
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	else
		this.tipo_abastecimento = tipo_abastecimento;
}



}
