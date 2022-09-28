package fundamentos;

import java.rmi.server.RemoteStub;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Digite a operacao desejada: ");
        String operacao = scan.next();

        System.out.println("+".equals(operacao) ? num1 + num2 : "");
        System.out.println("-".equals(operacao) ? num1 - num2 : "");
        System.out.println("*".equals(operacao) ? num1 * num2 : "");
        System.out.println("/".equals(operacao) ? num1 / num2 : "");
        System.out.println("%".equals(operacao) ? num1 % num2 : "");

        scan.close();
    }
}
