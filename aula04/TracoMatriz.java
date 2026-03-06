import java.util.Scanner;
public class TracoMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // declara a matriz
        int[][] matriz = new int[4][4];
        // popula a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("M[%d][%d]: ", i, j);
                matriz[i][j] = entrada.nextInt();
            }
        }
        // apresenta a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }
        // calcula e apresenta o traco da matriz
        int traco = 0;
        for (int i = 0; i < matriz.length; i++) {
            traco = traco + matriz[i][i];
        }
        System.out.printf("Traço da matriz: %d\n", traco);
    }
}