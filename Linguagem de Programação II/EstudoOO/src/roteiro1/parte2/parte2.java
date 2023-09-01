package roteiro1.parte2;

public class parte2 {

    public static void main(String[] args) {

        double sb = 2500;
        int numHorasExtra = 10;

        System.out.println(("Salário base : " + sb));
        System.out.println("Valor da hora extra : " + sb/40);

        double valor_hora_extra = sb/40;
        double salario_corrigido = sb + valor_hora_extra*numHorasExtra;
        System.out.println("Salário com as horas extras : " + salario_corrigido);
    }
}
