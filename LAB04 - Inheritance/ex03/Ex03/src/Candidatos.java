public class Candidatos {
    private String nome, reeleito, data, partido;
    private char genero;
    private double bens;

    public Candidatos(String nm, String rl, String dt, String pt, char gen, double bs){
        nome = nm;
        reeleito = rl;
        data = dt;
        partido = pt;
        genero = gen;
        bens = bs;
    }

    public String getNome() {
        return nome;
    }
    public String getReeleito() {
        return reeleito;
    }
    public String getData() {
        return data;
    }
    public String getPartido() {
        return partido;
    }
    public char getGenero() {
        return genero;
    }
    public double getBens() {
        return bens;
    }

    public String toString(){
        return "Nome: " + nome +
                "\nData de nascimento: " + data +
                "\nGênero: " + genero +
                "\nTotal de bens: " + bens +
                "\nCandidato a reeleição: " + reeleito +
                "\nNúmero do partido: " + partido;
    }
}
