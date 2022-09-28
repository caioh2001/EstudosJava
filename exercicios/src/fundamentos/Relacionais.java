package fundamentos;

public class Relacionais {
    public static void main(String[] args) {
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 4);
        System.out.println(3 >= 4);
        System.out.println(3 != 4);
    
        double nota = 7.1;
        boolean bomComportamento = true;
        boolean passouPorNota = nota > 7.0;

        boolean temDesconto = bomComportamento && passouPorNota;

        System.out.println("Tem desconto? " + temDesconto);
    }
}
