public class CandidatoVereador extends Candidatos{
    private String tresDigitos, bairro;

    public CandidatoVereador(String nm, String rl, String dt, String pt, String td, String br, char gen, double bn){
        super(nm, rl, dt, pt, gen, bn);
        tresDigitos = td;
        bairro = br;
    }

    public String toString(){
        return "Candidato a vereador:\nNome: " + nome +
                "\nData de Nascimento: " + data +
                "\nGênero: " + genero +
                "\nTotal de bens: R$" + bens +
                "\nCandidato à reeleição: " + reeleito +
                "\nNúmero do Partido: " + partido +
                "\nTrês digitos: " + tresDigitos +
                "\nBairro de moradia: " + bairro;
    }
}
