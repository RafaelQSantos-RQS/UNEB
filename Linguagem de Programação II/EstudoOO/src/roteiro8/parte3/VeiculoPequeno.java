package roteiro8.parte3;

public class VeiculoPequeno extends Veiculo {
    private String modelo;

    public VeiculoPequeno(String placa, int anoFabricacao, String modelo) {
        super(placa, anoFabricacao);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getDescricao() {
        return "Placa: " + this.getPlaca() +
                "\nAno de Fabricação: " + this.getAnoFabricacao() +
                "\nModelo: " + this.getModelo() +
                "\nPedágio: R$" + this.calcPedagio();
    }
}
