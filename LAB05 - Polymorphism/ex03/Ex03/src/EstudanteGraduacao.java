public class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    public void print() {
        super.print();
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }

    public void print(boolean cond){
        System.out.println();
        if (cond) {
            System.out.println("EstudanteGraduação{nome=" + getNome() +
                    " ,endereço=" + getEndereco() + " ,tituloTCC=" + tituloTCC + "}"
            );
        }
        else {
            super.print(cond);
            System.out.println("EstudanteGraduacao{" +
                    "tituloTCC='" + tituloTCC + '\'' +
                    '}');
        }
    }
}
