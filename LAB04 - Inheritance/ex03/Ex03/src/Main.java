public class Main {
    public static void main(String[] args) {
        CandidatoPrefeito candPref = new CandidatoPrefeito("ITAMAR VIEIRA GOMES", "ANDRÉ LUIS ARANTES LIMA", "Não", "29/05/1964", "11", "11", 'M', 60147.57);

        Candidatos candidato = new Candidatos("ALEX DO NASCIMENTO DE FRANÇA", "Não", "28/01/1981", "25", 'M', 0);
        CandidatoVereador candVer2 = new CandidatoVereador("100", "Não declarado", candidato);

        System.out.println();
        System.out.print(candPref);
        System.out.println("\n");
        System.out.print(candVer2);
        System.out.println();
    }
}