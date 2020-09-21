public class Cafeteira {
    public static void main(String args[]) {
        Bebida chazinho = new Cha();
        chazinho.preparar(false);

        Bebida cafezinho = new Cafe();
        cafezinho.preparar(true);
    }
}