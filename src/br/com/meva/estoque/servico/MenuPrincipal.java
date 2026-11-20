package br.com.meva.estoque.servico;

import br.com.meva.estoque.modelo.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    int opcoa = 0;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Produtos> listaDeProdutos = new ArrayList<>();

    public void listarProdutos() {
        System.out.println("\n--- LISTA DE PRODUTOS CADASTRADOS ---");

        if (listaDeProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado ainda.");
        } else {
            // Percorre cada produto da lista e imprime chamando automaticamente o toString()
            for (Produtos p : listaDeProdutos) {
                System.out.println(p);
            }
        }
        System.out.println("-------------------------------------\n");
    }

    public void menuInicial() {
        while (opcoa != 6) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar quantidade de um produto");
            System.out.println("4 - Buscar um produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");

            opcoa = scanner.nextInt();
            switch (opcoa) {
                case 1: {
                    MenuTipoProduto.exibirMenu(scanner, listaDeProdutos);
                    break;
                }
                case 2: {
                    listarProdutos();
                    break;
                }
                case 3: {
                    EstoqueService estoqueService = new EstoqueService();
                    estoqueService.atualizarQuantidade(listaDeProdutos, scanner);
                    break;
                }
                case 4: {
                    BuscaNome buscaNome = new BuscaNome();
                    buscaNome.buscarProdutoPorCodigo(listaDeProdutos, scanner);
                    break;
                }
                case 5: {
                    RemoverProduto removerProduto = new RemoverProduto();
                    removerProduto.excluirProduto(listaDeProdutos, scanner);
                    break;
                }
                case 6: {
                    break;
                }
            }
        }
    }


}
