public class Amigos extends Contato{
    private int grau;
    private String tipo;

    public Amigos(String ap, String no, String em, String ani, int gr){
        super(ap, no, em, ani);
        grau = gr;
        tipo = "Amigo";
    }

    public String getTipo(){
        return tipo;
    }

    public int getGrau(){
        return grau;
    }

    public String imprimirContato() {
        if (grau == 1){
            return "\nGrau de Amizade: " + "1 (melhor amigo)" + super.imprimirContato();
        }
        else if (grau == 2){
            return "\nGrau de Amizade: " + "2 (amigo)" + super.imprimirContato();
        }
        else if (grau == 3){
            return "\nGrau de Amizade: " + "3 (conhecido)" + super.imprimirContato();
        }
        else return "\nGrau de Amizade inválido" + super.imprimirContato();
    }
}
