package roteiro8.parte3;

public class VeiculoCarga extends Veiculo {
    private int pesoMax;

    public VeiculoCarga(String placa, int anoFabricacao, int pesoMax) {
        super(placa, anoFabricacao);
        this.pesoMax = pesoMax;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public String getDescricao() {
        return "Placa: " + this.getPlaca() +
                "\nAno de Fabricação: " + this.getAnoFabricacao() +
                "\nPeso Máximo: " + this.getPesoMax() +
                "\nPedágio: R$" + this.calcPedagio();
    }
    @Override
    public double calcPedagio() {
        super.taxaPedagio = 2.0;
        return super.taxaPedagio * this.pesoMax;
    }
}
