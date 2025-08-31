package dominio;

public class Produto {
    //Criação dos atributos para armazenar em memoria em cada um.
    private int id;
    private String nome;
    private double preco;

    //Criação de construtor, porém eu não achava que ficava redundante com o sets, porém
    //fui pesquisar, usaria o set dentro se houvesse a necessidade de validar.
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    //criação de todos os SETTERS E GETTERS.
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Pelo o que entendi, se eu chamar a variável de referencia que o objeto está retorna o endereço em memoria
    //colocando essa função, ele retorna os dados, mas serve mais para debug, logs.
    @Override
    public String toString(){
        return this.id + " - " + this.nome + " - R$" + this.preco;
    }
}

