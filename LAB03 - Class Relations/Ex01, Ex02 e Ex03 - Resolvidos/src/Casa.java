import java.util.Arrays;

public class Casa {
    private String endereco;
    private Comodo[] comodo;

    public Casa(String e, Comodo[] com){
        comodo = com;
        endereco = e;
    }

    public String toString(){
        return "Endereço: " + endereco + "\n" + Arrays.toString(comodo).replace("[", "").replace("]", "").replace("", "");
    }
}
