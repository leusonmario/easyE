package br.cin.recife.ee.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Produto> produtos;
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public boolean addProdutoCarrinho(Produto newProduto){
		if (checagemProdutoDuplicado(newProduto) == true){
			this.produtos.add(newProduto);
			return true;
		}
		return false;
	}

	private boolean checagemProdutoDuplicado(Produto newProduto){
		for (Produto produto : produtos) {
			if (produto.getID() == newProduto.getID()){
				return false;
			}
		}
		return true;
	}

	public double calcularValorCarrinhoDesconto(){
		double total = 0;
		for (Produto produto : produtos) {
			total =+ produto.getValorVenda()*0.9;
		}
		return total;
	}

}
