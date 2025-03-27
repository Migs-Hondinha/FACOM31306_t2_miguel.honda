public class ContaComum extends ContaCorrente{
    private float limite;

    public ContaComum(float valor, int num, int pwd){
        super(valor, num, pwd);
        limite = 0;
    }

    public ContaComum(float valor, int num, int pwd, float lim){
        super(valor, num, pwd);
        limite = lim;
    }

    public String imprime(int pwd){
        if (isSenha(pwd)) {
            return "Conta normal" +
                    super.imprime(pwd);
        }
        else {
            return super.imprime(pwd);
        }
    }
}
