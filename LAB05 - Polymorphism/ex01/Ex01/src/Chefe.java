public class Chefe extends Funcionario {
    public Chefe(String nome, String data, double salario){
        super(nome, data);
        setSalario(salario);
    }

    public String toString() {
        return "\nCargo: Chefe\n" + super.toString();
    }
}
