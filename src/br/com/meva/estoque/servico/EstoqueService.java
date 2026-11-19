package br.com.meva.estoque.servico;

import br.com.meva.estoque.modelo.Produtos;
import java.util.List;
import java.util.Scanner;

public class EstoqueService {

    public void atualizarQuantidade(List<Produtos> listaDeProdutos, Scanner scanner) {
        System.out.println("\n--- ATUALIZAR QUANTIDADE DE PRODUTO ---");
        System.out.println("Digite o código do produto que deseja atualizar:");
        int codigoBuscado = scanner.nextInt();

        Produtos produtoEncontrado = null;

        // Varre a lista procurando o produto que tem o mesmo código
        for (Produtos p : listaDeProdutos) {
            if (p.getCodigo() == codigoBuscado) {
                produtoEncontrado = p;
                break; // Achou, pode parar o loop
            }
        }

        // Verifica se encontrou o produto
        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado.getNomeProduto());
            System.out.println("Quantidade atual: " + produtoEncontrado.getQuantidade());

            System.out.println("Digite a nova quantidade:");
            int novaQuantidade = scanner.nextInt();

            // Atualiza usando o setter
            produtoEncontrado.setQuantidade(novaQuantidade);
            System.out.println("Quantidade atualizada com sucesso!");
            System.out.println("A quantidade de " + produtoEncontrado.getNomeProduto() + " agora é " + produtoEncontrado.getQuantidade());
        } else {
            System.out.println("Erro: Nenhum produto foi encontrado com o código " + codigoBuscado);
        }
        System.out.println("----------------------------------------\n");
    }
}