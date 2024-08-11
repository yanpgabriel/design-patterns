package dev.yanpgabriel.patterns.creational;

public class Factory {

    public static void main(String[] args) {
        TransporteFactory factory = new TransporteFactory();

        Transporte transporteC = factory.criarTransporte("c");
        transporteC.entregar();

        Transporte transporteN = factory.criarTransporte("n");
        transporteN.entregar();

        Transporte transporteA = factory.criarTransporte("a");
        transporteA.entregar();

    }

}

abstract class Transporte {
    abstract void entregar();
}

class Caminhao extends Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por terra");
    }
}

class Navio extends Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por água");
    }
}

class Aviao extends Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por ar");
    }
}

class TransporteFactory {
    public Transporte criarTransporte(String tipo) {
        return switch (tipo) {
            case "c" -> new Caminhao();
            case "n" -> new Navio();
            case "a" -> new Aviao();
            default -> null;
        };
    }
}

