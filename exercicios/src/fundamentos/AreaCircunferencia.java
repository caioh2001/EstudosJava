package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;    // <= final para definir a variavel como constante, constantes sao escritas com letra maiuscula

        double area = PI * raio * raio;

        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = " + area + "m2.");
    }
}
