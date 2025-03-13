public class Vendedor extends Funcionario {
    private int vendas;
    private double comissao, fixo;

    public Vendedor(String nome, String data, double fix, double com, int vend){
        super(nome, data);
        setSalario(fix + (com * (double) vend));
        comissao = com;
        vendas = vend;
        fixo = fix;
    }

    public String toString() {
        return "\nCargo: Vendedor\n" + super.toString() +
                "\nComissão: R$ " + comissao +
                "\nNúmero de vendas: " + vendas +
                "\nSalário cru (não vendeu): R$ " + fixo;
    }
}
