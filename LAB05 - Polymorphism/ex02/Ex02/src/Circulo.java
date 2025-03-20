public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double r){
        raio = r;
    }

    public double obterArea(){
        return (Math.PI * Math.pow(raio ,2));
    }

    public String descricao(){
        return "\nCirculo de raio " + raio + "\n";
    }
}
