import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cliente[] client = new Cliente[5];
        Produto[] product = new Produto[5];
        Servico[] service = new Servico[5];
        Classificador classifier = new Classificador();
        Random r = new Random();

        client[0] = new Cliente("Tiago");
        client[1] = new Cliente("Vinicius");
        client[2] = new Cliente("Gustavo");
        client[3] = new Cliente("Arthur");
        client[4] = new Cliente("Miguel");

        for(int i = 0; i < 5; i++){
            if (i%2 == 0){
                product[i] = new Produto(i + r.nextInt(2, 30));
                service[i] = new Servico(((float) i + r.nextFloat(1, 15))*r.nextFloat(1, 9));
            }
            else {
                product[i] = new Produto(i + r.nextInt(9, 57));
                service[i] = new Servico(((float) i + r.nextFloat(100, 300))/r.nextFloat(10, 30));
            }
        }

        System.out.println("\nPré-Ordenação");
        for(Cliente c: client){
            System.out.println("Cliente: " + c.getNome());
        }
        for(Produto p: product){
            System.out.println("Produto: " + p.getCodigo());
        }
        for(Servico s: service){
            System.out.println("Serviço: " + s.getPreco());
        }

        classifier.ordena(client);
        classifier.ordena(product);
        classifier.ordena(service);

        System.out.println("\nPós-Ordenação");
        for(Cliente c: client){
            System.out.println("Cliente: " + c.getNome());
        }
        for(Produto p: product){
            System.out.println("Produto: " + p.getCodigo());
        }
        for(Servico s: service){
            System.out.println("Serviço: " + s.getPreco());
        }
    }
}