public class CandidatoVereador extends Candidatos {
    private String tresDigitos, bairro;

    public CandidatoVereador(String nm, String rl, String dt, String pt, String td, String br, char gen, double bn){
        super(nm, rl, dt, pt, gen, bn);
        tresDigitos = td;
        bairro = br;
    }

    public CandidatoVereador(String td, String br, Candidatos vereador){
        super(vereador.getNome(), vereador.getReeleito(), vereador.getData(), vereador.getPartido(), vereador.getGenero(), vereador.getBens());
        tresDigitos = td;
        bairro = br;
    }

    public String toString(){
        return super.toString() +
                "\nTrês digitos: " + tresDigitos +
                "\nBairro de moradia: " + bairro;
    }
}
