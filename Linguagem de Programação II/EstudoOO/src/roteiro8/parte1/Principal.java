package roteiro8.parte1;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("11111-BA",2010);
        VeiculoCarga carga = new VeiculoCarga("22222-BA",2011,5000);
        VeiculoPasseio passeio = new VeiculoPasseio("33333-BA",2012,5);
        VeiculoPequeno pequeno = new VeiculoPequeno("44444-BA",2012,"Moto");

        System.out.println();
    }
}
