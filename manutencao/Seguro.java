package manutencao;

import excessoes.DescricaoEmBrancoException;
import excessoes.ValorInvalidoException;

public class Seguro extends Despesas{
	
public Seguro() {
	
}

public String getNome_despesa() {
	return nome_despesa;
}
public void setNome_despesa(String nome_despesa) throws DescricaoEmBrancoException{
	if(nome_despesa.isEmpty()) {
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado inválido!");
	}else {
		this.nome_despesa = nome_despesa;
	}
}

public String getAno_despesa() {
	return ano_despesa;
}

public void setAno_despesa(String ano_despesa) throws ValorInvalidoException{
	int valor = Integer.parseInt(ano_despesa);
	if(valor > 1950 && valor < 2020) {
		this.ano_despesa = ano_despesa;
	}else {
		throw new ValorInvalidoException("Ano de despesa inválido!");
	}
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) throws DescricaoEmBrancoException{
	if(categoria.isEmpty()) {
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	}else {
		this.categoria = categoria;
	}
}

public double getValor_despesa() {
	return valor_despesa;
}

public void setValor_despesa(double valor_despesa) throws ValorInvalidoException{
	if(valor_despesa <= 0) {
		throw new ValorInvalidoException("Valor de despesa inválido!");
	}else {
		this.valor_despesa = valor_despesa;
	}
}

}
