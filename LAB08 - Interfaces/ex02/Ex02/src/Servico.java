public class Servico implements Classificavel{
    private float preco;

    public Servico(float prc){
        preco = prc;
    }

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int comparar(Classificavel o){
        Servico comp = (Servico) o;
        if (this.preco == comp.preco) return 0;
        else if (this.preco < comp.preco) return -1;
        else return 1;
    }
}
