public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double r){
        raio = r;
    }

    public double obterVolume(){
        return ((4/3) * Math.PI * Math.pow(raio, 3));
    }

    public double obterArea(){
        return (4 * Math.PI * Math.pow(raio, 2));
    }

    public String descricao(){
        return "\nEsfera de raio " + raio + "\n";
    }
}
