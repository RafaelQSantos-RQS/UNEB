package roteiro6.parte3;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    static Tempo diferencaEntreTempos (Tempo inicio,Tempo fim) {
            int horas = fim.getHora() - inicio.getHora();
            int minutos = fim.getMinuto() - inicio.getMinuto();
            int segundos = fim.getSegundo() - inicio.getSegundo();
            return new Tempo(horas,minutos,segundos);
    }

    public int quantidadeDeMinutosMaisFracao () {
        if (this.segundo > 0) this.minuto++;
        return this.hora*60 + this.minuto;
    }

}
