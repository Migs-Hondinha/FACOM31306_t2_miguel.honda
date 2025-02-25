public class Candidatos {
    private String nome, reeleito, cargo, data;
    private int partido;
    private char genero;
    private double bens;

    public Candidatos(String n, String r, String c, String d, int p, char g, double b){
        nome = n;
        reeleito = r;
        cargo = c;
        data = d;
        partido = p;
        genero = g;
        bens = b;
    }

    public String getNome() {
        return nome;
    }

    public String getReeleito() {
        return reeleito;
    }

    public String getCargo() {
        return cargo;
    }

    public String getData() {
        return data;
    }

    public int getPartido() {
        return partido;
    }

    public char getGenero() {
        return genero;
    }

    public double getBens() {
        return bens;
    }
}
