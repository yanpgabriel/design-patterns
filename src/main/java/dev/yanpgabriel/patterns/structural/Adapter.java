package dev.yanpgabriel.patterns.structural;

public class Adapter {
    public static void main(String[] args) {
        ItemFornecedorA itemFornecedorA = new ItemFornecedorA();
        ItemFornecedorB itemFornecedorB = new ItemFornecedorB();

        ItemFornecedorGenerico itemFornecedorGenericoA = AdapterItemFornecedorA.adaptar(itemFornecedorA);
        ItemFornecedorGenerico itemFornecedorGenericoB = AdapterItemFornecedorB.adaptar(itemFornecedorB);

        System.out.println(itemFornecedorGenericoA.id + " - " + itemFornecedorGenericoA.label);
        System.out.println(itemFornecedorGenericoB.id + " - " + itemFornecedorGenericoB.label);
    }
}

class ItemFornecedorGenerico {
    public long id;
    public String label;
}

class ItemFornecedorA {
    public int cod = 1;
    public String desc = "A";
}

class ItemFornecedorB {
    public int codigo = 2;
    public String descricao = "B";
}

class AdapterItemFornecedorA {
    public static ItemFornecedorGenerico adaptar(ItemFornecedorA itemFornecedorA) {
        ItemFornecedorGenerico itemFornecedorGenerico = new ItemFornecedorGenerico();
        itemFornecedorGenerico.id = itemFornecedorA.cod;
        itemFornecedorGenerico.label = itemFornecedorA.desc;
        return itemFornecedorGenerico;
    }
}

class AdapterItemFornecedorB {
    public static ItemFornecedorGenerico adaptar(ItemFornecedorB itemFornecedorB) {
        ItemFornecedorGenerico itemFornecedorGenerico = new ItemFornecedorGenerico();
        itemFornecedorGenerico.id = itemFornecedorB.codigo;
        itemFornecedorGenerico.label = itemFornecedorB.descricao;
        return itemFornecedorGenerico;
    }
}