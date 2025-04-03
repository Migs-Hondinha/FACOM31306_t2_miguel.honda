public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String n){
        nome = n;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue(Classificavel o) {
        Cliente comp = (Cliente) o;
        if (this.nome.compareTo(comp.nome) < 0) return true;
        else return false;
    }
}
