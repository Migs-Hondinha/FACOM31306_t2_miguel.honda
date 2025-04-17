import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int index = -1;
        int count = 0;
        int original = 0;
        Scanner ler = new Scanner(System.in);

        EstudanteDoutorado est5 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        EstudanteDoutorado est6 = new EstudanteDoutorado("Maria","Rua Verão",
                "Tecnologia","Processamento de Imagens","Casas Inteligentes");

        EstudanteDoutorado est3 = new EstudanteDoutorado("Ana","Rua Primavera",
                "Tecnologia","Processamento de Imagens","Cidades Inteligentes");

        EstudanteGraduacao est4 = new EstudanteGraduacao("Alexandre", "Avenida Manoel Goulart",
                "Quais os motivos que levam as pessoas a prática do Judô");

        EstudanteGraduacao est1 = new EstudanteGraduacao("Rosana", "Avenida Manoel Goulart",
                "Atividades Físicas como forma de terapia no acompanhamento de pessoas depressivas");

        EstudanteMestrado est2 = new EstudanteMestrado("Tiago", "Rua José ALves Garcia",
                "Ciência da Computação", "Segurança da Informação", "Profissional", "Como acessar a DeepWeb com Segurança");

        Stack<Estudante> estPilha = new Stack<Estudante>();
        estPilha.add(est1);
        estPilha.add(est2);
        estPilha.add(est3);
        estPilha.add(est4);
        estPilha.add(est5);
        estPilha.add(est6);

        System.out.println("-------------Stack(Pilha)-------------");
        for (Estudante e: estPilha){
            count++;
        }

        original = count;
        System.out.println("\nEstudantes cadastrados (" + count + "):");
        for (Estudante e: estPilha){
            e.print();
        }

        do {
            System.out.println("\nEscolha um indice para remover um aluno (0 a " + (count - 1) + "):");
            System.out.println("OBS: para colocar indice maior ou menor que o esperado para sair.");
            index = ler.nextInt();
            if (index > -1 && index < count){
                estPilha.remove(index);
                count--;
                index = 0;
            }
        } while (index > -1 && index < count);

        if (count < original){
            System.out.println("\nPós-remoção(" + count + " alunos):");
            for (Estudante e : estPilha) {
                e.print();
            }
        }

        ArrayList<Estudante> estLista = new ArrayList<Estudante>();
        estLista.add(est1);
        estLista.add(est2);
        estLista.add(est3);
        estLista.add(est4);
        estLista.add(est5);
        estLista.add(est6);
        count = 0;
        original = 0;
        index = -1;

        System.out.println("\n\n-------------ArrayList(Lista)-------------");
        for (Estudante e: estLista){
            count++;
        }

        original = count;
        System.out.println("\nEstudantes cadastrados (" + count + "):");
        for (Estudante e: estLista){
            e.print();
        }

        do {
            System.out.println("\nEscolha um indice para remover um aluno (0 a " + (count - 1) + "):");
            System.out.println("OBS: para colocar indice maior ou menor que o esperado para sair.");
            index = ler.nextInt();
            if (index > -1 && index < count){
                estLista.remove(index);
                count--;
                index = 0;
            }
        } while (index > -1 && index < count);

        if (count < original){
            System.out.println("\nPós-remoção(" + count + " alunos):");
            for (Estudante e : estLista) {
                e.print();
            }
        }

        System.out.println("\n\n-------------Sort(Ordenação) com ArrayList(Lista)-------------");
        System.out.println("\nPré-ordenação:");
        for (Estudante e: estLista){
            e.print();
        }
        Collections.sort(estLista);
        System.out.println("\n\nPós-ordenação:");
        for (Estudante e: estLista){
            e.print();
        }
    }
}
