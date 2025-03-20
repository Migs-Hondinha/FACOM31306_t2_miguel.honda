public class FolhaPagamento {
    private Funcionario[] funcionario;

    public FolhaPagamento(Funcionario[] fun){
        funcionario = fun;
    }

    public Funcionario[] getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }

    public void aFolha(){
        System.out.println("\nEmpregados da empresa:");
        for(Funcionario i: funcionario){
            System.out.print(i + "\n");
        }
    }
}
