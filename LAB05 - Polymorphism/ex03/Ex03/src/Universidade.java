public class Universidade {
    private String nome, fundacao;
    private Estudante[] estudantes;
    private int max;

    public Universidade(String nm, String fund, Estudante[] est, int m){
        nome = nm;
        fundacao = fund;
        estudantes = est;
        max = m;
    }

    public void contador(){
        int contGrad, contMest, contDout;
        contGrad = contMest = contDout = 0;

        for (Estudante est: estudantes){
            if (est instanceof EstudanteGraduacao)contGrad++;
            else if (est instanceof EstudanteMestrado) contMest++;
            else if (est instanceof EstudanteDoutorado) contDout++;
        }

        System.out.println("Estudantes de Graduação: " + contGrad + "\nEstudantes de Mestrado: " + contMest + "\nEstudantes de Doutorado: " + contDout + "\n");
    }

    public void imprime(){
        System.out.println("\nUniversidade " + nome + "(Fundação: " + fundacao + ")");
        for (Estudante est: estudantes){
            if (est instanceof EstudanteGraduacao) System.out.println("Estudande de Graduação " + est.getNome());
            else if (est instanceof EstudanteMestrado) System.out.println("Estudante de Mestrado " + est.getNome());
            else if(est instanceof EstudanteDoutorado) System.out.println("Estudante de Doutorado " + est.getNome() + "\nTítulo de tese: " + ((EstudanteDoutorado) est).getTituloTese());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFundacao() {
        return fundacao;
    }

    public void setFundacao(String fundacao) {
        this.fundacao = fundacao;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
