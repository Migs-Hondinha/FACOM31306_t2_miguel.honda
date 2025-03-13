public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior(VIP vip, Ingresso ing, String local){
        super(ing, vip.adicional);
        localizacao = local;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void escreveTudo(){
        escreveValorTipo();
        System.out.println("Localização do Camarote Inferior: " + localizacao);
    }
}
