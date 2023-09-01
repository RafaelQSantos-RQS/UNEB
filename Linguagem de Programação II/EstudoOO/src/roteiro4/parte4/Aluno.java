package roteiro4.parte4;

import javax.swing.*;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdDisciplinas;
    private String situacao;

    // Constructor
    Aluno () {
        JOptionPane.showMessageDialog(null, "Estaremos começando o cadastro de alunos", "Cadastro de aluno",JOptionPane.INFORMATION_MESSAGE);
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira a matricula do aluno a ser cadastrado"));
        nome = JOptionPane.showInputDialog("Insira o nome do aluno");
        curso = JOptionPane.showInputDialog("Insiria o curso");
        anoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de ingresso"));
        qtdDisciplinas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de matérias"));

        // lógica para definir se um aluno está ou não matriculado
        if (this.qtdDisciplinas > 0) {
            situacao = "Matriculado!!";
        } else if (this.qtdDisciplinas == 0) {
            situacao = "Não Matriculado!!";
        } else {
            situacao = "Não é possível definir";
        }
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

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdDisciplinas() {
        return qtdDisciplinas;
    }

    public void setQtdDisciplinas(int qtdDisciplinas) {
        this.qtdDisciplinas = qtdDisciplinas;
        if (qtdDisciplinas > 0) {
            setSituacao("Matriculado!!");
        } else if(qtdDisciplinas == 0) {
            setSituacao("Não Matriculado!!");
        } else {
            setSituacao("Não é possível definir!!");
        }
    }

    public String getSituacao() {
        return this.situacao;
    }

    private void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    
}
