public class Eleicao {
    private String municipio;
    private int votantes;
    private Candidatos[] candidatos;

    public Eleicao(String m, int v, Candidatos[] c){
        municipio = m;
        votantes = v;
        candidatos = c;
    }

    public String getMunicipio(){
        return municipio;
    }

    public int getVotantes(){
        return votantes;
    }

    public Candidatos[] getCandidatos() {
        return candidatos;
    }
}
