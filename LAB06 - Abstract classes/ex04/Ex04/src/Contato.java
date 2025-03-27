public abstract class Contato {
    protected String apelido, nome, email, aniversario;

    public Contato(String ap, String no, String em, String ani){
        apelido = ap;
        nome =no;
        email = em;
        aniversario = ani;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public String imprimirBasico(){
        return "\nNome: " + nome +
                "\nApelido: " + apelido +
                "\nAniversário: " + aniversario +
                "\nEmail: " + email;
    }

    public String imprimirContato(){
        return imprimirBasico();
    }
}
