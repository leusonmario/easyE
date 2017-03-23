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

}
