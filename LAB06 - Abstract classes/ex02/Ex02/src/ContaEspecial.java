public class ContaEspecial extends ContaCorrente{
    private float limite; //limite que a conta pode gastar

    public ContaEspecial(float valor, int num, int pwd, float lim){
        super(valor, num, pwd);
        limite = lim;
    }

    public float getLimite(int pwd) {
        if (isSenha(pwd)) return limite;
        else return -1;
    }

    public boolean debitaValor(float val, int pwd) {
        if (!isSenha(pwd)) return false;
        if (val <= 0) return false;
        if (val > (getSaldo(pwd) + limite)) return false;

        float aux;
        aux = getSaldo(pwd);
        aux -= val;
        setSaldo(aux, pwd);

        if (getSaldo(pwd) < 0){
            limite += getSaldo(pwd);
            setSaldo(0, pwd);
        }
        return true;
    }

    public String imprime(int pwd){
        if (isSenha(pwd)){return "Conta especial" + super.imprime(pwd) +
                "\nSaldo limite: " + limite; }
        else return super.imprime(pwd);
    }
}
