public class CandidatoPrefeito extends Candidatos {
    private String nomeVice, partidoVice;

    public CandidatoPrefeito(String nm, String nv, String rl, String dt, String pt, String pv, char gn, double bn){
        super(nm, rl,dt, pt, gn, bn);
        nomeVice = nv;
        partidoVice = pv;
    }

    public String toString(){
        return super.toString() +
                "\nNome do vice: " + nomeVice +
                "\nNúmero do partido do vice: " + partidoVice;
    }
}
