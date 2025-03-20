public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[7];

        formas[0] = new Forma();
        formas[1] = new Circulo(5);
        formas[2] = new Quadrado(12.5);
        formas[3] = new Triangulo(5, 8);
        formas[4] = new Esfera(3);
        formas[5] = new Cubo(4.9);
        formas[6] = new Tetraedro(6, 4.9, 5.2);

        for (Forma f: formas){
            System.out.print(f.descricao());

            if (f instanceof FormaBidimensional){
                System.out.println("Área da forma é " + ((FormaBidimensional) f).obterArea());
            }
            else if (f instanceof FormaTridimensional){
                System.out.println("Área da forma é " + ((FormaTridimensional) f).obterArea());
                System.out.println("Volume da forma é " + ((FormaTridimensional) f).obterVolume());
            }
            else System.out.println("Não há dados relacionados a forma");
        }
    }
}