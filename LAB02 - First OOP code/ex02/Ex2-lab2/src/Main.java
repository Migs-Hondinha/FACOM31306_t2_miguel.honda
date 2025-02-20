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
        c2.setReeleito("Não");
        c2.setGenero('M');
        c2.setPartido(11);

        c3.setNome("ALEX DO NASCIMENTO DE FRANÇA");
        c3.setBens(0);
        c3.setCargo("Vereador");
        c3.setData("28/01/1981");
        c3.setReeleito("Não");
        c3.setGenero('M');
        c3.setPartido(25100);

        System.out.printf("\nNome Completo: %s\nData de Nascimento: %s\nGênero: %c\nTotal de Bens: %.2f\n", c1.getNome(), c1.getData(), c1.getGenero(), c1.getBens());
        System.out.printf("Candidato de Reeleição: %s\nNúmero do Partido: %d\nCargo Pretendido: %s\n", c1.getReeleito(), c1.getPartido(), c1.getCargo());

        System.out.printf("\nNome Completo: %s\nData de Nascimento: %s\nGênero: %c\nTotal de Bens: %.2f\n", c2.getNome(), c2.getData(), c2.getGenero(), c2.getBens());
        System.out.printf("Candidato de Reeleição: %s\nNúmero do Partido: %d\nCargo Pretendido: %s\n", c2.getReeleito(), c2.getPartido(), c2.getCargo());

        System.out.printf("\nNome Completo: %s\nData de Nascimento: %s\nGênero: %c\nTotal de Bens: %.2f\n", c3.getNome(), c3.getData(), c3.getGenero(), c3.getBens());
        System.out.printf("Candidato de Reeleição: %s\nNúmero do Partido: %d\nCargo Pretendido: %s\n", c3.getReeleito(), c3.getPartido(), c3.getCargo());
    }

    //Matricula 12321BCC010 Código 010 Municipio Abadiânia 5200100
}