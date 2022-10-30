public class AguaSolida implements AguaState{

    @Override
    public AguaState abaixoDeZero() {
        System.out.println("Gelo");
        return new AguaSolida();
    }

    @Override
    public AguaState acimaDeZero() {
        System.out.println("Agua Liquida");
        return new AguaLiquida();
    }

    @Override
    public AguaState abaixoDeCem() {
        System.out.println("Agua Liquida");
        return new AguaLiquida();
    }

    @Override
    public AguaState acimaDeCem() {
        System.out.println("Agua Evaporada");
        return new AguaEvaporada();
    }
    
}