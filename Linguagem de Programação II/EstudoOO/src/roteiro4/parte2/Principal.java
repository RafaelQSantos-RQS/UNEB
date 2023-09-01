package roteiro4.parte2;

public class Principal {
    public static void main(String[] args) {

        // Criação dos usuários
        Aluno aluno01 = new Aluno(111,"José","Sistemas de Informações",2019);
        Aluno aluno02 = new Aluno(2222,"Rafael Queiroz Santos","Sistemas de Informações",2023);

        // Printando os usuários
        System.out.println("Matricula : " + aluno01.matricula);
        System.out.println("Nome : " + aluno01.nome);
        System.out.println("Curso : " + aluno01.curso);
        System.out.println("Ano Ingresso : " + aluno01.anoIngresso);
        System.out.println(" ");
        System.out.println("Matricula : " + aluno02.matricula);
        System.out.println("Nome : " + aluno02.nome);
        System.out.println("Curso : " + aluno02.curso);
        System.out.println("Ano Ingresso : " + aluno02.anoIngresso);
    }
}
