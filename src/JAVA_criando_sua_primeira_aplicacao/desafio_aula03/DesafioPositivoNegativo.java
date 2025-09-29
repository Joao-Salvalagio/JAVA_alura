package JAVA_criando_sua_primeira_aplicacao.desafio_aula03;

import java.util.Scanner;

public class DesafioPositivoNegativo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Número positivo");
            } else {
                System.out.println("Número negativo");
            }
        }
}

