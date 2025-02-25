public class criaProduto {
    private String nome;
    private float preco;
    private int estoque;

    public criaProduto(String n, float p, int e){
        nome = n;
        preco = p;
        estoque = e;
    }
    public criaProduto(String n, float p){
        nome = n;
        preco = p;
        estoque = 0;
    }
    public criaProduto(String n, int e){
        nome = n;
        preco = 0;
        estoque = e;
    }
    public criaProduto(float p, int e){
        nome = " ";
        preco = p;
        estoque = e;
    }
    public criaProduto(String n){
        nome = n;
        preco = 0;
        estoque = 0;
    }
    public criaProduto(float p){
        nome = " ";
        preco = p;
        estoque = 0;
    }
    public criaProduto(int e){
        nome = " ";
        preco = 0;
        estoque = e;
    }
    public criaProduto(){
        nome = " ";
        preco = 0;
        estoque = 0;
    }

    public int alterar(float porcenagem){
        float aux;

        if (porcenagem > -100){
            aux = 1 + (porcenagem/100);
            preco = preco*aux;
            return 0;
        }
        else return -1;
    }

    public void imprime(){
        System.out.println("Produto: " + nome + " Preço: R$ " + preco + " Estoque: " + estoque);
    }

    public int destroiProduto(criaProduto p){
        if (p == null){
            return -1;
        }
        else {
            p = null;
            return 0;
        }
    }

    public String getNome() {
        return nome;
    }
}
