package roteiro5.parte1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        // Criação da loja 1
        Loja loja1 = new Loja();

        // Mostrando a resposta
        String msg1 = "Nome Fantasia: " + loja1.getNomeFantasia() + "\nRazão Social: " + loja1.getRazaoSocial() + "\nCNPJ: " + loja1.getCnpj();
        JOptionPane.showMessageDialog(null,msg1);

        // Criação da loja 1
        Loja loja2 = new Loja();

        // Mostrando a resposta
        String msg2 = "Nome Fantasia: " + loja2.getNomeFantasia() + "\nRazão Social: " + loja2.getRazaoSocial() + "\nCNPJ: " + loja2.getCnpj();
        JOptionPane.showMessageDialog(null,msg2);
    }
}
