package Models;

import java.time.LocalDate;

public class Aluno {
    private int matricula;
    private String nome;
    private int anoIngresso;
    private String curso;
    private int qtdDeDisciplinas;
    private String situacao;

    public Aluno(int matricula, String nome, int anoIngresso, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.qtdDeDisciplinas = 0;
        this.situacao = "Não Matriculado";
    }

    public int getTempoPermanenciaAnos(int anoAtual) {
        return anoAtual - this.anoIngresso;
    }

    public double getMensalidade() {
        return 150.0*this.qtdDeDisciplinas;
    }

    public void setQtdDeDisciplinas(int qtdDeDisciplinas) {
        this.qtdDeDisciplinas = qtdDeDisciplinas;
        if (qtdDeDisciplinas > 0) this.situacao = "Matriculado";
        else this.situacao = "Não Matriculado";
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public int getQtdDeDisciplinas() {
        return qtdDeDisciplinas;
    }

    public String getSituacao() {
        return situacao;
    }


}
