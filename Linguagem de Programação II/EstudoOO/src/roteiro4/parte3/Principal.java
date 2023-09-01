package roteiro4.parte3;

public class Principal {
    public static void main(String[] args) {

        // Criação dos usuários
        Aluno aluno01 = new Aluno(111,"José","Sistemas de Informações",2019);

        // Printando os usuários
        System.out.println(" ");
        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());

        // Modificando a matrícula
        aluno01.setMatricula(222);

        // Printando os usuários
        System.out.println(" ");
        System.out.println("Matricula : " + aluno01.getMatricula());
        System.out.println("Nome : " + aluno01.getNome());
        System.out.println("Curso : " + aluno01.getCurso());
        System.out.println("Ano Ingresso : " + aluno01.getAnoIngresso());

    }
}
