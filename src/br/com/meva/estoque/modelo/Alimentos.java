package br.com.meva.estoque.modelo;

import java.util.List;

public class Alimentos extends Produtos{
    private String vencimento;

    public Alimentos() {
        super();
    }

    public Alimentos(String nomeProduto, double valor, int quantidade, String vencimento) {
        super(nomeProduto, valor, quantidade);
        this.vencimento = vencimento;
    }

    public void adicionarAlimento(List<Produtos> listaDeProdutos){
        super.coletarDadosBase();
        System.out.println("Informe a data de validade?");
        this.vencimento = scanner.next();

        Alimentos novoAlimento = new Alimentos(this.nomeProduto, this.preco, this.quantidade, this.vencimento);

        listaDeProdutos.add(novoAlimento);
        System.out.println("O produto " + getNomeProduto() + ", do tipo Alimento foi adicionado a lista!");
        System.out.println("Produto cadastrado com o código " + novoAlimento.getCodigo());

    }
}
