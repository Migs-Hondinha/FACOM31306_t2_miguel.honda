public class EstudanteMestrado extends EstudantePosGrad{
    private String tipo; // tipo pode ser acadêmico ou profisional
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao,
                             String linhadDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteMestrado{" +
                "tipo='" + tipo + '\'' +
                ", tituloDissertacao='" + tituloDissertacao + '\'' +
                '}');
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }

    public void print(boolean cond){
        System.out.println();
        if (cond) {
            System.out.println("EstudanteMestrado{nome=" + getNome() +
                    " ,endereço=" + getEndereco() + " ,formação=" + getFormacao() +
                    " ,linhaDePesquisa=" + getLinhaDePesquisa() +
                    " ,tipo=" + tipo + " ,tituloDissetação=" + tituloDissertacao + "}"
            );
        }
        else {
            super.print(cond);
            System.out.println("EstudanteMestrado{" +
                    "tipo='" + tipo + '\'' +
                    ", tituloDissertacao='" + tituloDissertacao + '\'' +
                    '}');
        }
    }
}
