package roteiro3.parte1;


import javax.swing.*;

public class Programa12 {
    public static void main(String[] args) {

        String strsb = JOptionPane.showInputDialog("Insira o salário Base");
        double sb = Double.parseDouble(strsb), sbReal;
        sbReal = Programa12.calcSalarioReal(sb);
        System.out.println(sb);
        System.out.println(sbReal);
        JOptionPane.showMessageDialog(null,"Seu salário com as correções é: " + sbReal);

    }

    public static double calcSalarioReal(double sb) {
        double gratificacao = sb*0.05;
        double imposto = sb*0.07;
        return sb+gratificacao-imposto;
    }
}
