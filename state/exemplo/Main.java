public class Main {
    public static void main(String args[]) {

        ArCondicionado ac = new ArCondicionado(new StateAquecer());
        ac.ligar();

        ac.setState(new StateEsfriar());
        ac.ligar();

        ac.setState(new StateVentilar());
        ac.ligar();
        
        ac.desligar();
    }
}