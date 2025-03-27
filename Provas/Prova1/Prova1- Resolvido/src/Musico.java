public class Musico {
    private String nome, papel;
    private int exp;
    private double remun;

    public Musico(String n, String p, int e, double re){
        nome = n;
        papel = p;
        exp = e;
        remun = re;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public double getRemun() {
        return remun;
    }

    public void setRemun(double remun) {
        this.remun = remun;
    }//escrever alt insert na proxima prova se for assim

    public String toString(){
        return "\nNome: " + nome +
                "\nPapel: " + papel +
                "\nExperiência em anos: " + exp +
                "\nRemuneração por hora: R$" + remun;
    }
}
