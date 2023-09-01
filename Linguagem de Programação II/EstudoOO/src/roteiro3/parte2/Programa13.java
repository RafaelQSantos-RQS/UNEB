package roteiro3.parte2;

import javax.swing.*;

public class Programa13 {
    public static void main(String[] args) {

        // Entrada de valores
        double x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de X"));
        String op = JOptionPane.showInputDialog("Informe a operação (+, -, *, /)");
        double y = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de Y"));

        // Operação
        switch (op) {
            case "+": soma(x,y);
                break;
            case "-": subtracao(x,y);
                break;
            case "*": multiplicacao(x,y);
                break;
            case "/": divisao(x,y);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Operação Inválida","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void soma(double x, double y){
        JOptionPane.showMessageDialog(null,"Resultado: " + (x+y));
    }
    public static void subtracao(double x, double y){
        JOptionPane.showMessageDialog(null,"Resultado: " + (x-y));
    }
    public static void multiplicacao(double x, double y){
        JOptionPane.showMessageDialog(null,"Resultado: " + (x*y));
    }
    public static void divisao(double x, double y){
        JOptionPane.showMessageDialog(null,"Resultado: " + (x/y));
    }
}
