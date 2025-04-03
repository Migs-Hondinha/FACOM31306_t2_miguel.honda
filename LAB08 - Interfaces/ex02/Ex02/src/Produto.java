public class Produto implements Classificavel{
    private int codigo;

    public Produto(int c){
        codigo = c;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int comparar(Classificavel o){
        Produto compara = (Produto) o;
        if (this.codigo == compara.codigo) return 0;
        else if (this.codigo < compara.codigo) return -1;
        else return 1;
    }
}
