public class Funcionario {
    private String nome, dataNascimento;
    private double salario;

    public Funcionario (String nm, String data){
        nome = nm;
        dataNascimento = data;
    }
    public void setSalario(double sal){
        salario = sal;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString(){
        return "Nome: " + nome +
                "\nData de nascimento: " + dataNascimento +
                "\nSalário: R$ " + salario;
    }
}
