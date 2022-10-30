public class AguaEvaporada implements AguaState {

    @Override
    public AguaState abaixoDeZero() {
        System.out.println("Agua Solida");
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
        System.out.println("Vapor");
        return new AguaEvaporada();
    }
    
}
