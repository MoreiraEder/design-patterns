public class Prato extends Componente {
    
    private float preco;
    private String nome;

    Prato(String nome, float preco) {
        this.preco = preco;
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}