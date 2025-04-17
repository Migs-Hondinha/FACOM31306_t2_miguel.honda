import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

        ArrayDeque<Estudante> estudante = new ArrayDeque<Estudante>();
        //tenta pegar primeiro elemento e imprimi-lo (uso getFirst) com erro de exceção proposital
        try{
            estudante.getFirst().print();
        }
        catch (RuntimeException e){
            System.out.println("Erro! Lista vazia:" + e);
        }

        System.out.println("\nLista não está mais vazia a partir daqui");
        //criar lista deque sem est1 e est6
        estudante.add(est2);
        estudante.add(est3);
        estudante.add(est4);
        estudante.add(est5);

        //uso de addLast
        try{
            estudante.addLast(est6);
        }
        catch (RuntimeException e){
            System.out.println("\nErro! não foi possível adicionar o Estudante no fim:" + e);
        }

        //uso de offerFirst
        boolean retorno = estudante.offerFirst(est1);
        if (!retorno) System.out.println("\nNão foi possível adicionar o Estudante no inicio\n");

        //imprime todo mundo bunitu
        System.out.println("Pré-Remoção:");
        for (Estudante e: estudante){
            e.print();
        }

        System.out.println("\n\nPós-Remoção:");
        try{
            estudante.removeFirst();
        }
        catch (RuntimeException e){
            System.out.println("\nErro! Falha ao remover o primeiro Estudante");
        }
        estudante.pollLast();
        
        for (Estudante e: estudante){
            e.print();
        }
    }
}
