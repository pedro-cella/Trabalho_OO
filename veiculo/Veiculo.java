package veiculo;
import excecoes.CombustivelIncompativelException;
import excecoes.DescricaoEmBrancoException;
import excecoes.ValorInvalidoException;
import manutencao.Combustivel;

public class Veiculo {
private String marca;
private String modelo;
private int ano_fabricacao;
private int ano_modelo;
private float motorizacao;
public String combustivel;
private String cor;
private String placa;
private String renavam;

Combustivel comb = new Combustivel();

public Veiculo(){
	
}

public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	if(marca == null)
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.marca = marca;

}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	if(modelo == null)
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.modelo = modelo;
}
public int getAno_fabricacao() {
	return ano_fabricacao;
}
public void setAno_fabricacao(int ano_fabricacao) {
	if(ano_fabricacao > 1950 && ano_fabricacao < 2020)
		this.ano_fabricacao = ano_fabricacao;
	throw new ValorInvalidoException("Ano de fabricação inválido!");
}
public int getAno_modelo() {
	return ano_modelo;
}
public void setAno_modelo(int ano_modelo) {
	if(ano_modelo > 1950 && ano_modelo < 2020)
		this.ano_modelo = ano_modelo;
	throw new ValorInvalidoException("Ano do modelo inválido!");
}
public float getMotorizacao() {
	return motorizacao;
}
public void setMotorizacao(float motorizacao) {
	if(motorizacao > 1.0f && motorizacao < 8.1f)
		this.motorizacao = motorizacao;
	throw new ValorInvalidoException("Motorização inválida!");
}
public String getCombustivel() {
	return combustivel;
}
public void setCombustivel(String combustivel) {
	if(combustivel == null)
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	else if(combustivel.equalsIgnoreCase("Álcool") ||
			combustivel.equalsIgnoreCase("Diesel") ||
			combustivel.equalsIgnoreCase("Gasolina") ||
			combustivel.equalsIgnoreCase("Flex"))
		this.combustivel = combustivel;
	else
		throw new CombustivelIncompativelException("Combustível inválido!");
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	if(cor == null)
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.cor = cor;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	if(placa == null)
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.placa = placa;
}
public String getRenavam() {
	return renavam;
}
public void setRenavam(String renavam) {
	if(renavam == null)
		throw new DescricaoEmBrancoException("Descrição em branco. Por favor insira um dado válido!");
	this.renavam = renavam;
}


	
	
	
}
