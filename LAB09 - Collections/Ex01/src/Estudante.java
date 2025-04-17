import java.awt.*;

public abstract class Estudante implements Comparable<Estudante>{
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco)  {
        this.nome = nome;
        this.endereco = endereco;
    }

    public abstract double calc_cr(boolean incluiReprovacao) throws Exception;

    public void print() {
        System.out.println();
        System.out.println("Estudante{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}');
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //critério de comparação é ordem alfabética dos nomes
    public int compareTo(Estudante outro){
        if (this.nome.compareTo(outro.nome) < 0) return -1;
        else if(this.nome.compareTo(outro.nome) > 0) return 1;
        else return 0;
    }
}
