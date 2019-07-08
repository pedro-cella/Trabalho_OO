package manutencao;

import excecoes.DescricaoEmBrancoException;
import excecoes.ValorInvalidoException;

public class Manutencao extends Combustivel {

public String nome_despesa;
public int odometro;
public float valor_total;

public Manutencao(){
	
}

public String getNome_despesa() {
	return nome_despesa;
}

public void setNome_despesa(String nome_despesa) {
	if(nome_despesa.equalsIgnoreCase(null))
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	else
		this.nome_despesa = nome_despesa;
}

public int getOdometro() {
	return odometro;
}

public void setOdometro(int odometro) {
	if () //Necessario pegar o valor para a comparacao #######################################
	this.odometro = odometro;
}

public float getValor_total() {
	return valor_total;
}

public void setValor_total(float valor_total) {
	if(valor_total == 0.0f)
		throw new ValorInvalidoException("Valor total inválido!");
	else
		this.valor_total = valor_total;
}


	
}
