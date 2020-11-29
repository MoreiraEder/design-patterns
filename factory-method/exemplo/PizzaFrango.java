public class PizzaFrango extends Pizza {
    @Override
    public void criarPizza() {
        super.criarPizza();
        System.out.println("Add molho de tomate...");
        System.out.println("Add frango...");
        System.out.println("Add mussarela...");
        System.out.println("Add requeijão...");
    }
}