package dominio;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar(Produto produto){
        produto = new Produto(proximoId, produto.getNome(), produto.getPreco());
        produtos.add(produto);
    }

    public List<Produto> listar(){
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
        //Aqui eu chamo o metodo buscar, para listar e escolher pelo id e jogar dentro da variável referencial do tipo Produto.
        String msg;
        Produto produto = buscarPorId(id);
        if(produto != null){
            produto.setNome(novoNome);
            produto.setPreco(novoPreco);
            //msg = "Produto atualizado com sucesso!";
            return true;
        }
        //msg = "Produto não atualizado!";
        return false ;
    }

    public boolean excluir(int id){
        Produto produto = buscarPorId(id);
        if(produto != null){
            produtos.remove(produto);
            return true;
        }else {
            return false;
        }
    }

}
