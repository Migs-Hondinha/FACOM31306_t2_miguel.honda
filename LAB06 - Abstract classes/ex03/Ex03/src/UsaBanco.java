public class UsaBanco {
    private ContaEspecial[] contas;
    private int indice = -1;

    public UsaBanco(ContaCorrente[] user){
        contas = (ContaEspecial[]) user;
    }

    public void achaConta(int num, int senha){
        int aux = 0;
        for (ContaEspecial c: contas){
            if (c.getNumConta() == num){
                if(c.isSenha(senha)){
                    indice = aux;
                    break;
                }
            }
            else aux++;
        }
    }

    public boolean depositar(int num, int senha, float valor){
        if (contas[indice].getNumConta() != num) return false;
        return contas[indice].debitaValor(valor, senha);
    }

    public void creditar(int numero, int senha, float valor){
        contas[indice].creditaValor(senha, valor);
    }

    public void imprimeConta(int senha){
        System.out.println(contas[indice].imprime(senha));
    }

    public int getIndice() {
        return indice;
    }
}
