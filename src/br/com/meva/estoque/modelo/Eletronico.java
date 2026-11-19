package br.com.meva.estoque.modelo;

import java.util.List;

public class Eletronico extends Produtos{
    private int tensaoEntrada;
    private boolean recarregavel;

    public Eletronico(){
        super();
    }

    public Eletronico(String nomeProduto, double preco, int quantidade, int tensaoEntrada, boolean recarregavel) {
        super(nomeProduto, preco, quantidade);
        this.tensaoEntrada = tensaoEntrada;
        this.recarregavel = recarregavel;
    }

    public void adicionarEletronico(List<Produtos> listaDeProdutos){
        super.coletarDadosBase();
        System.out.println("Qual a tensão de entradado eletrônico?");
        this.tensaoEntrada = scanner.nextInt();
        System.out.println("É recarregável? (true/false)");
        this.recarregavel = scanner.nextBoolean();

        Eletronico novoEletronico = new Eletronico(this.nomeProduto, this.preco, this.quantidade, this.tensaoEntrada, this.recarregavel);

        listaDeProdutos.add(novoEletronico);
        System.out.println("O produto " + getNomeProduto() + ", do tipo Eletrônico foi adicionado a lista!");
        System.out.println("Produto cadastrado com o código " + novoEletronico.getCodigo());
    }
}
