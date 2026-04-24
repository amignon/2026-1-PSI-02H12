public class Ponto {
    // atributos
    private int x;
    private int y;

    // construtores
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // métodos
    public double distancia(Ponto p) {
        double soma = Math.pow(p.x - this.x, 2) +
            Math.pow(p.y - this.y, 2);
        return Math.sqrt(soma);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }



    // getters e setters
    public int getX() { return x; }

    public void setX(int x) { this.x = x; }

    public int getY() { return y; }

    public void setY(int y) { this.y = y; }

}