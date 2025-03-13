public class Horista extends Funcionario {
    private double horas, valorHora;

    public Horista(String nome, String data, double h, double valor){
        super(nome, data);
        setSalario(h * valor);
        horas = h;
        valorHora = valor;
    }

    public String toString() {
        return "\nCargo: Horista\n" + super.toString() +
                "\nValor por hora: R$ " + valorHora +
                "\nHoras trabalhadas: " + horas + " horas";
    }
}
