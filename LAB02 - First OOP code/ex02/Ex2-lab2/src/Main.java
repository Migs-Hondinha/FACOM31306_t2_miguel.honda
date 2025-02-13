public class Main {
    public static void main(String[] args){

        Candidatos c1, c2, c3;
        c1 = new Candidatos();
        c2 = new Candidatos();
        c3 = new Candidatos();

        c1.setNome("ITAMAR VIEIRA GOMES");
        c1.setBens(60147.57);
        c1.setCargo("Prefeito");
        c1.setData("29/05/1964");
        c1.setReeleito("Não");
        c1.setGenero('M');
        c1.setPartido(11);

        c2.setNome("ANDRÉ LUIS ARANTES LIMA");
        c2.setBens(3127945.12);
        c2.setCargo("Vice-Prefeito");
        c2.setData("25/02/1979");
        c2.setReeleito("25/02/1979");
        c2.setGenero('M');
        c2.setPartido(11);

        c3.setNome("ALEX DO NASCIMENTO DE FRANÇA");
        c3.setBens(0);
        c3.setCargo("Vereador");
        c3.setData("28/01/1981");
        c3.setReeleito("Não");
        c3.setGenero('M');
        c3.setPartido(25100);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }

    //Matricula 12321BCC010 Código 010 Municipio Abadiânia 5200100
}