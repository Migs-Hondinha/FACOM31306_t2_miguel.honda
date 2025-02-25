public class Main {
    public static void main(String[] args) {
        Candidatos[] c = new Candidatos[3];

        c[0] = new Candidatos("ITAMAR VIEIRA GOMES", "Não", "Prefeito", "29/05/1964", 11, 'M', 60147.57);
        c[1] = new Candidatos("ANDRÉ LUIS ARANTES LIMA", "Não", "Vice-Prefeito", "25/02/1979", 11, 'M', 3127945.12);
        c[2] = new Candidatos("ALEX DO NASCIMENTO DE FRANÇA", "Não", "Vereador", "28/01/1981", 25100, 'M',0);

        for (Candidatos i: c){
            System.out.printf("\nNome Completo: %s\nData de Nascimento: %s\nGênero: %c\nTotal de Bens: %.2f\n", i.getNome(), i.getData(), i.getGenero(), i.getBens());
            System.out.printf("Candidato de Reeleição: %s\nNúmero do Partido: %d\nCargo Pretendido: %s\n", i.getReeleito(), i.getPartido(), i.getCargo());
        }
    }
}
//Matricula 12321BCC010 Código 010 Municipio Abadiânia 5200100