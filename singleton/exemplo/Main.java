public class Main {
    public static void main(String[] args) {
        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonStaticBlock singletonStaticBlockEager = SingletonStaticBlock.getInstance();
        SingletonLazy singletonLazy = SingletonLazy.getInstance();

        singletonEager.addFrase("testeEager01");
        singletonStaticBlockEager.addFrase("testeStaticBlock01");
        singletonLazy.addFrase("testeLazy01");

        singletonEager.listarFrases();
        singletonStaticBlockEager.listarFrases();
        singletonLazy.listarFrases();

        singletonEager = SingletonEager.getInstance();
        singletonStaticBlockEager = SingletonStaticBlock.getInstance();
        singletonLazy = SingletonLazy.getInstance();

        singletonEager.addFrase("testeEager02");
        singletonStaticBlockEager.addFrase("testeStaticBlock02");
        singletonLazy.addFrase("testeLazy02");

        singletonEager.listarFrases();
        singletonStaticBlockEager.listarFrases();
        singletonLazy.listarFrases();
    }
}