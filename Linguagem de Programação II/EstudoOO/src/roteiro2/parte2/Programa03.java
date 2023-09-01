package roteiro2.parte2;

import javax.swing.JOptionPane;

public class Programa03 {
    public static void main(String[] args) {

        System.out.println("Informe o seu nome :");

        String nome = JOptionPane.showInputDialog("Informe o seu nome:");
        System.out.println("O nome informado é : " + nome);

        String stridade = JOptionPane.showInputDialog("Informe sua idade :");
        int idade = Integer.parseInt(stridade);
        System.out.println("A idade informada : " + idade);
    }
}
