import java.util.ArrayList;
import java.util.List;

public class SingletonStaticBlock {
    private List<String> frases;
    private static final SingletonStaticBlock instance;

    private SingletonStaticBlock() {
        frases = new ArrayList<>();
    }    

    static {
        try {
            instance = new SingletonStaticBlock();
        }
        catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro ao criar uma instancia Singleton");
        }       
    }

    public static SingletonStaticBlock getInstance() {
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