package br.com.meva.estoque.modelo;

import java.util.List;

public class Roupas extends Produtos{
    private String tamanho;
    private String descricao;
    private String cor;

    public Roupas(){
        super();
    }

    public Roupas(String nomeProduto, double valor, int quantidade, String tamanho, String descricao, String cor) {
        super(nomeProduto, valor, quantidade);
        this.tamanho = tamanho;
        this.descricao = descricao;
        this.cor = cor;
    }

    public void adicionarRoupas(List<Produtos> listaDeProdutos){
        super.coletarDadosBase();
        scanner.nextLine();
        System.out.println("Qual o tamanho dessa roupa?");
        this.tamanho = scanner.nextLine();
        System.out.println("Descrição da roupa?");
        this.descricao = scanner.nextLine();
        System.out.println("Qual a cor?");
        this.cor = scanner.nextLine();

        Roupas novaRoupa = new Roupas(this.nomeProduto, this.preco, this.quantidade, this.tamanho, this.descricao, this.cor);

        listaDeProdutos.add(novaRoupa);
        System.out.println("O produto " + getNomeProduto() + ", do tipo Roupa foi adicionado a lista!");
        System.out.println("Produto cadastrado com o código " + novaRoupa.getCodigo());

    }
}
