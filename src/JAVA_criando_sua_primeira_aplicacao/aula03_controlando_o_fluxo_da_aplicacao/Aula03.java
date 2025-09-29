package JAVA_criando_sua_primeira_aplicacao.aula03_controlando_o_fluxo_da_aplicacao;

public class Aula03 {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if(anoDeLancamento >= 2022){
            System.out.println("FILME LANÇAMENTO");
        }else {
            System.out.println("FILME ANTIGO");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("INCLUIDO NO PLANO");
        }else{
            System.out.println("NAO INCLUIDO NO PLANO, PAGUE A MENSALIDADE");
        }
    }
}
