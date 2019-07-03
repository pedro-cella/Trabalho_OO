package manutencao;

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
	this.nome_despesa = nome_despesa;
}

public int getOdometro() {
	return odometro;
}

public void setOdometro(int odometro) {
	this.odometro = odometro;
}

public float getValor_total() {
	return valor_total;
}

public void setValor_total(float valor_total) {
	this.valor_total = valor_total;
}


	
}
