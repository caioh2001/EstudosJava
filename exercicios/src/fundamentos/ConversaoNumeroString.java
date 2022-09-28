package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer numero = 1000;
        System.out.println(numero.toString());
        System.out.println(numero.toString().length());

        int numero2 = 100000;
        System.out.println(Integer.toString(numero2).length());

        System.out.println(("" + numero2).length());
    }
}
