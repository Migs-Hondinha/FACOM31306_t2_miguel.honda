public class C2 extends C1 {
    public String nomeMonitor;
    private int numEletronicos;
    protected boolean projetorLigado;

    public C2(){
        super();
        nomeMonitor = "Não há monitor";
        numEletronicos = 0;
        projetorLigado = false;
        System.out.println("Classe C2: chamada do construtor padrão (sem parâmetros)");
    }
    public C2(String monitor, int elet, boolean proj, C1 classe){
        super(classe.nomeProfessor, classe.getNumCarteiras(), classe.mediaCRA);
        nomeMonitor = monitor;
        numEletronicos = elet;
        projetorLigado = proj;
        System.out.println("Classe C2: chamada do construtor com parâmetros");
    }

    public int getNumEletronicos(){
        return numEletronicos;
    }
    public void setNumEletronicos(int numEletronicos) {
        this.numEletronicos = numEletronicos;
    }

    public String mostrar_atributos2(){
        return "\nMostrar atributos C2 (sem super):\n" +
                "Nome do professor: " + nomeProfessor +
                "\nNúmero de carteiras: " + getNumCarteiras() +
                "\nMedia do CRA da turma: " + mediaCRA +
                "\nNome do monitor: " + nomeMonitor +
                "\nQuantidade de Eletrônicos: " + numEletronicos +
                "\nProjetor está ligado: " + projetorLigado;
    }
    public String mostrar_atributos_super(){
        return "\n" + super.mostrar_atributos_super() +
                "\nNome do monitor: " + nomeMonitor +
                "\nQuantidade de Eletrônicos: " + numEletronicos +
                "\nProjetor está ligado: " + projetorLigado;
    }
}
