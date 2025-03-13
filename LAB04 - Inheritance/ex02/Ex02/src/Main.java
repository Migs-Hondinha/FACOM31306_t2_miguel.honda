public class Main {
    public static void main(String[] args) {
        CandidatoVereador candVer = new CandidatoVereador("ALEX DO NASCIMENTO DE FRANÇA", "Não", "28/01/1981", "25", "100", "Não declarado", 'M', 0);
        CandidatoPrefeito candPref = new CandidatoPrefeito("ITAMAR VIEIRA GOMES", "ANDRÉ LUIS ARANTES LIMA", "Não", "29/05/1964", "11", "11", 'M', 60147.57);

        System.out.println();
        System.out.print(candPref);
        System.out.println("\n");
        System.out.print(candVer);
        System.out.println();
    }
}