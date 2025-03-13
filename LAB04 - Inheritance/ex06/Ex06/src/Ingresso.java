public class Ingresso {
    protected double valor;

    public Ingresso(double preco){
        valor = preco;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void escreveValor(){
        System.out.print("Custo do Ingresso: R$ " + valor);
    }
}
