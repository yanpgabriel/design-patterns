package dev.yanpgabriel.patterns.structural;

public class Flyweight {
    public static void main(String[] args) {
        // Imagine que temos 1000 árvores da classe ArvorePesada, porem todas são de texturas iguais e cada uma tem 1MB de memória
        // Isso significa que estamos gastando 1000MB de memória desnecessariamente
        ArvorePesada arvorePesada = new ArvorePesada("Carvalho", "Marrom", "Rugoso", 10, 20);

        // Com o Flyweight, podemos economizar memória, pois a textura é compartilhada entre todas as árvores
        // Assim, mesmo que tenhamos 1000 árvores, a textura é compartilhada entre todas, economizando memória usando apenas 1MB
        TipoArvore tipo = new TipoArvore("Carvalho", "Marrom", "Rugoso");
        Arvore arvore = new Arvore(tipo, 10, 20);
    }
}

class TipoArvore {
    String nome;
    String cor;
    String textura; // Imagine que essa textura é um atributo que consome muita memória

    public TipoArvore(String nome, String cor, String textura) {
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
    }
}

class Arvore {
    TipoArvore tipo;
    int x;
    int y;

    public Arvore(TipoArvore tipo, int x, int y) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
    }
}

// Exemplo de uso do padrão sem o Flyweight
class ArvorePesada {
    String nome;
    String cor;
    String textura; // Imagine que essa textura é um atributo que consome muita memória
    int x;
    int y;

    public ArvorePesada(String nome, String cor, String textura, int x, int y) {
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
        this.x = x;
        this.y = y;
    }
}