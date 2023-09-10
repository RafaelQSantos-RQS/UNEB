package roteiro6.parte2;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private String horarioInicio;
    private String horarioFim;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, String horarioInicio) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horarioInicio = horarioInicio;
        this.horarioFim = "";
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

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String duracaoDaChamada () {
        if (this.horarioFim.isEmpty()){
            String s = "A ligação ainda não foi encerrada";
            return s;
        }else{
            String [] arrOfInicio = this.horarioInicio.split(":",3);
            String [] arrOfFim = this.horarioFim.split(":",3);
            int horas = Integer.parseInt(arrOfFim[0]) - Integer.parseInt(arrOfInicio[0]);
            int minutos = Integer.parseInt(arrOfFim[1]) - Integer.parseInt(arrOfInicio[1]);
            int segundos = Integer.parseInt(arrOfFim[2]) - Integer.parseInt(arrOfInicio[2]);
            return "A duração da chamado foi de " + horas + ":" + minutos + ":" + segundos;
        }
    }
}
