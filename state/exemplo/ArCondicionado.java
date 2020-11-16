public class ArCondicionado {
    private ModoFuncionamento state;

    public ArCondicionado(ModoFuncionamento state) {
        this.state = state;
    }

    public void setState(ModoFuncionamento state) {
        this.state = state;
    }

    public void ligar() {
        state.ligar();
    }

    public void desligar() {
        state.desligar();
    }
}
