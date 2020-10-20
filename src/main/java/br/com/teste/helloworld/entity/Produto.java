package br.com.teste.helloworld.entity;

public class Produto {
	
	private String descricao;
	private long codigo;
	private double preco;
	private long codSgotica;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public long getCodSgotica() {
		return codSgotica;
	}
	public void setCodSgotica(long codSgotica) {
		this.codSgotica = codSgotica;
	}
	
}
