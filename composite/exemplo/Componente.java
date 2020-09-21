public abstract class Componente {   

    public void add(Componente c) {
        throw new UnsupportedOperationException();
    }

    public void remove(Componente c) {
        throw new UnsupportedOperationException();
    }

    public Componente getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public abstract float getPreco();
}