package dev.yanpgabriel.patterns.creational;

public class Builder {

    public static void main(String[] args) {
        Veiculo veiculo = Veiculo.builder()
                .cor("Preto")
                .portas(4)
                .cavalos(200)
                .hibrido(false)
                .build();

        System.out.println("Veículo: " + veiculo);
    }

}

class Veiculo {
    private String cor;
    private int portas;
    private int cavalos;
    private boolean hibrido;

    static Veiculo builder() {
        return new Veiculo();
    }

    Veiculo cor(String cor) {
        this.cor = cor;
        return this;
    }

    Veiculo portas(int portas) {
        this.portas = portas;
        return this;
    }

    Veiculo cavalos(int cavalos) {
        this.cavalos = cavalos;
        return this;
    }

    Veiculo hibrido(boolean hibrido) {
        this.hibrido = hibrido;
        return this;
    }

    Veiculo build() {
        return this;
    }
}