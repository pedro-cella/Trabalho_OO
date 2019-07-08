package manutencao;
import excessoes.DescricaoEmBrancoException;
import excessoes.ValorInvalidoException;
import veiculo.Veiculo;
import excessoes.CombustivelIncompativelException;
public class Combustivel extends Despesas{
protected String data_abastecimento;
protected String tipo_combustivel;
protected int kilometragem;
public float valor_combustivel;
public float valor_total;
protected String tipo_abastecimento;
public Veiculo v;

public Combustivel(){
	
}

public String getData_abastecimento() {
	return data_abastecimento;
}

public void setData_abastecimento(String data_abastecimento) throws DescricaoEmBrancoException {
	if(data_abastecimento.isEmpty()) {
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado inválido!");
	}else {
		this.data_abastecimento = data_abastecimento;
	}
}

public String getTipo_combustivel() {
	return tipo_combustivel;
}

public void setTipo_combustivel(String tipo_combustivel) throws DescricaoEmBrancoException, CombustivelIncompativelException{
	if(tipo_combustivel.isEmpty()) {
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado inválido!");
	}else if(this.tipo_combustivel != v.getCombustivel()) {
		throw new CombustivelIncompativelException("Esse veiculo nao aceita esse tipo de combustivel!");
	}else {
		this.tipo_combustivel = tipo_combustivel;
	}
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
