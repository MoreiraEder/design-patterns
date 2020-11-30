public class Main {
    public static void main(String[] args) {
        IFactory fabrica;
        
        fabrica= new FactoryDesktop();
        fabrica.criarProcessadorJ3();
        fabrica.criarProcessadorJ7();

        fabrica= new FactoryMobile();
        fabrica.criarProcessadorJ3();
        fabrica.criarProcessadorJ7();
    }
    
}