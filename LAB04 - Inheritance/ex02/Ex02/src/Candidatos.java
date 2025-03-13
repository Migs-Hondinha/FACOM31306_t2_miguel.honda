public class Candidatos {
    protected String nome, reeleito, data, partido;
    protected char genero;
    protected double bens;

    public Candidatos(String nm, String rl, String dt, String pt, char gen, double bs){
        nome = nm;
        reeleito = rl;
        data = dt;
        partido = pt;
        genero = gen;
        bens = bs;
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
