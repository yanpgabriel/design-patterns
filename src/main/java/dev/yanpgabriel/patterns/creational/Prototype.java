package dev.yanpgabriel.patterns.creational;

public class Prototype {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Circulo circuloClone=  circulo.clone();

        Quadrado quadrado = new Quadrado();
        Quadrado quadradoClone = quadrado.clone();
    }
}

abstract class Forma implements Cloneable {
    private String cor;
    Forma() {
    }
    Forma(Forma forma) {
        this.cor = forma.cor;
    }
    public abstract Forma clone();
}

class Circulo extends Forma {
    private int raio;
    Circulo() {
    }
    Circulo(Circulo circulo) {
        super(circulo);
        this.raio = circulo.raio;
    }
    @Override
    public Circulo clone() {
        return new Circulo(this);
    }
}

class Quadrado extends Forma {
    private int lado;
    Quadrado() {
    }
    Quadrado(Quadrado quadrado) {
        super(quadrado);
        this.lado = quadrado.lado;
    }
    @Override
    public Quadrado clone() {
        return new Quadrado(this);
    }
}