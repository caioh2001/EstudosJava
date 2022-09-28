package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informacoes do funcionario

        // Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 543;
        int id = 45869;
        long pontosAcumulados = 3_526_785_785L;

        // Tipos numericos reais
        float salario = 11_455.44F;
        double vendasAcumuladas = 2_991_785_145.05;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);

        System.out.println("Ferias? " + estaDeFerias);

        System.out.println("Status: " + status);
    }
}
