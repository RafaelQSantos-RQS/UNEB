package roteiro7.parte1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        // Criando um vetor estático de objetos Aluno
        Aluno [] listaDeAlunos = new Aluno[3];

        // Instanciando os objetos do tipo Aluno
        for (int i=0;i<3;i++){
            int aluno = i+1;
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira a matricula do aluno " + aluno));
            String nome = JOptionPane.showInputDialog("Insira o nome do aluno " + aluno);
            String curso = JOptionPane.showInputDialog("Insira o curso " + aluno);
            int anoDeIngresso = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de ingresso do aluno " + aluno));

            listaDeAlunos[i] = new Aluno(matricula,nome,curso,anoDeIngresso);
        }

        System.out.println("Listando os Alunos : ");
        System.out.println("********************************");
        for (int i=0;i<3;i++) {
            System.out.println("Matricula : " + listaDeAlunos[i].getMatricula());
            System.out.println("Nome : " + listaDeAlunos[i].getNome());
            System.out.println("Curso : " + listaDeAlunos[i].getCurso());
            System.out.println("Ano de Ingresso : " + listaDeAlunos[i].getAnoDeIngrsso());
            System.out.println("********************************");
        }

    }
}
