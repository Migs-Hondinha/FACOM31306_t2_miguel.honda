public class Operario extends Funcionario {
    private double valorProd;
    private int qtdProd;

    public Operario(String nome, String data, double valor, int qtd){
        super(nome, data);
        setSalario(valor * (double) qtd);
        valorProd = valor;
        qtdProd = qtd;
    }

    public String toString() {
        return "\nCargo: Operario\n" + super.toString() +
                "\nValor da produção: R$ " + valorProd +
                "\nQuantos produtos foram produzidos: " + qtdProd;
    }
}
