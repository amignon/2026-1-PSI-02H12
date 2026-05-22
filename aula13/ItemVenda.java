public class ItemVenda implements IRecebivel {
    private String produto;
    private int quantidade;
    private double valor;

    public ItemVenda(String produto, int quantidade, double valor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    public double totalizarReceita() {
        return valor * quantidade;
    }

    @Override
    public String toString() {
        double total = totalizarReceita();
        return String.format("%-10s|R$ %6.2f|%2dx|R$ %6.2f",
            produto, valor, quantidade, total);
    }
}