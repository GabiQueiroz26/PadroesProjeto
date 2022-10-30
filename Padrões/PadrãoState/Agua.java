public class Agua {

    protected AguaState estadoInicial;

    public Agua(){

        estadoInicial = new AguaLiquida();
    }

    public void abaixoDeZero() {
        estadoInicial = estadoInicial.abaixoDeZero();
    }

    public void acimaDeZero(){
        estadoInicial = estadoInicial.acimaDeZero();
    }

    public void abaixoDeCem() {
        estadoInicial = estadoInicial.abaixoDeCem();
    }

    public void acimaDeCem(){
        estadoInicial = estadoInicial.acimaDeCem();
    }

}