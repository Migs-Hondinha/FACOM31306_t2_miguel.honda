public class Candidatos {
    private String nome, reeleito, cargo, data;
    private int partido;
    private char genero;
    private double bens;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReeleito() {
        return reeleito;
    }
    public void setReeleito(String reeleito) {
        this.reeleito = reeleito;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public int getPartido() {
        return partido;
    }
    public void setPartido(int partido) {
        this.partido = partido;
    }

    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getBens() {
        return bens;
    }
    public void setBens(double bens) {
        this.bens = bens;
    }
}
