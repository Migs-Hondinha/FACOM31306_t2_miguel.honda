import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Musico[] musico = new Musico[3];
        Dueto[] dueto;
        int n, exp, escolha;
        double remum;
        String nomeD, nomeM, papel;

        System.out.println("Digite a quantidade de duetos desejados: ");
        n = ler.nextInt();
        dueto = new Dueto[n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
            System.out.println("\nDigite o nome do músico, seu papel, anos de experiência e remuneração:");
            nomeM = ler.next();
            papel = ler.next();
            exp = ler.nextInt();
            remum = ler.nextDouble();
            musico[j] = new Musico(nomeM, papel, exp, remum);
            }
            System.out.println("\nHaverá um músico substituto ? (1 para Sim, outro digito para Não)");
            escolha = ler.nextInt();
            if (escolha == 1){
                System.out.println("\nDigite o nome do músico substituto, seu papel, anos de experiência e remuneração:");
                nomeM = ler.next();
                papel = ler.next();
                exp = ler.nextInt();
                remum = ler.nextDouble();
                musico[2] = new Musico(nomeM, papel, exp, remum);

                System.out.println("\nDigite o nome do dueto: ");
                nomeD = ler.next();

                dueto[i] = new Dueto(musico[0], musico[1], musico[2], nomeD);
            }
            else {
                System.out.println("\nDigite o nome do dueto: ");
                nomeD = ler.next();

                dueto[i] = new Dueto(musico[0], musico[1], nomeD);
            }
        }

        //imprime tudo
        for (Dueto d: dueto){
            System.out.print(d);
            System.out.println();
        }

        double maior = 0;
        for (Dueto d: dueto){
            if (d.remumMedia() > maior) {maior = d.remumMedia();}
        }

        for (Dueto d: dueto){
            if (maior == d.remumMedia()){
                System.out.print("\n\nDueto de maior remuneração média:");
                System.out.print(d);
                System.out.println("Com remuneração média de R$" + maior);
                break;
            }
        }

        //free
        for (int i = 0; i < n; i++){
            dueto[i] = null;
        }
    }
}