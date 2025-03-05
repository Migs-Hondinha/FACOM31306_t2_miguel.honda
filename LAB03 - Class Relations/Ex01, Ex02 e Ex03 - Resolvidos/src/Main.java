import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nC, nM;
        String com, mob, endereco, nome, data, estado;
        Scanner ler = new Scanner(System.in);
        Proprietario proprietario;

        System.out.println("\nDigite o endereço de sua residência (número e rua/avenida):");
        endereco = ler.nextLine();
        System.out.println();

        System.out.println("Digite quantos comodos tem sua residência: ");
        nC = ler.nextInt();
        Comodo[] comodos = new Comodo[nC];
        System.out.println();

        for (int i = 0; i < nC; i++){
            System.out.println("Digite o nome do comodo " + (i+1) + ":");
            com = ler.next();
            System.out.println("\nDigite quantas mobilhas há nesse comodo: ");
            nM = ler.nextInt();
            Mobilha[] mobilhas = new Mobilha[nM];
            for (int j = 0; j < nM; j++){
                System.out.println("Digite o nome da mobilha " + (j+1) + ":");
                mob = ler.next();
                mobilhas[j] = new Mobilha(mob);
            }
            comodos[i] = new Comodo(com, mobilhas);
            System.out.println();
        }
        Casa casa = new Casa(endereco, comodos);

        System.out.println("Digite seu nome, seu estado civil atual e a data de estabelecimento em sua moradia:");
        nome = ler.next();
        estado = ler.next();
        data = ler.next();

        proprietario = new Proprietario(nome, estado, data, casa);

        System.out.println();
        System.out.print(proprietario);
    }
}

/*
Relações:
- Associação: entre o Objeto Proprietario e o Objeto Casa, visto que o proprietário usa a casa e pode existir independente da casa e a casa pode existir independete do proprietario
- Agragação: entre o Objeto Comodo e o Objeto Mobilha, visto que a mobilha continua a existir sem um comodo, mas um comodo deve ser mobilhado
- Composição: entre o Objeto Casa e o Objeto Comodo, visto que sem uma casa, não há necessidade de haver comodos e uma casa depende de comodos

Respostas:
- Ex01: Sim, os objetos nesse caso são independetes (casa e proprietário).
- Ex02: Nem todos são independentes, um dos objetos faz parte de outro (mobilha faz parte do comodo), mas um dos objetos pode existir independentemente de outro (mobilha não depende do comodo).
- Ex03: Ao remover a parte(comodo), não há motivo para o todo(casa) existir, visto que ambos dependem um do outro para existir (casa depende de comodos e sem casa não há comodos).
*/