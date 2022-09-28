package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.toUpperCase();
        s = s.replace("X", "Senhora");
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Esta aqui".toUpperCase();
        System.out.println(x);

        System.out.println("Caio".toUpperCase());

        String y = "Bom dia X".replace("X", "Caio")
                              .toUpperCase()
                              .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem operador "."
    }
}
