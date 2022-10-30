import java.util.List;

public class Assinatura implements Item{

    private List<Item> itens;

    
    public Assinatura(List<Item> itens) {
        this.itens = itens;
    }

    public void adicionaItem(Item item) {
        this.itens.add(item);
    }


    @Override
    public double calculoPreco() {
        double preco = 0;

        for(Item item: itens){
            preco += item.calculoPreco();
            System.out.println("Item: " + item.nome() + " = " + item.calculoPreco());
            
        }
        System.out.println();
        return preco;
    }

    @Override
    public String nome() {
        return null;
    }

   
    
    
}
