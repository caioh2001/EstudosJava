package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro salario: ");
        String salario1 = scan.next();

        System.out.println("Digite o segundo salario: ");
        String salario2 = scan.next();

        System.out.println("Digite o terceiro salario: ");
        String salario3 = scan.next();

        double salario1c = Double.parseDouble(salario1.replace(",", "."));
        double salario2c = Double.parseDouble(salario2.replace(",", "."));
        double salario3c = Double.parseDouble(salario3.replace(",", "."));

        System.out.println("Media salarial: " + ((salario1c + salario2c + salario3c) / 3));

        scan.close();
    }
}
