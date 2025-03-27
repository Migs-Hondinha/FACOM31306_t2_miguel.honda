public class Familia extends Contato{
    private String parentesco, tipo;

    public Familia(String ap, String no, String em, String ani, String parent){
        super(ap, no, em, ani);
        parentesco = parent.toLowerCase();
        tipo = "Família";
    }

    public String getTipo(){
        return tipo;
    }

    public String getParentesco(){
        return parentesco;
    }

    public String imprimirContato() {
        return "\nParentesco: " + parentesco + super.imprimirContato();
    }
}
