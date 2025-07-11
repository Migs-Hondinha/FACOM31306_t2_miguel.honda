public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');

    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }

    public void print(boolean cond){
        System.out.println();
        if (cond) {
            System.out.println("EstudanteDoutorado{nome=" + getNome() +
                    " ,endereço=" + getEndereco() + " ,formação=" + getFormacao() +
                    " ,linhaDePesquisa=" + getLinhaDePesquisa() +
                    " ,tituloTese=" + tituloTese
                    + "}"
            );
        }
        else {
            super.print(cond);
            System.out.println("EstudanteDoutorado{" +
                    "tituloTese='" + tituloTese + '\'' +
                    '}');
        }
    }
}
