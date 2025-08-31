package dominio;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarProduto(Produto produto){
        produto = new Produto(proximoId, produto.getNome(), produto.getPreco());
        produtos.add(produto);
    }

    public List<Produto> listarProdutos(){
        return produtos;
    }

    public Produto buscarPorId(int id){
        for(Produto p : produtos){
            if(p.getId() == id);{
                return p;
            }
        }
        return null;
    }

    public boolean atualizar(int id, String novoNome, double novoPreco){
        //Por que tem que fazer isso? não entendi
        Produto produto = buscarPorId(id);

    }



}
