package roteiro7.parte3;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoDeIngrsso;
    private String situacao;
    private ArrayList<String> disciplinas;

    public Aluno(int matricula, String nome, String curso, int anoDeIngrsso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoDeIngrsso = anoDeIngrsso;
        this.disciplinas = new ArrayList<>();
        this.setSituacao(1); // Não Matriculado
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

    public int getQtdDisciplinas() {
        return disciplinas.size();
    }

    public String getSituacao() {
        return situacao;
    }

    private void setSituacao(int opcao) {
        switch (opcao) {
            case 0 -> this.situacao = "Matriculado";
            case 1 -> this.situacao = "Não Matriculado";
            default -> this.situacao = "Não definido";
        }
    }

    public void addDisciplina(String disciplina){
        this.disciplinas.add(disciplina);
    }

    public void setDisciplinas(String strDisciplinas) {
        if (!Objects.equals(strDisciplinas, "")) {
            String[] listaDeDisciplinas = strDisciplinas.split(",", -1);
            for (String Disciplina : listaDeDisciplinas)
                this.addDisciplina(Disciplina.strip());
        } else {
            this.disciplinas = new ArrayList<>();
        }
        if (getQtdDisciplinas() > 0) {
            this.setSituacao(0);
        } else if (getQtdDisciplinas() == 0) {
            this.setSituacao(1);
        } else {
            this.setSituacao(2);
        }
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }
}
