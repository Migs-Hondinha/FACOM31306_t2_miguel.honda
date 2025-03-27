import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int grau, n, escolha;
        escolha = 0;

        System.out.println("Digite quantos contatos você terá (4 já são predefinidos a fim de teste, adicione mais que 4):");
        n = ler.nextInt();

        if (n < 4) n = 4;

        Contato[] contatos = new Contato[n];
        contatos[0] = new Familia("Brow", "Alexandre", "hondinha.henry@uol.com.br", "28/08", "Pai");
        contatos[1] = new Amigos("Esse Cara", "Enrico", "enrico.carajo@gmail.com","13/07", 1);
        contatos[2] = new Trabalho("Pedrada", "Gustavo", "gustavin.pedrada@ufu.br", "24/10", "Colega");
        contatos[3] = new Familia("Arrombado", "Carlos", "carlin.potente@gmail.com", "05/12", "Irmão");
        String nome, apelido, email, niver, tipo, relacionamento;


        int aux = 3;
        while (escolha != -1){
            System.out.println("\n(1) Adiciona contato" +
                    "\n(2) Imprime todos os contatos" +
                    "\n(3) Imprime contatos familiares" +
                    "\n(4) Imprime contatos amigos" +
                    "\n(5) Imprime contatos dos colegas de trabalho" +
                    "\n(6) Imprime contatos dos melhores amigos, irmãos e colegas de trabalho" +
                    "\n(7) Imprime contato específico" +
                    "\n(-1) Encerra");
            escolha = ler.nextInt();

            switch (escolha){
                case 1:
                    aux++;
                    if (aux >= n) System.out.println("\nLista cheia");
                    else {
                        System.out.println("Digite o tipo do contato (familia, amigos ou trabalho): ");
                        tipo = ler.next();

                        if (tipo.toUpperCase().equals("FAMILIA")){
                            System.out.println("Digite o nome do contato:");
                            nome = ler.next();
                            System.out.println("Digite o apelido do contato:");
                            apelido = ler.next();
                            System.out.println("Digite o aniversário do contato:");
                            niver = ler.next();
                            System.out.println("Digite o email do contato:");
                            email = ler.next();
                            System.out.println("Digite seu relacionamento com o contado(mãe, pai, irmão, etc):");
                            relacionamento = ler.next();

                            contatos[aux] = new Familia(apelido, nome, email, niver, relacionamento);
                        }
                        else if (tipo.toUpperCase().equals("AMIGOS")){
                            System.out.println("Digite o nome do contato:");
                            nome = ler.next();
                            System.out.println("Digite o apelido do contato:");
                            apelido = ler.next();
                            System.out.println("Digite o aniversário do contato:");
                            niver = ler.next();
                            System.out.println("Digite o email do contato:");
                            email = ler.next();
                            System.out.println("Digite seu relacionamento com o contado (1 = melhor amigo | 2 = amigo | 3 = conhecido):");
                            grau = ler.nextInt();

                            contatos[aux] = new Amigos(apelido, nome, email, niver, grau);
                        }
                        else if (tipo.toUpperCase().equals("TRABALHO")){
                            System.out.println("Digite o nome do contato:");
                            nome = ler.next();
                            System.out.println("Digite o apelido do contato:");
                            apelido = ler.next();
                            System.out.println("Digite o aniversário do contato:");
                            niver = ler.next();
                            System.out.println("Digite o email do contato:");
                            email = ler.next();
                            System.out.println("Digite seu relacionamento com o contado(chefe, colega, etc):");
                            relacionamento = ler.next();

                            contatos[aux] = new Trabalho(apelido, nome, email, niver, relacionamento);
                        }
                        else {
                            System.out.println("Tipo inexistente...");
                            aux--;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nImprimindo todos os contatos...");
                    for (Contato c: contatos){
                        System.out.println(c.imprimirContato());
                    }
                    break;

                case 3:
                    System.out.println("\nImprimindo contatos dos familiares..");
                    for (Contato c: contatos){
                        if (c instanceof Familia) System.out.println(c.imprimirContato());
                    }
                    break;

                case 4:
                    System.out.println("\nImprimindo contados dos amigos...");
                    for (Contato c: contatos){
                        if (c instanceof Amigos) System.out.println(c.imprimirContato());
                    }
                    break;

                case 5:
                    System.out.println("\nImprimindo contados dos colegas do trabalho...");
                    for (Contato c: contatos){
                        if (c instanceof Trabalho){
                            if (((Trabalho)c).getTipo().equals("colega")) System.out.println(c.imprimirContato());
                        }
                    }
                    break;

                case 6:
                    System.out.println("\nImprimindo contatos de melhores amigos, irmãos e colegas de trabalho...");
                    for (Contato c: contatos){
                        if(c instanceof Amigos){
                            if (((Amigos) c).getGrau() == 1) System.out.println(c.imprimirContato());
                        }
                        if(c instanceof Familia){
                            if (((Familia)c).getParentesco().equals("irmão")) System.out.println(c.imprimirContato());
                        }
                        if(c instanceof Trabalho){
                            if (((Trabalho)c).getTipo().equals("colega")) System.out.println(c.imprimirContato());
                        }
                    }
                    break;

                case 7:
                    System.out.println("\nDigite o nome do contato desejado:");
                    nome = ler.next();
                    System.out.println("\nBuscando contato...");
                    for (Contato c: contatos){
                        if (nome.toUpperCase().equals(c.getNome())) {
                            System.out.println(c.imprimirContato());
                            break;
                        }
                    }
                    break;

                case -1:
                    System.out.println("\nEncerrando...");
            }
        }
    }
}