public class C1 {
    public String nomeProfessor;
    private int numCarteiras;
    protected double mediaCRA;

    public C1(){
        nomeProfessor = "Professor não escolhido";
        numCarteiras = 0;
        mediaCRA = 0;
        System.out.println("Classe C1: chamada do construtor padrão (sem parâmetros)");
    }
    public C1(String nome, int cart, double media){
        nomeProfessor = nome;
        numCarteiras = cart;
        mediaCRA = media;
        System.out.println("Classe C1: chamada do construtor com parâmetros");
    }

    public int getNumCarteiras(){
        return numCarteiras;
    }
    public void setNumCarteiras(int numCarteiras) {
        this.numCarteiras = numCarteiras;
    }

    public String mostrar_atributos1(){
        return "Mostrar atributos C1 (sem super):\n" +
                "Nome do professor: " + nomeProfessor +
                "\nNúmero de carteiras: " + numCarteiras +
                "\nMedia do CRA da turma: " + mediaCRA;
    }
    public String mostrar_atributos_super(){
        return
                "Nome do professor: " + nomeProfessor +
                "\nNúmero de carteiras: " + numCarteiras +
                "\nMedia do CRA da turma: " + mediaCRA;
    }
}

//Ci são classes de aula diferentes (i = 1, 2, 3)