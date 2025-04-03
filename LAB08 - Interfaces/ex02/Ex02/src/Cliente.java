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

    public int comparar(Classificavel o) {
        Cliente comp = (Cliente) o;
        return (this.nome.compareTo(comp.nome));
    }
}
