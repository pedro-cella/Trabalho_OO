package manutencao;
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
	this.data_abastecimento = data_abastecimento;
}

public String getTipo_combustivel() {
	return tipo_combustivel;
}

public void setTipo_combustivel(String tipo_combustivel) {
	this.tipo_combustivel = tipo_combustivel;
}

public int getKilometragem() {
	return kilometragem;
}

public void setKilometragem(int kilometragem) {
	this.kilometragem = kilometragem;
}

public float getValor_combustivel() {
	return valor_combustivel;
}

public void setValor_combustivel(float valor_combustivel) {
	this.valor_combustivel = valor_combustivel;
}

public float getValor_total() {
	return valor_total;
}

public void setValor_total(float valor_total) {
	this.valor_total = valor_total;
}

public String getTipo_abastecimento() {
	return tipo_abastecimento;
}

public void setTipo_abastecimento(String tipo_abastecimento) {
	this.tipo_abastecimento = tipo_abastecimento;
}



}
