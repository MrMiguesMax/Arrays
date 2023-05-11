package Entidades;

public class Venda {
	private int Nvenda;
	private String ModeloCarro;
	private int Preços;
	private String nome;
	private int Pparcelas;
//Construtor
public Venda(String nome, String ModeloCarro, int Nvenda, int Preços, int pparcelas2) {
	this.nome = nome;
	this.ModeloCarro = ModeloCarro;
	this.Nvenda = Nvenda;
	this.Preços = Preços;
	this.Pparcelas = pparcelas2;
}
public int getNvenda() {
	return Nvenda;
}
public void setNvenda(int nvenda) {
	Nvenda = nvenda;
}
public String getModeloCarro() {
	return ModeloCarro;
}
public void setModeloCarro(String modeloCarro) {
	ModeloCarro = modeloCarro;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getPreços() {
	return Preços;
}
public void setPreços(int preços) {
	Preços = preços;
}
public int getPparcelas() {
	return Pparcelas;
}
public void setPparcelas(int pparcelas) {
	Pparcelas = pparcelas;
}


}