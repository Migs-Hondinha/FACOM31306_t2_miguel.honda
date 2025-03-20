public class Triangulo extends FormaBidimensional{
    private double base, altura;

    public Triangulo(double bs, double h){
        base = bs;
        altura = h;
    }

    public double obterArea(){
        return (base*altura)/2;
    }

    public String descricao(){
        return "\nTriângulo de base " + base + " e altura " + altura + "\n";
    }
}
