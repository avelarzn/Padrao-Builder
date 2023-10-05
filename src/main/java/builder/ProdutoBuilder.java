package builder;

import java.util.Date;

public class ProdutoBuilder {

    private Produto produto;

    public ProdutoBuilder() {
        produto = new Produto();
    }

    public Produto build() {
        if (produto.getCodigo() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (produto.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return produto;
    }

    public ProdutoBuilder setCodigo(int codigo) {
        produto.setCodigo(codigo);
        return this;
    }

    public ProdutoBuilder setNome(String nome) {
        produto.setNome(nome);
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao) {
        produto.setDescricao(descricao);
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        produto.setPreco(preco);
        return this;
    }

    public ProdutoBuilder setDataFabricacao(Date dataFabricacao) {
        produto.setDataFabricacao(dataFabricacao);
        return this;
    }

    public ProdutoBuilder setFabricante(String fabricante) {
        produto.setFabricante(fabricante);
        return this;
    }

    public ProdutoBuilder setCategoria(String categoria) {
        produto.setCategoria(categoria);
        return this;
    }

    public ProdutoBuilder setFornecedor(String fornecedor) {
        produto.setFornecedor(fornecedor);
        return this;
    }

    public ProdutoBuilder setEstoque(int estoque) {
        produto.setEstoque(estoque);
        return this;
    }
}
