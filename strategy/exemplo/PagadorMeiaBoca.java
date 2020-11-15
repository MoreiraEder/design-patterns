public class PagadorMeiaBoca implements Pagador {

    public float calcularJuros(float valorEmprestimo, int qtdMeses) {
        float valorTotal = valorEmprestimo + ((valorEmprestimo * 0.17f) * qtdMeses);

        return valorTotal;
    }
    
}