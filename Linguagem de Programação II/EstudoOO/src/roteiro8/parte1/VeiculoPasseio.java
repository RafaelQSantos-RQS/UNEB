package roteiro8.parte1;

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
                "\nQuantidade máxima de passageiros: " + this.getQtdeMaxPassageiros();
    }
}
