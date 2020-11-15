public class Emprestimo {
    private Pagador tipoCliente;
    private float valorEmprestimo;
    private int qtdMesesEmprestimo;

    public Emprestimo(Pagador tipoCliente, float valorEmprestimo, int qtdMesesEmprestimo) {
        this.tipoCliente = tipoCliente;
        this.valorEmprestimo =  valorEmprestimo;
        this.qtdMesesEmprestimo = qtdMesesEmprestimo;
    }

    public float getValorTotalEmprestimo() {
        return tipoCliente.calcularJuros(valorEmprestimo, qtdMesesEmprestimo);
    }

}
