public class TestaFolhaPagamento {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ale", 1000);
        Funcionario f1 = new Funcionario("Bia", 2500.25);
        Funcionario fc = new FuncionarioComissionado("Carlos", 1200, 15, 3000);
        Funcionario fprod = new FuncionarioProdutividade("Daniel", 2000, 10, 50);

        FolhaPagamento fp = new FolhaPagamento();
        fp.adicionaFuncionario(f);
        fp.adicionaFuncionario(f1);
        fp.adicionaFuncionario(fc);
        fp.adicionaFuncionario(fprod);

        fp.listaFuncionarios();
    }
}