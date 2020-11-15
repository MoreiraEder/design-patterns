public class PagadorRuim implements Pagador {

    public float calcularJuros(float valorEmprestimo, int qtdMeses) {
        float valorTotal = valorEmprestimo + ((valorEmprestimo * 0.27f) * qtdMeses);

        return valorTotal;
    }
    
}