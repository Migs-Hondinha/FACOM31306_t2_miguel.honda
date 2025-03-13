public class Normal extends Ingresso{
    public Normal(Ingresso ingresso){
        super(ingresso.valor);
    }

    public void escreveValorTipo(){
        System.out.println("Ingresso Normal");
        escreveValor();
    }
}
