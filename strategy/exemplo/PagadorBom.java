public class PagadorBom implements Pagador {

    public float calcularJuros(float valorEmprestimo, int qtdMeses) {
        float valorTotal = valorEmprestimo + ((valorEmprestimo * 0.12f) * qtdMeses);

        return valorTotal;
    }
    
}