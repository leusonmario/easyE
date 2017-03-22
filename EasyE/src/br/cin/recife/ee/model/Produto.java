package br.cin.recife.ee.model;

public class Produto {
	private int ID;
	private String nome;
	private String descricao;
	private int quantidade;
	private double valorVenda;
	private double valorCompra;
	
	public Produto(int id, String nome, int quantidade, double valorVenda, double valorCompra) {
		this.ID = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
}
