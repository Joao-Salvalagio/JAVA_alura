package JAVA_criando_sua_primeira_aplicacao.desafio_aula02;

public class DesafioProduto {
    public static void main(String[] args) {
        double precoProduto = 29.99;
        int quantidade = 3;

        double total = precoProduto * quantidade;

        String mensagem = "O valor total da compra é R$" + total;

        System.out.println(mensagem);
    }
}
