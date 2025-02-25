public class Main {
    public static void main(String[] args) {
        Candidatos[] c = new Candidatos[5];
        Candidatos rico = null;
        Eleicao e;
        double maiorBens, soma;
        maiorBens = soma = 0;

        c[0] = new Candidatos("NAYARA EMMANUELA BATISTA FEITOSA", "Não", "Prefeito", "30/08/1996", 11, 'F', 22954.30);
        c[3] = new Candidatos("MACIEL DA SILVA", "Não", "Vice-Prefeito", "01/05/1983", 12, 'M', 8000.00);
        c[2] = new Candidatos("RICARDO DE LIMA", "Não", "Prefeito", "19/11/1984", 12, 'M',  257627.25);
        c[1] = new Candidatos("JOSÉ HORLANDO DA SILVA SANTOS", "Não", "Vice-Prefeito", "19/03/1988", 11, 'M', 360562.00);
        c[4] = new Candidatos("ADENILSON DE ARAÚJO DE SOUZA", "Sim", "Vereador", "16/12/1990", 40999, 'M',  32000.00);
        e = new Eleicao("Água Branca", 11825, c);

        System.out.println("\nMunicipio:" + e.getMunicipio() + "  " + "Votantes:" + e.getVotantes() + "\n");
        for (Candidatos j: e.getCandidatos()){
            System.out.printf("Nome Completo: %s\nData de Nascimento: %s\nGênero: %c\nTotal de Bens: %.2f\n", j.getNome(), j.getData(), j.getGenero(), j.getBens());
            System.out.printf("Candidato de Reeleição: %s\nNúmero do Partido: %d\nCargo Pretendido: %s\n\n", j.getReeleito(), j.getPartido(), j.getCargo());
        }
        System.out.println("-------------------------------------------------------\n");

        for (Candidatos i: e.getCandidatos()){
            if (i.getBens() > maiorBens) {
                maiorBens = i.getBens();
                rico = i;
            }
        }
        System.out.printf("Candidato com a maior quantidade de bens (R$ %.2f): \n\n", maiorBens);
        System.out.printf("Nome Completo: %s\nData de Nascimento: %s\nGênero: %c\nTotal de Bens: %.2f\n", rico.getNome(), rico.getData(), rico.getGenero(), rico.getBens());
        System.out.printf("Candidato de Reeleição: %s\nNúmero do Partido: %d\nCargo Pretendido: %s\n\n", rico.getReeleito(), rico.getPartido(), rico.getCargo());

        for (Candidatos i: e.getCandidatos()){
            if (rico.getBens() != i.getBens()){
                System.out.printf("A relação de bens do Candidato %s com o Candidato %s é de (aproximadamente): %.2f", rico.getNome(), i.getNome(), 100*(rico.getBens()/i.getBens()));
                System.out.println("%\n");
                soma += i.getBens();
            }
        }
        System.out.printf("A relação de bens do Candidato %s com Todos os Candidatos (incluindo este) é de (aproximadamente): %.2f", rico.getNome(), 100*(rico.getBens()/(soma+maiorBens)));
        System.out.println("%\n");
        System.out.printf("A relação de bens do Candidato %s com Todos os Candidatos (excluindo este) é de (aproximadamente): %.2f", rico.getNome(), 100*(rico.getBens()/soma));
        System.out.println("%\n");

    }
}
//Matricula 12321BCC010 Código 010 Municipio Água Branca 2700102