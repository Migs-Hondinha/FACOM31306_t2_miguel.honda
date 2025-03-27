public class Dueto {
    private Musico mus1, mus2, sub;
    private String nomeD;

    public Dueto (Musico m1, Musico m2, Musico s, String nD){
        mus1 = m1;
        mus2 = m2;
        sub = s;
        nomeD = nD;
    }

    public Dueto (Musico m1, Musico m2, String nD){
        mus1 = m1;
        mus2 = m2;
        nomeD = nD;
    }

    public Musico getMus1() {
        return mus1;
    }

    public void setMus1(Musico mus1) {
        this.mus1 = mus1;
    }

    public Musico getMus2() {
        return mus2;
    }

    public void setMus2(Musico mus2) {
        this.mus2 = mus2;
    }

    public Musico getSub() {
        return sub;
    }

    public void setSub(Musico sub) {
        this.sub = sub;
    }

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public double remumMedia(){
        if (sub == null) {
            return ((mus1.getRemun() + mus2.getRemun())/2);
        }
        else {
            return ((mus1.getRemun() + mus2.getRemun() + sub.getRemun())/3);
        }
    }

    public String toString() {
        if(sub == null) {
            return "\nDueto " + nomeD +
                    mus1 + mus2;
        }
        else {
            return "\nDueto " + nomeD +
                    mus1 + mus2 + sub;
        }
    }
}
