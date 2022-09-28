package fundamentos;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(2 + 3);

        var x = 456.78;
        double y = 22.8;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (double) b);
        System.out.println(a / (float) b);


        System.out.println(8 % 3);
        System.out.println(a % b);

        System.out.println(x + y - a * b);
    }
}
