package roteiro8.parte2;

public class VeiculoPasseio extends Veiculo {
    private int qtdeMaxPassageiros;

    public VeiculoPasseio(String placa, int anoFabricacao, int qtdeMaxPassageiros) {
        super(placa, anoFabricacao);
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

    public int getQtdeMaxPassageiros() {
        return qtdeMaxPassageiros;
    }

    public void setQtdeMaxPassageiros(int qtdeMaxPassageiros) {
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }
    public String getDescricao() {
        return "Placa: " + this.getPlaca() +
                "\nAno de Fabricação: " + this.getAnoFabricacao() +
                "\nQuantidade máxima de passageiros: " + this.getQtdeMaxPassageiros() +
                "\nPedágio: R$" + this.calcPedagio();
    }

    @Override
    public double calcPedagio() {
        super.taxaPedagio = 5.00;
        return super.taxaPedagio * this.qtdeMaxPassageiros;
    }
}
