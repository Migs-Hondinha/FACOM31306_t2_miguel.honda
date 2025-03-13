public class CamaroteSuperior extends VIP{
    private double adicionalExtra;
    private String localizacao;

    public CamaroteSuperior(VIP vip, Ingresso ing, String local, double extra){
        super(ing, (vip.adicional + extra));
        adicionalExtra = extra;
        localizacao = local;
    }

    public double getAdicionalExtra() {
        return adicionalExtra;
    }
    public void setAdicionalExtra(double adicionalExtra) {
        this.adicionalExtra = adicionalExtra;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void escreveTudo(){
        escreveValorTipo();
        System.out.println("Localização do Camarote Superior: " + localizacao);
    }
}
