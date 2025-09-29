package JAVA_criando_sua_primeira_aplicacao.aula03_controlando_o_fluxo_da_aplicacao;

import java.util.Scanner;

public class OutraFormaDeLoop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Digite sua avaliação ou -1 para sair: ");
            nota = leitor.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota; //+= é equivalente a media + nota
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliações: " +  mediaAvaliacao/totalDeNotas);
        System.out.println("Total de notas adicionadas: " + totalDeNotas);
    }
}
