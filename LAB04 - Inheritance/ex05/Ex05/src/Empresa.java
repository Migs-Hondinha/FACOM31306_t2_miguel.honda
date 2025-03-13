import java.util.Scanner;

public class Empresa {
    public static void main(String[] args){
        Chefe[] burgues = new Chefe[2];
        Vendedor[] golpista = new Vendedor[2];
        Operario[] trabalhador = new Operario[2];
        Horista[] escravo = new Horista[2];

        Scanner ler = new Scanner(System.in);
        String nome, data;
        double valor, extra;
        int num;

        int i = 0;
        while (i < 2){
            System.out.println("Digite o nome, a data de nascimento (com o /) e o salário do Chefe " + (i+1) + ":");
            nome = ler.next();
            data = ler.next();
            valor = ler.nextDouble();
            burgues[i] = new Chefe(nome, data, valor);
            System.out.println();

            System.out.println("Digite o nome, a data de nascimento (com o /), o salário fixo, a comissão e o número de vendas feitas pelo Vendedor " + (i+1) + ":");
            nome = ler.next();
            data = ler.next();
            valor = ler.nextDouble();
            extra = ler.nextDouble();
            num = ler.nextInt();
            golpista[i] = new Vendedor(nome, data, valor, extra, num);
            System.out.println();

            System.out.println("Digite o nome, a data de nascimento (com o /), o valor da produção e o número de produtos feitos pelo Operario " + (i+1) + ":");
            nome = ler.next();
            data = ler.next();
            valor = ler.nextDouble();
            num = ler.nextInt();
            trabalhador[i] = new Operario(nome, data, valor, num);
            System.out.println();

            System.out.println("Digite o nome, a data de nascimento (com o /), o valor por hora e o tanto de horas trabalhadas pelo Horista " + (i+1) + ":");
            nome = ler.next();
            data = ler.next();
            valor = ler.nextDouble();
            extra = ler.nextDouble();
            escravo[i] = new Horista(nome, data, extra, valor);
            System.out.println();

            i++;
        }

        for (int j = 0; j < 2; j++){
            System.out.print(burgues[j] + "\n");
            System.out.print(golpista[j] + "\n");
            System.out.print(trabalhador[j] + "\n");
            System.out.print(escravo[j] + "\n");
        }
    }
}
