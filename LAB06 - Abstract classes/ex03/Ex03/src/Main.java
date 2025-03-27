import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente[] novo = new ContaEspecial[5];
        novo[0] = new ContaEspecial(10000, 10001, 731894, 5000);
        novo[1] = new ContaEspecial(2000, 10002, 297635, 1000);
        novo[2] = new ContaEspecial(15000, 10003, 502571, 7500);
        novo[3] = new ContaEspecial(6000, 10004, 214035, 3000);
        novo[4] = new ContaEspecial(5000, 10005, 392014, 2500);
        UsaBanco banco = new UsaBanco(novo);
        Scanner ler = new Scanner(System.in);
        int senha, numero;
        int escolher = 0;
        float valor;

        System.out.println("Digite seu número de conta e sua senha:");
        numero = ler.nextInt();
        senha = ler.nextInt();

        banco.achaConta(numero, senha);

        if (banco.getIndice() < 0){
            System.out.println("Conta não encontrada ou senha incorreta!");
        }
        else{
            banco.imprimeConta(senha);
            while (escolher != -1){
                System.out.println("\n(1) Creditar" +
                        "\n(2) Depositar" +
                        "\n(-1) Encerrar");
                escolher = ler.nextInt();

                switch (escolher){
                    case 1:
                        System.out.println("Digite o valor para creditar: ");
                        valor = ler.nextFloat();
                        banco.creditar(numero, senha, valor);
                        banco.imprimeConta(senha);
                        break;

                    case 2:
                        System.out.println("Digite o valor para depositar: ");
                        valor = ler.nextFloat();
                        banco.depositar(numero, senha, valor);
                        banco.imprimeConta(senha);
                        break;

                    case -1:
                        System.out.println("Encerrando...");
                        break;
                }
            }
        }
    }
}