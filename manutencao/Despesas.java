package manutencao;

import excecoes.DescricaoEmBrancoException;
import excecoes.ValorInvalidoException;

public class Despesas extends Combustivel{
public String descricao;
public int ano_despesa;
public String categoria;

Despesas(){
	
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	if (descricao.equalsIgnoreCase(null))
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	else
		this.descricao = descricao;
}

public int getAno_despesa() {
	return ano_despesa;
}

public void setAno_despesa(int ano_despesa) {
	if(ano_despesa > 1950  && ano_despesa < 2020)
		this.ano_despesa = ano_despesa;
	else
		throw new ValorInvalidoException("Ano de despesa inválido!");
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	if (categoria.equalsIgnoreCase(null))
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	else
		this.categoria = categoria;
}




}


