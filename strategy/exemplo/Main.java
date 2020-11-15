public class Main {
    public static void main(String args[]) {
        Cliente clienteBom = new Cliente("Filomena", "11212121212");
        Emprestimo emprestimoBom = new Emprestimo(new PagadorBom(), 500f, 2);

        clienteBom.setValorEmprestimo(emprestimoBom.getValorTotalEmprestimo());

        System.out.println("Cliente " + clienteBom.getNomeCliente());
        System.out.println("Valor total do empréstimo " + clienteBom.getValorEmprestimo() + "\n");

        Cliente clienteRuim = new Cliente("Blumenau", "987898773333");
        Emprestimo emprestimoRuim = new Emprestimo(new PagadorRuim(), 500f, 2);

        clienteRuim.setValorEmprestimo(emprestimoRuim.getValorTotalEmprestimo());

        System.out.println("Cliente " + clienteRuim.getNomeCliente());
        System.out.println("Valor total do empréstimo " + clienteRuim.getValorEmprestimo() + "\n");
    }
}