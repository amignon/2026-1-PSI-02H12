import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Funcionario> funcionarios;

    public FolhaPagamento() {
        funcionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listaFuncionarios() {
        for (Funcionario f : funcionarios) {
            double valor = f.calculaProventos();
            System.out.printf("%-10s|R$ %7.2f\n", f.getNome(), valor);
        }
    }


}