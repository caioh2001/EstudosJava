package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (F - 32) * 5/9 = C

        double celsius;
        double fahrenheit = 86;

        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0;
        
        celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println(fahrenheit + " graus fahrenheit são " + celsius + " graus celsius.");

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;

        // shift + alt + seta copia a linha do cursor

        System.out.println(fahrenheit + " graus fahrenheit são " + celsius + " graus celsius.");
    }
}
