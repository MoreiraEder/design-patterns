public class Cliente {
    private String nomeCliente;
    private String cpf;
    private float valorEmprestimo;

    public void setValorEmprestimo(float valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public float getValorEmprestimo() {
        return this.valorEmprestimo;
    }
    
    public Cliente(String nomeCliente, String cpf) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }    
}
