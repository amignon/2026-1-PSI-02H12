import java.util.Scanner;
public class TestaViagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Distância da Viagem: ");
        int dist = entrada.nextInt();
        System.out.print("Consumo (km/l): ");
        double kmPorLitro = entrada.nextDouble();
        System.out.print("Preço por litro: ");
        double preco = entrada.nextDouble();

        Viagem umaViagem = new Viagem();
        umaViagem.distancia = dist;
        umaViagem.consumo = kmPorLitro;
        double custo = umaViagem.calculaCusto(preco);
        System.out.printf("Custo da Viagem: R$ %.2f\n", custo);

        entrada.close();
    }
}
