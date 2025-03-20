public class Empresa {
    public static void main(String[] args){
        Funcionario[] fun = new Funcionario[4];
        fun[0] = new Chefe("Gustavo", "24/10/2005", 50000);
        fun[1] = new Vendedor("Tiago", "14/09/2005", 12000, 1200, 13);
        fun[2] = new Operario("Vinicius", "03/07/2006", 2500, 200);
        fun[3] = new Horista("Miguel", "30/09/2004", 162, 100);

        FolhaPagamento folha = new FolhaPagamento(fun);

        folha.aFolha();
    }
}