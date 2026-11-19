package br.com.meva.estoque.servico;

import br.com.meva.estoque.modelo.Alimentos;
import br.com.meva.estoque.modelo.Eletronico;
import br.com.meva.estoque.modelo.Produtos;
import br.com.meva.estoque.modelo.Roupas;

import java.util.List;
import java.util.Scanner;

public class MenuTipoProduto {
    public static void exibirMenu(Scanner scanner, List<Produtos> listaDeProdutos){
        int tipoProduto = 0;
        while (tipoProduto != 4) {
            System.out.println("Escolha o tipo do produto que deseja adicionar");
            System.out.println("1 - Eletrônico");
            System.out.println("2 - Roupas");
            System.out.println("3 - Alimentos");
            System.out.println("4 - Voltar");

            tipoProduto = scanner.nextInt();
            switch (tipoProduto) {
                case 1: {
                    Eletronico eletronico = new Eletronico();
                    eletronico.adicionarEletronico(listaDeProdutos);
                    break;
                }
                case 2: {
                    Roupas roupas = new Roupas();
                    roupas.adicionarRoupas(listaDeProdutos);
                    break;
                }
                case 3: {
                    Alimentos alimentos = new Alimentos();
                    alimentos.adicionarAlimento(listaDeProdutos);
                    break;
                }
                case 4:{
                    System.out.println("Voltando ao menu principal");
                    break;
                }
                }
            }
    }
}
