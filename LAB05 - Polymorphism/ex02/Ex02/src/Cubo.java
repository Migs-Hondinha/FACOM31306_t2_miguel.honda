public class Cubo extends FormaTridimensional{
    private double lados;

    public Cubo(double l){
        lados = l;
    }

    public double obterVolume(){
        return (Math.pow(lados, 3));
    }

    public double obterArea(){
        return (6 * Math.pow(lados, 2));
    }

    public String descricao(){
        return "\nCubo de lado " + lados + "\n";
    }
}
