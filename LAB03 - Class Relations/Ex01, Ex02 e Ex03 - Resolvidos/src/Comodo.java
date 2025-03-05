import java.util.Arrays;

public class Comodo {
    private String tipoComodo;
    private Mobilha[] mobilha;

    public Comodo(String tc, Mobilha[] m){
        mobilha = m;
        tipoComodo = tc;
    }

    public String toString(){
        return "\nComodo: " + tipoComodo + "\n" + Arrays.toString(mobilha).replace("[", "").replace("]", "").replace(",", "");
    }
}
