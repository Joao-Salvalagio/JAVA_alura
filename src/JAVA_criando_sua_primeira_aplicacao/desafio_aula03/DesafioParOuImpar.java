package JAVA_criando_sua_primeira_aplicacao.desafio_aula03;
import java.util.Scanner;
public class DesafioParOuImpar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
        }
}

