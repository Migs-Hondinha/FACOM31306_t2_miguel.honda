public class C3 extends C2 {
    public String faculdadePertencente; //sala da facom, da fagen ou de outra faculdade
    private int numAlunosEsp;
    protected boolean arLigado;

    public C3(){
        super();
        faculdadePertencente = "Não decidido";
        numAlunosEsp = 0;
        arLigado = false;
        System.out.println("Classe C3: chamada do construtor padrão (sem parâmetros)");
    }
    public C3(String pertence, int esp, boolean ar, C2 sala, C1 aux){
        super(sala.nomeMonitor, sala.getNumEletronicos(), sala.projetorLigado, aux);
        faculdadePertencente = pertence;
        numAlunosEsp = esp;
        arLigado = ar;
        System.out.println("Classe C3: chamada do construtor com parâmetros");
    }

    public int getNumAlunosEsp() {
        return numAlunosEsp;
    }
    public void setNumAlunosEsp(int esp) {
        numAlunosEsp = esp;
    }

    public String mostrar_atributos3(){
        return "\nMostrar atributos C3 (sem super):\n" +
                "Nome do professor: " + nomeProfessor +
                "\nQuantidade de carteiras: " + getNumCarteiras() +
                "\nMedia do CRA da turma: " + mediaCRA +
                "\nNome do monitor: " + nomeMonitor +
                "\nQuantidade de Eletrônicos: " + getNumEletronicos() +
                "\nProjetor está ligado: " + projetorLigado +
                "\nFaculdade que a sala pertence: " + faculdadePertencente +
                "\nQuantidade de alunos especiais: " + numAlunosEsp +
                "\nAr condicionado está ligado: " + arLigado;
    }
    public String mostrar_atributos_super(){
        return "\nMostrar atributos C3 (com super):" + super.mostrar_atributos_super() +
                "\nFaculdade que a sala pertence: " + faculdadePertencente +
                "\nQuantidade de alunos especiais: " + numAlunosEsp +
                "\nAr condicionado está ligado: " + arLigado;
    }
}
