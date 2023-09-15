package roteiro7.parte2;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // Criando um vetor estático de objetos Aluno
        ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

        // Instanciando os objetos do tipo Aluno
        JOptionPane.showMessageDialog(null, "Instanciando os objetos do tipo Aluno","Let's Go",JOptionPane.INFORMATION_MESSAGE);
        for (int i=0;i<3;i++){
            int numAluno = i+1;
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira a matricula do aluno " + numAluno));
            String nome = JOptionPane.showInputDialog("Insira o nome do aluno " + numAluno);
            String curso = JOptionPane.showInputDialog("Insira o curso " + numAluno);
            int anoDeIngresso = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de ingresso do aluno " + numAluno));
            Aluno aluno = new Aluno(matricula,nome,curso,anoDeIngresso);

            listaDeAlunos.add(aluno);
        }

        JOptionPane.showMessageDialog(null,"Listando os alunos");
        for (int i=0;i< listaDeAlunos.size();i++) {
            int numAluno = i+1;
            String msg = "Matricula : " + listaDeAlunos.get(i).getMatricula() + "\n" +
                    "Nome : " + listaDeAlunos.get(i).getNome() + "\n" +
                    "Curso : " + listaDeAlunos.get(i).getCurso() + "\n" +
                    "Ano de Ingresso : " + listaDeAlunos.get(i).getAnoDeIngrsso();
            JOptionPane.showMessageDialog(null,msg,"Aluno " + numAluno,JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
