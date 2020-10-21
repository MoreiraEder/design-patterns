public class Adapter extends Radar implements ISistemaFiscal  {

    public float getVelociadeKilometros() {
        Radar radar = new Radar();
        float velocidadeConvertida = radar.gerVelocidadeMilhas() * 1.609344f;
        
        return velocidadeConvertida;
    }

}