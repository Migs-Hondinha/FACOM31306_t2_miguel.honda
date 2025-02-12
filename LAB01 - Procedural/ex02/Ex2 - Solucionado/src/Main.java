import java.util.Scanner;

public class Main {
    public static int alterarPreco(int n, float[] preco, float porcentagem){
        float temp;

        if (porcentagem > -100){
            temp = 1 + porcentagem/100;
            preco[n] = preco[n] * temp;
            return 0;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args){
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtd_Estoque = new int[4];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.printf("\nInforme o nome, o preco e a qtd. em estoque do produto %d\n", i+1);
            nome[i] = ler.next();
            preco[i] = ler.nextFloat();
            qtd_Estoque[i] = ler.nextInt();
        }

        System.out.printf("\nAumentando o preco em 10%% do produto 1 e 3\n");
        alterarPreco(0 ,preco, -110);
        alterarPreco(2 ,preco, 10);

        preco[0] = preco[0]*(-110);

        System.out.printf("\nReduzindo o preco em 5%% do produto 2\n");
        if (alterarPreco(1 ,preco, -5) == -1) System.out.printf("\nErro: preco nao alterado. Porcentagem invalida\n");
        else System.out.printf("\nPreco alterado com sucesso\n");

        System.out.printf("\nAlterando o preco do prod. 4\n");

        if (alterarPreco(3 ,preco, -110) == -1) System.out.printf("Erro: preco nao alterado. Porcentagem invalida\n");

        System.out.printf("\nProdutos Cadastrados:");
        for (int i = 0; i < 4; i++){
            System.out.printf("\nProduto %d: %s\nPreco: %f\nEstoque: %d\n", (i+1), nome[i], preco[i], qtd_Estoque[i]);
        }
    }
}