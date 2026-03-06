import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // declara e constroe o vetor
        int[] consumos = new int[10];
        // popula o vetor
        for (int i = 0; i < consumos.length; i++) {
            System.out.printf("Consumo do Setor #%02d: ", (i + 1));
            consumos[i] = entrada.nextInt();
        }
        // percorre o vetor
        int totalSetoresConsumoAnomalo = 0;
        for (int i = 0; i < consumos.length; i++) {
            if (consumos[i] > 5000) {
                System.out.printf("Consumo Anômalo no Setor #%02d: %d\n",
                    (i + 1), consumos[i]);
                totalSetoresConsumoAnomalo++;
            }
        }
        System.out.printf("Total de Setores com Consumo Anômalo: %d\n",
            totalSetoresConsumoAnomalo);
        entrada.close();
    }
}