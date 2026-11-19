package br.com.meva.estoque.modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {
    private static int contadorId = 1;

    protected String nomeProduto;
    protected double preco;
    protected int quantidade;
    protected int codigo;

    ArrayList<Produtos> listaDeProdutos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //Contrutor
    public Produtos(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = contadorId++;
    }

    public Produtos() {
        this.codigo = contadorId++;
    }

    public void coletarDadosBase() {
        System.out.println("Qual o nome do produto?");
        this.nomeProduto = scanner.nextLine();
        System.out.println("Qual o valor do produto?");
        this.preco = scanner.nextDouble();
        System.out.println("Quantas unidades?");
        this.quantidade = scanner.nextInt();
    }

    //Getter and setter
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Nome: " + nomeProduto + " | Valor: R$ " + preco + " | Quantidade: " + quantidade + " | Código: " + codigo;
    }


}
