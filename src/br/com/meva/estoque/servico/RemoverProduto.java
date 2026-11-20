package br.com.meva.estoque.servico;

import br.com.meva.estoque.modelo.Produtos;
import java.util.List;
import java.util.Scanner;

public class RemoverProduto {

    public void excluirProduto(List<Produtos> listaDeProdutos, Scanner scanner) {
        System.out.println("--- Excluir um produto pelo código ---");
        System.out.println("Qual o código do produto que deseja excluir?");
        int codigoBuscado = scanner.nextInt();

        Produtos produtoEncontrado = null;

        // Busca pelo produto informado na lista
        for (Produtos p : listaDeProdutos) {
            if (p.getCodigo() == codigoBuscado) {
                produtoEncontrado = p;
                break;
            }
        }

        if (produtoEncontrado != null) {
            System.out.println("Deseja excluir " + produtoEncontrado.getNomeProduto() + " da lista de produtos? Essa ação não poderá ser desfeita!");
            System.out.println("Digite sim ou não:");
            String confirmar = scanner.next();

            if (confirmar.equalsIgnoreCase("sim")) {
                listaDeProdutos.remove(produtoEncontrado);
                System.out.println("Produto excluído com sucesso!");
            } else {
                System.out.println("Retornando ao menu principal");
            }
        } else {
            System.out.println("Produto não encontrado, verifique o código e tente novamente!");
        }
    }
}