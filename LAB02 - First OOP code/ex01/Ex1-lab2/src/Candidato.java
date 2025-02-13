public class Candidato {
    String nome, reeleito, cargo, data;
    int partido;
    char genero;
    double bens;

    void imprime(){
        System.out.printf("\nNome Completo: %s\nData de Nascimento: %s\nGênero: %c\nTotal de Bens: %.2f\n", nome, data, genero, bens);
        System.out.printf("Candidato de Reeleição: %s\nNúmero do Partido: %d\nCargo Pretendido: %s\n", reeleito, partido, cargo);
    }
}