package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
            double a = 4.5;
            System.out.println(a);

            var b = 4.5;
            System.out.println(b);

            var c = "Texto";
            System.out.println(c);

            c = "Outro texto";
            System.out.println(c);

            double d;
            d = 146.56;
            System.out.println(d);

            var e = 789.56; // var precisa ser inicializado sempre que for instanciado
            System.err.println(e);
    }
}
