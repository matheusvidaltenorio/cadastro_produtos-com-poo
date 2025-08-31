package test;

import dominio.Produto;
import dominio.ProdutoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoService service = new ProdutoService();
        int opc;

        do {
            System.out.println("\n=== CRUD de Produtos ===");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Remover Produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Preço: ");
                    double preco = sc.nextDouble();
                    service.adicionarProduto(nome, preco);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de Produtos:");
                    for(Produto produto : service.listarProdutos()){
                        System.out.println(produto);
                    }
                    break;
                case 3:
                    System.out.println("Atualizar Produto:");
                    System.out.println("ID do produto: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Novo nome: ");
                    nome =  sc.nextLine();
                    System.out.println("Novo preço:");
                    preco = sc.nextDouble();
                    if (service.atualizarProduto(id, nome, preco)) {
                        System.out.println("Produto atualizado com sucesso!");
                    }else{
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("ID do produto: :");
                    id = sc.nextInt();
                    sc.nextLine();
                    if (service.excluirProduto(id)){
                        System.out.println("Produto excluido com sucesso!");
                    }else {
                        System.out.println("Produto não  encontrado!");
                    }
                    break;

                case 0:
                    System.out.println("Opcao encerrada!");
                    break;
                default:
                    System.out.println("Opção não encontrada!");
                    break;
            }
        }while(opc != 0);
    }
}
