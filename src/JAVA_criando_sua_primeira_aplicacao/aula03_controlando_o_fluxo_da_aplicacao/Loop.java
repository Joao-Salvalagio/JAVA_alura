package JAVA_criando_sua_primeira_aplicacao.aula03_controlando_o_fluxo_da_aplicacao;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação: ");
            nota = leitor.nextDouble();
            mediaAvaliacao += nota; //+= é equivalente a media + nota
        }

        System.out.println("Média de avaliações: " +  mediaAvaliacao/3);
    }
}
