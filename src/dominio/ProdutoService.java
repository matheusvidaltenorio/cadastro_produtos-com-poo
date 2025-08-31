package dominio;

import java.util.List;

public class ProdutoService {
    private ProdutoRepository repositorio =  new ProdutoRepository();

    public void adicionarProduto(String nome, double preco){
        Produto produto = new Produto (0, nome, preco);
        repositorio.adicionar(produto);
    }

    public List<Produto> listarProdutos(){
        return repositorio.listar();
    }

    public boolean atualizarProduto(int id, String nome, double preco){
        return repositorio.atualizar(id, nome, preco);
    }

    public boolean excluirProduto(int id){
        return repositorio.excluir(id);
    }
}
