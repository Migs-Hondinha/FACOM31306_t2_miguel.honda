public class Funcionario {
    private double salario, teto;
    private String nome, cpf;

    public Funcionario(String nm, String dados, double sal){
        nome = nm;
        cpf = dados;
        salario = sal;
        teto = 40000.0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTeto() {
        return teto;
    }

    public void setTeto(double teto) {
        this.teto = teto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void aumentarSalario(double porcento){
        double aux;
        aux = (porcento/100) * salario;

        if(aux < 0){
            throw new IllegalArgumentException("Valor inválido de salário");
        }
        else if(aux+salario > teto){
            throw new IllegalArgumentException("Valor ultrapassa o teto");
        }
        else {
            salario += aux;
        }
    }

    public String toString() {
        return nome + "\n" + cpf +
                "\n" + salario + "\n";
    }
}
