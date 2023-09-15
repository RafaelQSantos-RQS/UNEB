package roteiro7.parte2;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoDeIngrsso;
    private int qtdDisciplina;
    private String situacao;

    public Aluno(int matricula, String nome, String curso, int anoDeIngrsso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoDeIngrsso = anoDeIngrsso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoDeIngrsso() {
        return anoDeIngrsso;
    }

    public void setAnoDeIngrsso(int anoDeIngrsso) {
        this.anoDeIngrsso = anoDeIngrsso;
    }

    public int getQtdDisciplina() {
        return qtdDisciplina;
    }

    public void setQtdDisciplina(int qtdDisciplina) {
        this.qtdDisciplina = qtdDisciplina;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
