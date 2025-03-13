public class CandidatoPrefeito {
    private String nome, nomeVice, reeleito, data, partido, partidoVice;
    private char genero;
    private double bens;

    public CandidatoPrefeito(String nm, String nv, String rl, String dt, String pt, String pv, char gn, double bn) {
        nome = nm;
        nomeVice = nv;
        reeleito = rl;
        data = dt;
        partido = pt;
        partidoVice = pv;
        genero = gn;
        bens = bn;
    }

    public String toString(){
        return "Candidato a prefeito:\nNome: " + nome +
                "\nNome do vice: " + nomeVice +
                "\nData de nascimento: " + data +
                "\nGênero: " + genero +
                "\nTotal de bens: R$" + bens +
                "\nCandidato à reeleição: " + reeleito +
                "\nNúmero do partido: " + partido +
                "\nNúmero do partido do vice: " + partidoVice;
    }
}
