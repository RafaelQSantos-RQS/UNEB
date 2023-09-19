package roteiro9.parte2;

public class Principal {
    public static void main(String[] args) {
        // Declarando os objetos
        Quadrado quad = new Quadrado(2);
        Retangulo ret = new Retangulo(3,2);
        Circulo circ = new Circulo(3);

        // Printando
        System.out.println("Nome : " + quad.getNomeFigura());
        System.out.println("Área : " + quad.getArea());
        System.out.println("Perímetro : " + quad.getPerimetro());

        System.out.println("Nome : " + ret.getNomeFigura());
        System.out.println("Área : " + ret.getArea());
        System.out.println("Perímetro : " + ret.getPerimetro());

        System.out.println("Nome : " + circ.getNomeFigura());
        System.out.println("Área : " + circ.getArea());
        System.out.println("Perímetro : " + circ.getPerimetro());
    }
}
