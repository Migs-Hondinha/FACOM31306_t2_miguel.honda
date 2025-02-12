import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int i = 0;

        System.out.println("<< Listando um vetor em ordem inversa >>");
        while (i < 6){
            System.out.printf("Entre com o número %d\n", i+1);
            vet[i] = sc.nextInt();
            i++;
        }

        i--;
        System.out.println("A ordem inversa dos números é: ");
        while (i > -1){
            System.out.printf("%d ", vet[i]);
            i--;
        }
    }

    public static void ex04(){
        Scanner ler = new Scanner(System.in);
        int[] par = new int[6];
        int i = 0;

        System.out.println("<< Listando um vetor de números pares >>");
        while (i < 6){
            System.out.printf("Entre com o número %d\n", i+1);
            par[i] = ler.nextInt();

            if (par[i]%2 == 0){
                i++;
            }
            else {
                while (par[i]%2 != 0){
                    System.out.println("Erro: valor inválido\n");
                    System.out.printf("Entre com o número %d:\n", i+1);
                    par[i] = ler.nextInt();
                }
                i++;
            }
        }

        int j = 0;
        System.out.println("Os números pares digitados foram:");
        while (j < 6){
            System.out.printf("%d ", par[j]);
            j++;
        }
    }

    public static void ex05(){
        Scanner ler = new Scanner(System.in);
        int [] vet = new int[5];
        int mai, men, soma;
        float med;
        mai = men = soma = 0;

        System.out.println("<< 5 valores >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n", i+1);
            vet[i] = ler.nextInt();
            soma += vet[i];
        }
        med = (float) soma/5;

        mai = men = vet[0];
        for (int i = 1; i < 5; i++){
            if (mai > vet[i]){
                if (vet[i] < men) men = vet[i];
            }
            else {
                mai = vet[i];
            }
        }

        System.out.println("Os números digitados são:");
        for (int i = 0; i < 5; i++) System.out.printf("%d ", vet[i]);
        System.out.printf("\nO maior valor é: \n%d\nO menor valor é: \n%d\nA média é: \n%.2f", mai, men, med);
    }

    public static void ex06(){
        Scanner ler = new Scanner(System.in);
        int [] vet = new int[5];
        int mai, men, soma, posMai, posMen;
        float med;
        mai = men = soma = 0;

        System.out.println("<< 5 valores >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n", i+1);
            vet[i] = ler.nextInt();
            soma += vet[i];
        }
        med = (float) soma/5;

        mai = men = vet[0];
        posMai = posMen = 0;
        for (int i = 1; i < 5; i++){
            if (mai > vet[i]){
                if (vet[i] < men) {
                    men = vet[i];
                    posMen = i;
                }
            }
            else {
                mai = vet[i];
                posMai = i;
            }
        }

        System.out.printf("Os números digitados são: ");
        for (int i = 0; i < 5; i++) System.out.printf("%d ", vet[i]);
        System.out.printf("\nO maior valor é: %d, na posição %d do vetor\nO menor valor é: %d, na posição %d do vetor\nA média é: %.2f", mai, posMai, men, posMen, med);
    }

    public static void ex07(){
        Scanner ler = new Scanner(System.in);
        int[] nota = new int[5];
        int normaliza;

        System.out.println("<<Normalizando as notas>>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d: \n", i+1);
            nota[i] = ler.nextInt();
        }

        System.out.println("Notas normalizadas\n");
        for (int i = 0; i < 5; i++){
            normaliza = nota[i]*2;
            if (normaliza > 100) nota[i] = 100;
            else nota[i] = normaliza;
            System.out.printf("A nota do aluno %d é %d\n", i+1, nota[i]);
        }
    }

    public static void ex08(){
        Scanner ler = new Scanner(System.in);
        double media, desvio, somaDes;
        int soma;
        int[] valor = new int[5];
        soma = 0;
        media = desvio = somaDes = 0;

        System.out.println("<< Média e desvio-padrão >>");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o valor %d: \n", i+1);
            valor[i] = ler.nextInt();
            soma += valor[i];
        }
        media = (double) soma/5;

        for (int i = 0; i < 5; i++){
            somaDes +=  Math.pow((valor[i] - media), 2);
        }
        desvio =  Math.sqrt(somaDes/4);

        System.out.printf("A média é %.2f e o desvio-padrão é %.2f", media, desvio);
    }

    public static void ex09(){
        Scanner ler = new Scanner(System.in);
        int n, soma;
        soma = 0;
        System.out.println("<< Média de n alunos. Máximo 100 alunos >>\nEntre com o número de alunos:");
        n = ler.nextInt();

        if (n > 100){
            System.out.println("Erro! O número máximo de alunos permitido é 100.");
        }
        else {
            int[] nota = new int[n];
            float media;
            media = 0;

            for (int i = 0; i < n; i++) {
                System.out.printf("Digite a nota do aluno %d:\n", i + 1);
                nota[i] = ler.nextInt();
                soma += nota[i];
            }
            media = (float) soma / n;

            System.out.println("\nRelatório de notas");
            for (int i = 0; i < n; i++){
                System.out.printf("Nota do aluno %d: %d\n", i + 1, nota[i]);
            }
            System.out.printf("Média da turma: %.2f", media);
        }
    }

    public static void ex10(){
        Scanner ler = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];
        int i, j, k;
        i = j = k = 0;

        System.out.println("<< Subtração de Vetores >>");
        while (i < 3){
            System.out.printf("Digite o valor %d de A:\n", i+1);
            A[i] = ler.nextInt();
            i++;
            if (i == 3) System.out.println();
        }

        while (j < 3){
            System.out.printf("Digite o valor %d de B:\n", j+1);
            B[j] = ler.nextInt();
            j++;
        }

        while (k < 3){
            C[k] = A[k] - B[k];
            k++;
        }

        System.out.printf("\nO vetor C, definido como C = A - B, é: (");
        for (int n = 0; n < 3; n++) {
            if (n != 2) System.out.printf("%d, ", C[n]);
            else System.out.printf("%d)", C[n]);
        }
    }

    public static void ex11(){
        Scanner ler = new Scanner(System.in);
        int[] v = new int[5];
        int[] v1 = new int[5]; //impar
        int[] v2 = new int[5]; //par
        int j, k;
        j = k = 0;

        System.out.println("<< Pares e ímpares >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d:\n", i+1);
            v[i] = ler.nextInt();

            if (v[i]%2 != 0){
                v1[j] = v[i];
                j++;
            }
            else {
                v2[k] = v[i];
                k++;
            }
        }

        System.out.printf("\nÍmpares: ");
        for (int i = 0; i < j; i++) System.out.printf("%d ", v1[i]);
        System.out.printf("\nPares: ");
        for (int i = 0; i < k; i++) System.out.printf("%d ", v2[i]);
    }

    public static void ex12(){
        Scanner ler = new Scanner(System.in);
        int[] cor = new int[4]; //0 = verde, 1 = azul, 2 = amarelo, 3 = vermelho
        float[] prob = new float[4];
        float maior;
        int soma;
        soma = 0;

        System.out.println("<< Probabilidade >>");
        for (int i = 0; i < 4; i++){
            if (i == 0) System.out.println("Verde:");
            else if (i == 1) System.out.println("Azul:");
            else if (i == 2) System.out.println("Amarelo:");
            else System.out.println("Vermelho:");

            cor[i] = ler.nextInt();
            soma = cor[i] + soma;
            prob[i] = 0;
        }

        for (int i = 0; i < 4; i++) {
            prob[i] = (float) cor[i] / soma * 100;
        }
        maior = prob[0];

        System.out.println("\nProbabilidades");

        for (int i = 0; i < 4; i++){
            if (prob[i] > maior) maior = prob[i];
        }

        for (int i = 0; i < 4; i++){
            if (i == 0) System.out.printf("Verde: %.1f porcento", prob[i]);
            else if (i == 1) System.out.printf("\nAzul: %.1f porcento", prob[i]);
            else if (i == 2) System.out.printf("\nAmarelo: %.1f porcento", prob[i]);
            else System.out.printf("\nVermelhor: %.1f porcento", prob[i]);

            if (maior == prob[i]) System.out.printf("<< Maior probabilidade");
        }
    }

    public static void ex13(){
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[5];

        System.out.println("<< Zerando Negativos >>");
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n", i+1);
            vet[i] = ler.nextInt();

            if (vet[i] < 0) vet[i] = 0;
        }

        System.out.printf("Zerando os negativos, obtém-se: ");
        for (int i = 0; i < 5; i++) System.out.printf("%d ", vet[i]);
    }

    public static void ex14(){
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("<< Universidade X >>\nQuantos alunos serão cadastrados (máx 10000):");
        n = ler.nextInt();
        System.out.println();
        if (n > 10000) System.out.println("Erro! Quantidade ultrapassa o limite.");
        else {
            int[] num = new int[n];
            char[] claSoc = new char[n];
            float[] cra = new float[n];

            for (int i = 0; i < n; i++){
                System.out.printf("Entre com o número do aluno: ");
                num[i] = ler.nextInt();
                System.out.printf("Entre com a classe social do aluno %d: ", num[i]);
                claSoc[i] = ler.next().charAt(0);
                System.out.printf("Entre com o CRA do aluno %d: ", num[i]);
                cra[i] = ler.nextFloat();
                System.out.println();
            }

            System.out.printf("==== Alunos Cadastrados ====");
            for (int i = 0; i < n; i++) System.out.printf("\nNúmero: %d Classe Social: %c CRA: %.2f",num[i], claSoc[i], cra[i]);
        }
    }

    public static void ex15(){
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[8];
        int aux = 0;
        int[] repet = new int[4];

        System.out.println("<< Valores iguais >>");
        for (int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d: \n", i+1);
            vet[i] = ler.nextInt();
        }
        System.out.println();

        int help = 0;
        while (help < 8){
            int count = 0;
            for (int j = help+1; j < 8; j++){
                if (vet[help] == vet[j]){
                    repet[aux] = vet[j];
                    count++;
                }
            }
            help += count;
            aux++;
            if (count == 0) {
                help++;
                aux--;
            }
        }

        System.out.printf("Valores repetidos: ");
        for (int i = 0; i < aux; i++) System.out.printf("%d ", repet[i]);
    }

    public static void ex16(){
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[8];
        int aux = 0;
        int[] repet = new int[4];
        int[] conta = new int[4];

        System.out.println("<< Valores iguais >>");
        for (int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d: \n", i+1);
            vet[i] = ler.nextInt();
        }
        System.out.println();

        int help = 0;
        while (help < 8){
            int count = 0;
            for (int j = help+1; j < 8; j++){
                if (vet[help] == vet[j]){
                    repet[aux] = vet[j];
                    count++;
                }
            }
            help += count;
            if (count != 0) conta[aux] = count+1;
            aux++;
            if (count == 0) {
                help++;
                aux--;
            }
        }

        System.out.println("Valores repetidos:");
        for (int i = 0; i < aux; i++) System.out.printf("%d aparece %d vezes\n", repet[i], conta[i]);
    }

    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        //ex16();
    }
}
