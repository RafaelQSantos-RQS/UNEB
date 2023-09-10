package roteiro6.parte3;

import javax.swing.*;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horarioInicio;
    private Tempo horarioFim;
    private double custoLigacao;
    private final double taxaPorMinuto = 1.00;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horarioInicio) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horarioInicio = horarioInicio;
        this.horarioFim = null;
        this.custoLigacao = 0;
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
            return horas + ":" + minutos + ":" + segundos;
        }
    }

    public void verificarNumero (String numero) {
        if (this.numOrigem.equals(numero)) {
            JOptionPane.showMessageDialog(null,"Este número é o de origem");
        } else if (this.numDestino.equals(numero)) {
            JOptionPane.showMessageDialog(null,"Este número é o de Destion");
        } else {
            JOptionPane.showMessageDialog(null,"Este número não pertence a essa ligação");
        }
    }

    public double getcustoDaChamada () {
        String strDuracao = duracaoDaChamada();
        if (strDuracao.equals("A ligação ainda não foi encerrada")) {
            return 0;
        }
        String [] arrDuracao = strDuracao.split(":",3);
        double horas = Double.parseDouble(arrDuracao[0]), minutos = Double.parseDouble(arrDuracao[1]), segundos = Double.parseDouble(arrDuracao[2]);
        if (segundos >=0) minutos++;
        this.custoLigacao = taxaPorMinuto *(horas*60 + minutos);
        return this.custoLigacao;
    }
}
