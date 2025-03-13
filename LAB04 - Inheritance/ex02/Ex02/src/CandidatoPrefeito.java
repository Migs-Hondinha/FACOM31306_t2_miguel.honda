public class CandidatoPrefeito extends Candidatos{
    private String nomeVice, partidoVice;

    public CandidatoPrefeito(String nm, String nv, String rl, String dt, String pt, String pv, char gn, double bn){
        super(nm, rl,dt, pt, gn, bn);
        nomeVice = nv;
        partidoVice = pv;
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
