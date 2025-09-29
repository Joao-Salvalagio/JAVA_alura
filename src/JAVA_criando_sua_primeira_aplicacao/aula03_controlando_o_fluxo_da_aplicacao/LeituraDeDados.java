package JAVA_criando_sua_primeira_aplicacao.aula03_controlando_o_fluxo_da_aplicacao;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitor.nextLine();
        System.out.println("Filme digitado: " + filme + "\n");
        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitor.nextInt();
        System.out.println("Ano de lançamento digitado: " +  anoDeLancamento + "\n");
        System.out.println("Digite sua avaliação: ");
        double avaliacao = leitor.nextDouble();
        System.out.println("Avaliação digitada foi: " +  avaliacao + "\n");

        leitor.close();
    }
}
