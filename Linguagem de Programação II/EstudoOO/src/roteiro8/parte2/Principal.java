package roteiro8.parte2;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        // Instanciando os veiculos
        VeiculoCarga carga = new VeiculoCarga("22222-BA",2011,5000);
        VeiculoPasseio passeio = new VeiculoPasseio("33333-BA",2012,5);
        VeiculoPequeno pequeno = new VeiculoPequeno("44444-BA",2012,"Moto");

        // Printando
        JOptionPane.showMessageDialog(null,carga.getDescricao(),"Veículo de Carga",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,passeio.getDescricao(),"Veículo de Passeio",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,pequeno.getDescricao(),"Veículo Pequeno",JOptionPane.INFORMATION_MESSAGE);

    }
}
