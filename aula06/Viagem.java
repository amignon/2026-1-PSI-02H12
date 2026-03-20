public class Viagem {
    // atributos
    int distancia;
    double consumo;

    // métodos
    public double calculaCusto(double precoLitro) {
        double litros = distancia / consumo;
        return litros * precoLitro;
    }
}
