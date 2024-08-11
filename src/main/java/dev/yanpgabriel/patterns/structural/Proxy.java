package dev.yanpgabriel.patterns.structural;

import java.util.List;

public class Proxy {
    public static void main(String[] args) {
        Service service = new Service();

        System.out.println(service.getNames());

        System.out.println(service.getNames());
    }
}

class Service {
    private List<String> names;
    public List<String> getNames() {
        // Exemplo de proxy cacheando os nomes após a primeira chamada
        if (names == null) {
            System.out.println("Carregando nomes do banco de dados por exemplo");
            names = List.of("Yan", "Pedro", "Gabriel");
        } else {
            System.out.println("Retornando nomes já carregados");
        }
        return names;
    }
}