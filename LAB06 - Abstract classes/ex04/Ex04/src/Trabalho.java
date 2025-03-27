public class Trabalho extends Contato{
    private String tipo, fonte;

    public Trabalho(String ap, String no, String em, String ani, String tp){
        super(ap, no, em, ani);
        tipo = tp.toLowerCase();
        fonte = "Trabalho";
    }

    public String getFonte(){
        return fonte;
    }

    public String getTipo(){
        return tipo;
    }

    public String imprimirContato(){
        return "\nTipo: " + tipo + super.imprimirContato();
    }
}
