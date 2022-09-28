package fundamentos;

public class Unarios {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;

        a++; // a = a + 1;
        a--; // b = b - 1;

        ++b; // a = a + 1;
        --b; // b = b - 1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Desafio... ");
        System.out.println(++a == b--); // quando o operador vem antes a operação tem prioridade

        System.out.println(a);
        System.out.println(b);
    }
}
