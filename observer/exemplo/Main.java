public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new ClienteAfobado(subject);
        new ClienteAnsioso(subject);

        System.out.println("Add um novo celular ao estoque...");
        subject.addCelularEstoque(new Celular("meuPhone", 1.4f, 2000));
    }
}