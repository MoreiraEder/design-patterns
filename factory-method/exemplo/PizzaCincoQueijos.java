public class PizzaCincoQueijos extends Pizza {
    @Override
    public void criarPizza() {
        super.criarPizza();
        System.out.println("Add mussarela...");
        System.out.println("Add parmesão...");
        System.out.println("Add gorgonzola...");
        System.out.println("Add provolone...");
        System.out.println("Add requeijão maroto...");
    }
}