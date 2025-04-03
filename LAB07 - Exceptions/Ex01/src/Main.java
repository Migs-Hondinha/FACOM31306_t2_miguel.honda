import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario melhorDeTodos = new Funcionario("Vinicius Tavares Martins", "138124987-90", 20000.0); //o nome do atributo foi sugerido pra mim
        double porcento;

        System.out.print(melhorDeTodos);

        System.out.println("\nDigite a porcentagem (não precisa ser decimal, a conversão é feita pelo programa) que o salário irá aumentar:");
        porcento = ler.nextDouble();

        try {
            melhorDeTodos.aumentarSalario(porcento);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSalário pós conversão: ");
        System.out.print(melhorDeTodos);
    }
}