public class Programa {
    public static void main(String[] args) {
        RegistroRecebimentos recebimentos = new RegistroRecebimentos();

        IRecebivel r1 = new ItemVenda("Teclado", 2, 120);
        IRecebivel r2 = new Servico("Formatação", 3, 90);
        IRecebivel r3 = new ItemVenda("Mouse", 1, 60);

        recebimentos.adicionarRecebimento(r1);
        recebimentos.adicionarRecebimento(r2);
        recebimentos.adicionarRecebimento(r3);

        recebimentos.apresentarRecebimentos();
    }
}