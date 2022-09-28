package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        
        System.out.print("Bom");
        System.out.print(" dia! \n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d \n", 1, 2, 3, 4, 5);

        System.out.printf("Salario: %.1f%n", 1445.4896);

        System.out.printf("Nome: %s%n", "Caio");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scan.nextLine(); 

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Seu nome é: " + nome + " " + sobrenome + " e tem " + idade + " anos.");

        scan.close();
    }
}
