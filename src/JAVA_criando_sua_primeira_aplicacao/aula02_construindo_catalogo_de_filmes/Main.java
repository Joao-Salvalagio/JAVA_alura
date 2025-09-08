package JAVA_criando_sua_primeira_aplicacao.aula02_construindo_catalogo_de_filmes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = "Filme de aventura com atores dos anos 80";
        System.out.println("Sinopse: " + sinopse);

        String textblock;
        textblock = """
                Oi
                Teste text block
                Tchau
                """;
        System.out.println("Texto: " + textblock);

        //mais um exemplo usando text block + formatted

        String nome = "Joao Miguel";
        int aulas = 4;

        String mensagem = """
                Olá, sou o %s!
                Estou tendo %d aulas de java com o alura!
                """.formatted(nome, aulas);
        System.out.println("Mensagem: " + mensagem);

        //existem palavras reservadas no java que nao podem ser utilizadas, ex: class, user, etc.

        int classificacao;
        //utilizando cast to int, fazendo com que o compilador me traga um numero inteiro ao inves de um double.
        classificacao = (int) (media /2);
        System.out.println("Classificação: " + classificacao);
    }
}
