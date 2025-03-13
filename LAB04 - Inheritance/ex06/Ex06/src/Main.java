public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(45.00);
        Normal ingNormal = new Normal(ingresso);
        VIP ingVIP = new VIP(ingresso, 945.00);
        CamaroteInferior camInf = new CamaroteInferior(ingVIP, ingresso, "Setor A-10");
        CamaroteSuperior camSup = new CamaroteSuperior(ingVIP, ingresso, "Setor B-15", 2000.00); //camarote da brahma na festa do peão

        ingresso.escreveValor();
        System.out.println("\n");
        ingNormal.escreveValorTipo();
        System.out.println("\n");
        ingVIP.escreveValorTipo();
        System.out.println();
        camInf.escreveTudo();
        System.out.println();
        camSup.escreveTudo();
    }
}

//eu saio de Barretos mas Barretos não sai de mim