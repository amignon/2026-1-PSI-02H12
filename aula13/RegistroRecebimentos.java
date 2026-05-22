import java.util.ArrayList;
public class RegistroRecebimentos {
    private ArrayList<IRecebivel> recebimentos;

    public RegistroRecebimentos() {
        recebimentos = new ArrayList<>();
    }

    public void adicionarRecebimento(IRecebivel r) {
        recebimentos.add(r);
    }

    public void apresentarRecebimentos() {
        double total = 0.0;
        for (IRecebivel r : recebimentos) {
            total += r.totalizarReceita();
            System.out.println(r);
        }
        System.out.printf("\nTotal: R$ %7.2f\n", total);
    }

}