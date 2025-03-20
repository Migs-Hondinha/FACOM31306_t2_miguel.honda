public class Tetraedro extends FormaTridimensional{
    private double lados, alturaT, alturaB;

    public Tetraedro(double l, double hT, double hB){
        lados = l;
        alturaT = hT;
        alturaB = hB;
    }

    public double obterArea(){
        return (Math.pow(lados, 2) * Math.sqrt(3));
    }

    public double obterVolume(){
        return (((double) 1 /3) * ((lados*alturaB) / 2) * alturaT);
    }

    public String descricao(){
        return "\nTetraedro de lado " + lados + ", altura da base " + alturaB + " e altura da forma " + alturaT +"\n";
    }
}
