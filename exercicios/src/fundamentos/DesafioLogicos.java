package fundamentos;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = false;
        boolean tomamosSorvete = false;
        boolean eSaudavel = true;

        if(trabalho1 && trabalho2){
            System.out.println("Compramos uma televisão de 50 polegadas");
            System.out.println("Tomamos sorvete: " + !tomamosSorvete);
            System.out.println("Está saudavel ? " + !eSaudavel);
        }
        else{
            if(trabalho1 ^ trabalho2){
                System.out.println("Compramos uma televisão de 32 polegadas");
                System.out.println("Tomamos sorvete: " + !tomamosSorvete);
                System.out.println("Está saudavel ? " + !eSaudavel);

            }
            else{
                System.out.println("Ficamos em casa e não tomamos sorvete");
                System.out.println("Tomamos sorvete: " + tomamosSorvete);
                System.out.println("Está saudavel ? " + eSaudavel);
            }
        }
    }
}
