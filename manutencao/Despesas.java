package manutencao;
public class Despesas{ 
public String descricao;
public String ano_despesa;
public String categoria;
public double valor_total;

public Despesas(){
	
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getAno_despesa() {
	return ano_despesa;
}

public void setAno_despesa(String ano_despesa) {
	this.ano_despesa = ano_despesa;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public double getValor_total() {
	return valor_total;
}

public void setValor_total(double valor_total) {
	this.valor_total = valor_total;
}

public double calculaValor_total(double valor_total) {
	
	double total = 0f;
	total = total + this.getValor_total();
	return total;
	
}

}


