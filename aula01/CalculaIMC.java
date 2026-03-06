import java.util.Scanner;
public class CalculaIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = entrada.nextDouble();
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();
        
        double imc = peso / Math.pow(altura, 2);

        System.out.printf("IMC = %.1f\n", imc);
        entrada.close();
    }
}