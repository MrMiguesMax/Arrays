package Entidades;

public class Venda {
	private int Nvenda;
	private String ModeloCarro;
	private int Pre�os;
	private String nome;
	private int Pparcelas;
//Construtor
public Venda(String nome, String ModeloCarro, int Nvenda, int Pre�os, int pparcelas2) {
	this.nome = nome;
	this.ModeloCarro = ModeloCarro;
	this.Nvenda = Nvenda;
	this.Pre�os = Pre�os;
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
public int getPre�os() {
	return Pre�os;
}
public void setPre�os(int pre�os) {
	Pre�os = pre�os;
}
public int getPparcelas() {
	return Pparcelas;
}
public void setPparcelas(int pparcelas) {
	Pparcelas = pparcelas;
}


}