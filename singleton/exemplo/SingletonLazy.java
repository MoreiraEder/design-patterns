import java.util.ArrayList;
import java.util.List;

public class SingletonLazy {
    private List<String> frases;
    private static volatile SingletonLazy instance = null;

    private SingletonLazy() {
        frases = new ArrayList<>();
    }    

    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized(SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }        
        return instance;
    }

    public void addFrase(String frase) {
        frases.add(frase);
    }

    public void listarFrases() {
        for (String s : frases) {
            System.out.println(s);
        }
    }
}