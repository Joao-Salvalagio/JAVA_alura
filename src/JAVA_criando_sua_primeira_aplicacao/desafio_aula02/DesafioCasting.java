package JAVA_criando_sua_primeira_aplicacao.desafio_aula02;

public class DesafioCasting {
    public static void main(String[] args) {
        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble; //cast
        System.out.println("Casting de double para int: " + numeroInteiro);
    }
}
