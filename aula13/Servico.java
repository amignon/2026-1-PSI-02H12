public class Servico implements IRecebivel {
    private String descricao;
    private int horas;
    private double precoHora;

    public Servico (String descricao, int horas, double precoHora) {
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    @Override
    public double totalizarReceita() {
        return horas * precoHora;
    }

    @Override
    public String toString() {
        double total = totalizarReceita();
        return String.format("%-10s|R$ %6.2f|%2dh|R$ %6.2f",
            descricao, precoHora, horas, total);
    }
}