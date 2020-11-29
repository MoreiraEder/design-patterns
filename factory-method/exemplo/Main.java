public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        IPizza pizzaMussarela = new PizzaMussarela();
        pizzaMussarela.criarPizza();
        System.out.println("\n");

        IPizza pizzaFrango = new PizzaFrango();
        pizzaFrango.criarPizza();
        System.out.println("\n");

        IPizza pizzaCincoQueijos = new PizzaCincoQueijos();
        pizzaCincoQueijos.criarPizza();
    }
}