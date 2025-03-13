public class Main {
    public static void main(String[] args) {
        C1 c1SemAtb = new C1();
        System.out.println();
        C2 c2SemAtb = new C2();
        System.out.println();
        C3 c3SemAtb = new C3();

        System.out.println("\nSem super");
        System.out.print(c1SemAtb.mostrar_atributos1() + "\n");
        System.out.print(c2SemAtb.mostrar_atributos2() + "\n");
        System.out.print(c3SemAtb.mostrar_atributos3() + "\n");

        System.out.println("\nCom super");
        System.out.print("Mostrar atributos C1 (com super):\n" + c1SemAtb.mostrar_atributos_super() + "\n");
        System.out.print("\nMostrar atributos C2 (com super):" + c2SemAtb.mostrar_atributos_super() + "\n");
        System.out.print(c3SemAtb.mostrar_atributos_super() + "\n");

        System.out.println("\n");
        C1 c1ComAtb = new C1("Bruno", 80, 60.55);
        System.out.println();
        C2 c2ComAtb = new C2("David", 7, true, c1ComAtb);
        System.out.println();
        C3 c3ComAtb = new C3("FACOM", 0, false, c2ComAtb, c1ComAtb);

        System.out.println("\nSem super");
        System.out.print(c1ComAtb.mostrar_atributos1() + "\n");
        System.out.print(c2ComAtb.mostrar_atributos2() + "\n");
        System.out.print(c3ComAtb.mostrar_atributos3() + "\n");

        System.out.print("\nCom super\n");
        System.out.print("Mostrar atributos C1 (com super):\n" + c1ComAtb.mostrar_atributos_super() + "\n");
        System.out.print("\nMostrar atributos C2 (com super):" + c2ComAtb.mostrar_atributos_super() + "\n");
        System.out.print(c3ComAtb.mostrar_atributos_super() + "\n");
    }
}