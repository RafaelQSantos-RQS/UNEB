package roteiro6.parte2;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horarioInicio;
    private Tempo horarioFim;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horarioInicio) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horarioInicio = horarioInicio;
        this.horarioFim = null;
    }

    public String getNumOrigem() {
        return numOrigem;
    }

    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public Tempo getHorarioInicio() {
        return this.horarioInicio;
    }

    public void setHorarioInicio(Tempo horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Tempo getHorarioFim() {
        return this.horarioFim;
    }

    public void setHorarioFim(Tempo horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String duracaoDaChamada () {
        if (this.horarioFim == null){
            String s = "A ligação ainda não foi encerrada";
            return s;
        }else{
            int horas = this.horarioFim.getHora() - this.horarioInicio.getHora();
            int minutos = this.horarioFim.getMinuto() - this.horarioInicio.getMinuto();
            int segundos = this.horarioFim.getSegundo() - this.horarioInicio.getSegundo();
            return "A duração da chamado foi de " + horas + ":" + minutos + ":" + segundos;
        }
    }
}
