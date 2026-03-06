import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // entrada de dados
        System.out.print("Nome do cliente: ");
        String nomeCliente = entrada.nextLine();
        System.out.print("Serviço: ");
        String servico = entrada.nextLine();
        System.out.print("Horas estimadas: ");
        int horasEstimadas = entrada.nextInt();
        System.out.print("Valor por hora: ");
        double valorPorHora = entrada.nextDouble();
        // processamento
        double custoTotal = horasEstimadas * valorPorHora;
        // saída de dados
        String linhaDupla = "=".repeat(42);
        System.out.println(linhaDupla);
        System.out.println("           ORÇAMENTO DE SERVIÇO           ");
        System.out.println(linhaDupla);
        System.out.printf("%-17s%s%n", "Cliente:", nomeCliente);
        System.out.printf("%-17s%s%n", "Serviço:", servico);
        System.out.printf("%-17s%d%n", "Horas estimadas:", horasEstimadas);
        System.out.printf(new Locale("pt", "BR"),"%-17sR$ %.2f%n", 
            "Valor por hora:", valorPorHora);
        System.out.println("-".repeat(42)); 
        System.out.printf(new Locale("pt", "BR"),"%-17sR$ %.2f%n", 
            "Custo total:", custoTotal);
        System.out.println(linhaDupla);
        System.out.println("Validade deste orçamento: 7 dias");
        System.out.println("Obrigado pela preferência!");
        System.out.println(linhaDupla);
    }    
}