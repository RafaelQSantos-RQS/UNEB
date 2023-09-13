package roteiro6.parte3;

import javax.swing.*;

import static roteiro6.parte3.Tempo.diferencaEntreTempos;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horarioInicio;
    private Tempo horarioFim;
    private double custoLigacao;
    private final double taxaPorMinuto = 1.00;
    private Tempo duracao;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horarioInicio) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horarioInicio = horarioInicio;
        this.horarioFim = null;
        this.custoLigacao = 0;
        this.duracao = new Tempo(0,0,0);
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
        this.duracao = diferencaEntreTempos(this.horarioInicio,this.horarioFim);
    }

    public Tempo getDuracao() {
        return this.duracao;
    }

    public int verificarNumero (String numero) {
        if (this.numOrigem.equals(numero)) {
            return 0;
        } else if (this.numDestino.equals(numero)) {
            return 1;
        } else {
            return 2;
        }
    }

    public double getcustoDaChamada () {
        if (this.duracao == null) {
            return 0;
        }
        this.custoLigacao = taxaPorMinuto * this.duracao.quantidadeDeMinutosMaisFracao();
        return this.custoLigacao;
    }
}
