public class Proprietario {
    private String nome, estado, data;
    private Casa casa;

    public Proprietario(String n, String e, String d, Casa c){
        nome = n;
        estado = e;
        data = d;
        casa = c;
    }

    @Override
    public String toString() {
        return "Proprietário: " + nome + "\nEstado atual: " + estado + "\nData de estabelecimento na moradia: " + data + "\n" + casa;
    }
}
