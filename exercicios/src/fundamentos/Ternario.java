package fundamentos;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;
        String recuperacao = media >= 5 ? "em recuperação" : "reprovado";

        String resultado = media >= 7 ? "aprovado" : recuperacao;

        System.out.println("O aluno está " + resultado);

        double nota = 7.1;
        boolean bomComportamento = false;
        boolean passouPorNota = nota > 7.0;

        boolean temDesconto = bomComportamento && passouPorNota;
        String desconto = temDesconto ? "Sim" : "Não";

        System.out.println("Tem desconto? " + desconto);
    }
    
}
