package manutencao;

public class Multa extends Despesas{

public Multa() {
	
}

public String getNome_despesa() {
	return nome_despesa;
}
public void setNome_despesa(String nome_despesa) {
	this.nome_despesa = nome_despesa;
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

public double getValor_despesa() {
	return valor_despesa;
}

public void setValor_despesa(double valor_despesa) {
	this.valor_despesa = valor_despesa;
}

}
