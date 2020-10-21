public class ClienteAfobado extends Observer {

    public ClienteAfobado(Subject s) {
        this.subject = s;
        this.subject.attach(this);
    }

    public void update() {
        realizarCompraImediatamente();
    };

    private void realizarCompraImediatamente() {
        System.out.println("Acabei de comprar meu novo celular!");
    }
}