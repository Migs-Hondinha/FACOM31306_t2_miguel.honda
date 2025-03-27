import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente novo = new ContaEspecial(10000, 15319, 297635, 5000);
        Scanner ler = new Scanner(System.in);
        int senha = 0;
        float valor = 0;

        System.out.println("Digite a senha (297635): ");
        senha = ler.nextInt();

        if (novo.isSenha(senha)) {
            System.out.println(novo.imprime(senha));


            System.out.println("\nDigite o valor que deseja debitar: ");
            valor = ler.nextFloat();

            if (novo.debitaValor(valor, senha)) System.out.println("Debitando...\n");
            else System.out.println("Inválido...");

            if (((ContaEspecial) novo).getLimite(senha) == 0) {
                System.out.println("Limite zerado, transformando em conta normal...\n");
                novo = new ContaComum(novo.getSaldo(senha), novo.getNumConta(senha), senha, 0);
            }

            System.out.println(novo.imprime(senha));
        }
        else System.out.println(novo.imprime(senha));
    }
}