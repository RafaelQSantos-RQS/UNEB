package roteiro2.parte3;

import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {

            System.out.println("Digite uma nota:");
            int nota = entrada.nextInt();

            if (nota < 0) break;

            if (nota >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
