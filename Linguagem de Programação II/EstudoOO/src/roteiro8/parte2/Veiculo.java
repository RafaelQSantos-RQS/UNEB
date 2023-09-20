package roteiro8.parte2;

public abstract class Veiculo {
    private String placa;
    private int anoFabricacao;
    protected double taxaPedagio = 6.00;

    public Veiculo(String placa, int anoFabricacao) {
        this.placa = placa.toUpperCase(); // Força a placa sempre ser upper case
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public double calcPedagio() {
        return this.taxaPedagio;
    }
}
