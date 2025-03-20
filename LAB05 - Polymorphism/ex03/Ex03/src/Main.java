public class Main {
    public static void main(String[] args) {
        int max = 6;
        if (max > 100){
            System.out.println("\nNúmero de alunos proposto excede a capacidade máxima, alternado para capacidade máxima...\n");
            max = 100;
        }

        Estudante[] e = new Estudante[max];

        e[0] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        e[1] = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        e[2] = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
        e[3] = new EstudanteDoutorado("Carlos","Rua Alecrim",
                "Educação Física","Formação de Músculo","Como o judo afeta a formação dos músculos");
        e[4] = new EstudanteDoutorado("Jose","Rua Falbo",
                "Arquitetura","Composição do Terreno","Análise de terreno X Materiais usados");
        e[5] = new EstudanteGraduacao("Elias", "Rua Colombo", "Cuidados paliativos");

        Universidade uni = new Universidade("UFU", "14 de agosto de 1969", e, max);
        System.out.println();

        uni.contador();
        uni.imprime();
        System.out.println("\n");


        EstudantePosGrad[] estPG;

        int count = 0;
        for (Estudante est: e){
            if (est instanceof EstudantePosGrad) count++;
        }
        estPG = new EstudantePosGrad[count];

        int aux = 0;
        for (Estudante est: e){
            if (est instanceof EstudantePosGrad){
                estPG[aux] = (EstudantePosGrad) est;
                aux++;
            }
        }

        System.out.println("\nImprimindo Estudandes de Pós-Graduação...");
        for (EstudantePosGrad est: estPG){
            if (est instanceof EstudanteMestrado) est.print();
            else if (est instanceof EstudanteDoutorado) est.print();
        }


        //true = 1 linha / false = multiplas linhas
        System.out.println("\n\nImprimindo Estudantes com print(bool)...");
        for (Estudante est: e){
            /* if (est instanceof EstudanteGraduacao) {
                ((EstudanteGraduacao) est).print(true);
                ((EstudanteGraduacao) est).print(false);
            }
            else if (est instanceof EstudanteMestrado) {
                ((EstudanteMestrado) est).print(true);
                ((EstudanteMestrado) est).print(false);
            }
            else if (est instanceof EstudanteDoutorado){
                ((EstudanteDoutorado) est).print(true);
                ((EstudanteDoutorado) est).print(false);
            } */

            est.print(true);
            est.print(false);
        }
    }
}

//Respondendo (e): Não, pois não ocorre ligação dinâmica, o que impede a sobrescrita da função print(bool).