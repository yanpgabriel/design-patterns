package dev.yanpgabriel.patterns.structural;

import java.util.ArrayList;
import java.util.List;

public class Composite {
    public static void main(String[] args) {
        Produto packCorona = new CaixaProduto("Pack de Corona");

        for (int i = 1; i <= 6; i++) {
            packCorona.addProduto(new UnidadeProduto("Corona " + i));
        }
        Produto corona = new UnidadeProduto("Unidade Corona");

        System.out.println(corona);
        System.out.println(packCorona);
    }
}

abstract class Produto {
    List<Produto> produtos = new ArrayList<>();
    String nome;
    int qtdProdutos() {
        return produtos.size();
    }
    void addProduto(Produto produto) {
        produtos.add(produto);
    }
    void removeProduto(Produto produto) {
        produtos.remove(produto);
    }
    public String toString() {
        return "Nome: " + nome + ", Produtos: " + qtdProdutos();
    }
}

class CaixaProduto extends Produto {
    CaixaProduto(String nome) {
        this.nome = nome;
    }
}

class UnidadeProduto extends Produto {
    UnidadeProduto(String nome) {
        this.nome = nome;
    }
    @Override
    int qtdProdutos() {
        return 1;
    }
}