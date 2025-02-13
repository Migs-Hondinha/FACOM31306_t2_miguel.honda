public class Main {
    public static void main(String[] args){
        Candidato c1, c2, c3;
        c1 = new Candidato();
        c2 = new Candidato();
        c3 = new Candidato();

        c1.nome = "ITAMAR VIEIRA GOMES";
        c1.data = "29/05/1964";
        c1.genero = 'M';
        c1.bens = 60147.57;
        c1.reeleito = "Não";
        c1.partido = 11;
        c1.cargo = "Prefeito";

        c2.nome = "ANDRÉ LUIS ARANTES LIMA";
        c2.data = "25/02/1979";
        c2.genero = 'M';
        c2.bens = 3127945.12;
        c2.reeleito = "Não";
        c2.partido = 11;
        c2.cargo = "Vive-Prefeito";

        c3.nome = "ALEX DO NASCIMENTO DE FRANÇA";
        c3.data = "28/01/1981";
        c3.genero = 'M';
        c3.bens = 0; //não declarou
        c3.reeleito = "Não";
        c3.partido = 25100;
        c3.cargo = "Vereador";

        c1.imprime();
        c2.imprime();
        c3.imprime();

        //Matricula 12321BCC010 Código 010 Municipio Abadiânia 5200100
    }
}
