public class Programa {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(3, 4);
        Ponto p2 = new Ponto(5, 2);
        Ponto p3 = new Ponto(2, 3);
        
        Circulo c = new Circulo(p1, 2.00);
        System.out.printf("P2: %b\n", c.estaContido(p2));
        System.out.printf("P3: %b\n", c.estaContido(p3));

    }
}