public class ClienteAnsioso extends Observer {

    public ClienteAnsioso(Subject s) {
        this.subject = s;
        this.subject.attach(this);
    }

    public void update() {
        realizarCompraInstantaneo();
    };

    private void realizarCompraInstantaneo() {
        System.out.println("Comprei meu novo celular instantâneamente!");
    }
}