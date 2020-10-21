import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private List<Celular> celularesVendaEstoque = new ArrayList<Celular>();

    public void addCelularEstoque(Celular c) {
        celularesVendaEstoque.add(c);
        notifyAllObservers();
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void dettach(Observer o) {
        observers.remove(o);
    }

    public void notifyAllObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
    
}