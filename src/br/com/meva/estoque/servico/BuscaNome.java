package br.com.meva.estoque.servico;

import br.com.meva.estoque.modelo.Produtos;

import java.util.List;
import java.util.Scanner;

public class BuscaNome {
    public void buscarProdutoPorCodigo(List<Produtos> listaDeProdutos, Scanner scanner) {
        System.out.println("\n--- BUSCAR PRODUTO POR CÓDIGO ---");
        System.out.println("Digite o código do produto que deseja procurar:");
        int codigoBuscado = scanner.nextInt();

        Produtos produtoEncontrado = null;

        // Busca na lista comparando o código de cada produto
        for (Produtos p : listaDeProdutos) {
            if (p.getCodigo() == codigoBuscado) {
                produtoEncontrado = p;
                break;
            }
        }

        // Exibe o resultado da busca
        if (produtoEncontrado != null) {
            System.out.println("\nProduto encontrado com sucesso!");
            //toString() já subscrito na classe Produtos
            System.out.println(produtoEncontrado);
        } else {
            System.out.println("\nNenhum produto foi encontrado com o código " + codigoBuscado);
        }
        System.out.println("------------------------------------\n");
    }
}

