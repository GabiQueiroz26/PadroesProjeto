import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Assinatura clubeLivroPremiun = new Assinatura(new ArrayList<Item>());
        clubeLivroPremiun.adicionaItem(new Produtos("Dois livros aleatórios", 120.00));
        clubeLivroPremiun.adicionaItem(new Produtos("Dois Marcadores de página", 37.90));
        clubeLivroPremiun.adicionaItem(new Produtos("Bibliocanto", 100.00));
        clubeLivroPremiun.adicionaItem(new Produtos("Kit 10 Marca Texto", 20.00));

        Assinatura brindes = new Assinatura(new ArrayList<Item>());
        brindes.adicionaItem(new Produtos("Um mangá", 0.00));
        brindes.adicionaItem(new Produtos("Um Post-it", 0.00));
        brindes.adicionaItem(new Produtos("Uma agenda", 0.00));

        clubeLivroPremiun.adicionaItem(brindes);

    
        System.out.println("Preço final da assinatura = " + clubeLivroPremiun.calculoPreco());
    }
}
