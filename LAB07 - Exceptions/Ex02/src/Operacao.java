public class Operacao {
    public Operacao(){}

    public void iniciarOperacao(int numerador, int denomidador){
        System.out.println("Numerador: " + numerador + "\nDenominador: " + denomidador);
        try {
            float resul;
            resul = calcular(numerador,denomidador);
            System.out.println("Resultado: " + resul);
        } catch (DivisaoPorZeroException e){
            System.out.println(e);
        }
    }

    private float calcular (int numerador, int denomidador) throws DivisaoPorZeroException {
        return dividir(numerador, denomidador);
    }

    private float dividir(int numerador, int denominador) throws DivisaoPorZeroException {
        if (denominador == 0){
            throw new DivisaoPorZeroException("Não é possível dividir por zero");
        }
        return (float) numerador/denominador;
    }


}
