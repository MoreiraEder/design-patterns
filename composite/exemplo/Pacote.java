import java.util.List;
import java.util.ArrayList;

public class Pacote extends Componente {
    
    private List<Componente> lista = new ArrayList<>();

    public void add(Componente c) {
        lista.add(c);
    }

    public void remove(Componente c) {
        lista.remove(c);
    }

    public Componente getChild(int index) {
        return (Componente) lista.get(index);
    }

    public float getPreco() {
        float precoTotal = 0.0f;

        for (Componente itemLista : lista) {
            precoTotal += itemLista.getPreco();
        }

        return precoTotal;
    }
}