import java.util.Scanner;

public class Main {
    public static void insertSort(criaProduto[] p, int n){
        criaProduto aux = null;
        int i, j;

        for (i = 1; i < n; i++){
            aux = p[i];

            for (j = i - 1; (j >= 0) && (p[j].getNome().compareTo(aux.getNome()) > 0); j--){
                p[j+1] = p[j];
            }
            p[j+1] = aux;
        }
    }

    public static void main(String[] args) {
        String nome;
        float preco;
        int estoque;
        Scanner ler = new Scanner(System.in);
        criaProduto[] prod = new criaProduto[4];

        criaProduto prodEsp = new criaProduto("especial", 1000000, 1);
        prodEsp.destroiProduto(prodEsp);

        for (int i = 0; i < 4; i++){
            System.out.println("\nInforme o nome, o preço e a quantidade em estoque do produto " + (i+1) + ":");
            nome = ler.next();
            preco = ler.nextFloat();
            estoque = ler.nextInt();
            prod[i] = new criaProduto(nome, preco, estoque);
        }

        System.out.println("\nAumentando preço em 10% do produto 1 e 3...");
        prod[0].alterar(10);
        prod[2].alterar(10);

        System.out.println("\nReduzindo preço em 5% do produto 2...");
        if (prod[1].alterar(-5) == -1) System.out.println("\nErro: preço não alterado. Porcentagem inválida!");
        else System.out.println("\nPreço alterado com sucesso!");

        System.out.println("\nAlterando preço do produto 4...");
        if (prod[3].alterar(-110) == -1) System.out.println("\nErro: preço não alterado. Porcentagem inválida!");

        System.out.println("\nOrdenando os produtos...");
        insertSort(prod, 4);

        System.out.println("\nProdutos cadastrados (ordenados):");
        for(criaProduto p: prod){
            p.imprime();
        }

        for(criaProduto p: prod){
            p.destroiProduto(p);
        }
    }
}