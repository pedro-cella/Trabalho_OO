package manutencao;
import excessoes.DescricaoEmBrancoException;
import excessoes.ValorInvalidoException;
import excessoes.CombustivelIncompativelException;
import veiculo.Veiculo;
public class Combustivel extends Despesas{
protected String data_abastecimento;
protected String tipo_combustivel;
protected int kilometragem;
public float valor_combustivel;
public float valor_total;
protected String tipo_abastecimento;

public Combustivel(String teste){
	this.tipo_combustivel = teste;
}

public String getData_abastecimento() {
	return data_abastecimento;
}

public void setData_abastecimento(String data_abastecimento) throws DescricaoEmBrancoException {
	if(data_abastecimento.isEmpty()) {
		throw new DescricaoEmBrancoException("Descri��o em branco. Por favor insira um dado v�lido!");
	}else {
		this.data_abastecimento = data_abastecimento;
	}
}

public String getTipo_combustivel() {
	return tipo_combustivel;
}

public void setTipo_combustivel(String tipo_combustivel) throws DescricaoEmBrancoException, CombustivelIncompativelException{
	if(tipo_combustivel.isEmpty()) {
		throw new DescricaoEmBrancoException("Descri��o em branco. Por favor insira um dado v�lido!");
	}else if(this.tipo_combustivel.equalsIgnoreCase(tipo_combustivel) == false) {  //Usei o comando "equalsIgnoreCase" para realizar a comparação dos comnustiveis
		throw new CombustivelIncompativelException("Esse veiculo nao aceita esse tipo de combustivel!"); //Basicamente se o combustivel definido para o veiculo for diferente do combustivel na hora do abastecimento, sera lançada a excessão
	}else {
		this.tipo_combustivel = tipo_combustivel;
	}
}

public int getKilometragem() {
	return kilometragem;
}

public void setKilometragem(int kilometragem) throws ValorInvalidoException{
	if(this.kilometragem < kilometragem) {
		System.out.println("Valor do this.kilometragem: " + this.kilometragem);
		System.out.println("valor do kilometragem: " + kilometragem);
		this.kilometragem = kilometragem;
	}else {
		throw new ValorInvalidoException("Valor de kilometragem inválido!");
	}
}

public float getValor_combustivel() {
	return valor_combustivel;
}

public void setValor_combustivel(float valor_combustivel) throws ValorInvalidoException{
	if(valor_combustivel <= 0) {
		throw new ValorInvalidoException("Valor de combustivel inválido!");
	}else {
		this.valor_combustivel = valor_combustivel;
	}
}

public float getValor_total() {
	return valor_total;
}

public void setValor_total(float valor_total) throws ValorInvalidoException{
	if(valor_total <= 0) {
		throw new ValorInvalidoException("Valor de abastecimento inválido!");
	}else {
		this.valor_total = valor_total;
	}
}

public String getTipo_abastecimento(){
	return tipo_abastecimento;
}

public void setTipo_abastecimento(String tipo_abastecimento) throws DescricaoEmBrancoException{
	if(tipo_abastecimento.isEmpty()) {
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	}else {
		this.tipo_abastecimento = tipo_abastecimento;
	}
}

}
