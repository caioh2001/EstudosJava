package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Ola pessoal!".charAt(0));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarde")); //ignora as letras maiusculas
        System.out.println(s.equals("boa tarde"));

        var nome = "Caio";
        var sobrenome = "Bento";
        var idade = 33;
        var salario = 15698.75;

        String maisUmaFrase = "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario;
        System.out.println(maisUmaFrase);

        System.out.printf("O sr. %s %s tem %d anos de idade e ganha %.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("O sr. %s %s tem %d anos de idade e ganha %.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6,8));
    }
}
