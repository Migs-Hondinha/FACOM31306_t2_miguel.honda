public class Main {
    public static void main(String[] args) {
        Candidatos[] c = new Candidatos[3];

        c[0] = new Candidatos();
        c[0].setNome("ITAMAR VIEIRA GOMES");
        c[0].setBens(60147.57);
        c[0].setCargo("Prefeito");
        c[0].setData("29/05/1964");
        c[0].setReeleito("Não");
        c[0].setGenero('M');
        c[0].setPartido(11);

        c[1] = new Candidatos();
        c[1].setNome("ANDRÉ LUIS ARANTES LIMA");
        c[1].setBens(3127945.12);
        c[1].setCargo("Vice-Prefeito");
        c[1].setData("25/02/1979");
        c[1].setReeleito("Não");
        c[1].setGenero('M');
        c[1].setPartido(11);

        c[2] = new Candidatos();
        c[2].setNome("ALEX DO NASCIMENTO DE FRANÇA");
        c[2].setBens(0);
        c[2].setCargo("Vereador");
        c[2].setData("28/01/1981");
        c[2].setReeleito("Não");
        c[2].setGenero('M');
        c[2].setPartido(25100);

        for (Candidatos i: c){
            System.out.printf("\nNome Completo: %s\nData de Nascimento: %s\nGênero: %c\nTotal de Bens: %.2f\n", i.getNome(), i.getData(), i.getGenero(), i.getBens());
            System.out.printf("Candidato de Reeleição: %s\nNúmero do Partido: %d\nCargo Pretendido: %s\n", i.getReeleito(), i.getPartido(), i.getCargo());
        }
    }
}
//Matricula 12321BCC010 Código 010 Municipio Abadiânia 5200100