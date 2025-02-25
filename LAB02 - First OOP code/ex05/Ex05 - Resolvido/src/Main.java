public class Main {
    public static void main(String[] args) {
        Candidatos[] c1 = new Candidatos[3];
        Candidatos[] c2 = new Candidatos[3];
        Eleicao[] e = new Eleicao[2];

        c1[0] = new Candidatos("ITAMAR VIEIRA GOMES", "Não", "Prefeito", "29/05/1964", 11, 'M', 60147.57);
        c1[1] = new Candidatos("ANDRÉ LUIS ARANTES LIMA", "Não", "Vice-Prefeito", "25/02/1979", 11, 'M', 3127945.12);
        c1[2] = new Candidatos("ALEX DO NASCIMENTO DE FRANÇA", "Não", "Vereador", "28/01/1981", 25100, 'M',0);
        e[0] = new Eleicao("Abadiânia", 10542, c1);

        c2[0] = new Candidatos("NAYARA EMMANUELA BATISTA FEITOSA", "Não", "Prefeito", "30/08/1996", 11, 'F', 22954.30);
        c2[1] = new Candidatos("MACIEL DA SILVA", "Não", "Vice-Prefeito", "01/05/1983", 12, 'M', 8000.00);
        c2[2] = new Candidatos("MARIA DA CONCEIÇÃO SIQUEIRA DOS SANTOS DA CRUZ", "Não", "Vereador", "30/11/1979", 11567, 'F', 0); // 0 = não declarou bens
        e[1] = new Eleicao("Água Branca", 11825, c2);

        for (Eleicao i: e){
            System.out.println("\nMunicipio:" + i.getMunicipio() + "  " + "Votantes:" + i.getVotantes() + "\n");
            for (Candidatos j: i.getCandidatos()){
                System.out.printf("Nome Completo: %s\nData de Nascimento: %s\nGênero: %c\nTotal de Bens: %.2f\n", j.getNome(), j.getData(), j.getGenero(), j.getBens());
                System.out.printf("Candidato de Reeleição: %s\nNúmero do Partido: %d\nCargo Pretendido: %s\n\n", j.getReeleito(), j.getPartido(), j.getCargo());
            }
            System.out.printf("--------------------------------------------------------------------\n");
        }
    }
}

//Matricula 12321BCC010 Código 010 Municipio Abadiânia 5200100
//Municipio Água Branca 2700102