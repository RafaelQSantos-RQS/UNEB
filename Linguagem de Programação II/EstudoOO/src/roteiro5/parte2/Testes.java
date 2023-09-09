package roteiro5.parte2;

public class Testes {
    public static void main(String[] args) {
        Loja loja01 = new Loja("lojão da Cidade","Lojão Comércio LTDA","11223344");
        Loja loja02 = new Loja("Mercadão do Povo","10101010");
        Loja loja03 = new Loja("lojão da Cidade","Lojão Comércio LTDA","11223344");

        System.out.println("***** Teste 1 *****");
        if (loja01.getNomeFantasia() == loja03.getNomeFantasia()) {
            System.out.println("Lojas iguais");
        } else {
            System.out.println("lojas diferentes");
        }

        System.out.println("***** Teste 2 *****");
        if (loja01.getNomeFantasia().equals(loja03.getNomeFantasia())){
            System.out.println("Lojas iguais");
        }else{
            System.out.println("Lojas diferentes");
        }

        System.out.println("***** Teste 3 *****");
        if (loja01 == loja03) {
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }

        System.out.println("***** Teste 4 *****");
        if (loja01.equals(loja03)) {
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }

        System.out.println("***** Teste 5 *****");
        if (loja01.getValorFat() == loja03.getValorFat()) {
            System.out.println("Lojas iguais");
        } else {
            System.out.println("Lojas diferentes");
        }

        System.out.println("No teste 5 é possível usar o operador equals?");
        System.out.println("Resposta: Sim, o método equals testa se o conteúdo é igual, já o operador == testa se ocupam o mesmo ligar da memória.");
    }
}
