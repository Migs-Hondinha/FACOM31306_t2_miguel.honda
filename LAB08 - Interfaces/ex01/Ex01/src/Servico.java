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

    public boolean eMenorQue(Classificavel o){
        Servico comp = (Servico) o;
        if (this.preco < comp.preco) return true;
        else return false;
    }
}
