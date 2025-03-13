public class VIP extends Ingresso{
    protected double adicional;

    public VIP(Ingresso ingresso, double add){
        super(ingresso.valor + add);
        adicional = add;
    }

    public double getAdicional() {
        return adicional;
    }
    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void escreveValorTipo(){
        System.out.println("Ingresso VIP");
        escreveValor();
        System.out.println(" (com adicional)");
    }
}
