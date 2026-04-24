public class Circulo {
    // atributos
    private Ponto centro;
    private double raio;

    // construtor
    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    // método
    public boolean estaContido(Ponto p) {
        double distancia = centro.distancia(p);
        return distancia <= raio;
    }
}