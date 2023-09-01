package roteiro2.parte2;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = entrada.nextLine();

        System.out.println("O nome informado : " + nome);

        entrada.close();
    }
}
