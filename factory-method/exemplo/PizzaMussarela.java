public class PizzaMussarela extends Pizza {
    @Override
    public void criarPizza() {
        super.criarPizza();
        System.out.println("Add molho de tomate...");
        System.out.println("Add mussarela...");
        System.out.println("Add rodelas de tomate...");
        System.out.println("Add orégano...");        
    }
}