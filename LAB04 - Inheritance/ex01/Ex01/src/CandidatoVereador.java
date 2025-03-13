public class CandidatoVereador {
    private String nome, reeleito, data, partido, tresDigitos, bairro;
    private char genero;
    private double bens;

    public CandidatoVereador(String nm, String rl, String dt, String pt, String td, String br, char gen, double bn){
        nome = nm;
        reeleito = rl;
        data = dt;
        partido = pt;
        tresDigitos = td;
        bairro = br;
        genero = gen;
        bens = bn;
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
