import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    // entrada de dados
	    System.out.print("Título do livro: ");
	    String livro = entrada.nextLine();
	    System.out.print("Dias em atraso: ");
	    int diasEmAtraso = entrada.nextInt();
	    // processamento
	    double multaTotal = diasEmAtraso * 1.25;
	    // saída de dados
	    Locale locale = new Locale("pt", "BR");
	    String linha = "+" + "-".repeat(40) + "+";
	    System.out.println(linha);
	    System.out.println("|      AVISO DE MULTA - BIBLIOTECA       |");
	    System.out.println(linha);
	    System.out.printf("%-17s%s%n", "Livro:", livro);
	    System.out.printf("%-17s%d%n", "Dias em atraso:", diasEmAtraso);
	    System.out.printf(locale, "%-17sR$ %.2f%n", "Multa total: ", multaTotal);
	    System.out.println(linha);
	    System.out.println("Por favor, regularize sua situação.");
	    
	}
}
