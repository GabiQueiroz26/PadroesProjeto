
public class AguaLiquida implements AguaState {

    @Override
    public AguaState abaixoDeZero() {
        System.out.println("Agua Solida");
        return new AguaSolida();
    }

    @Override
    public AguaState acimaDeZero() {
        System.out.println("Liquido");
        return new AguaLiquida();
    }

    @Override
    public AguaState abaixoDeCem() {
        System.out.println("Liquido");
        return new AguaLiquida();
    }

    @Override
    public AguaState acimaDeCem() {
        System.out.println("Agua Evaporada");
        return new AguaEvaporada();
    }

}
