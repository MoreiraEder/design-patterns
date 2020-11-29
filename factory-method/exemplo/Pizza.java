public abstract class Pizza implements IPizza {
    public void criarPizza(){
        criarMassa();        
    }

    protected void criarMassa() {
        System.out.println("Criando a massa da pizza");
    }
}