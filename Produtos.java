public class Produtos implements Item {

    private String nome;
    private double preco;


    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    @Override
    public double calculoPreco() {
        return preco;
    }


    @Override
    public String nome() {
        return nome;
    }
    
}
