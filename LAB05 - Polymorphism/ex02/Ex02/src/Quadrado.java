public class Quadrado extends FormaBidimensional{
    private double lados;

    public Quadrado(double l){
        lados = l;
    }

    public double obterArea(){
        return (Math.pow(lados ,2));
    }

    public String descricao(){
        return "\nQuadrado de lado " + lados + "\n";
    }
}
