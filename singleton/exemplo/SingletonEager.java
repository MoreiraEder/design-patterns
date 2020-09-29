import java.util.ArrayList;
import java.util.List;

public class SingletonEager {
    private List<String> frases;
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        frases = new ArrayList<>();
    }    

    public static SingletonEager getInstance() {
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