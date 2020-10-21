public class Main {
    public static void main(String args[]) {
        ISistemaFiscal fiscal = new Adapter();

        System.out.println("Velocidade medida: " +fiscal.getVelociadeKilometros()+ " km/h");
    }
}