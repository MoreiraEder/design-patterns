public class Celular {
    private String nome;
    private float clockCpu;
    private int capacidadeBateria;

    public Celular(String nome, float clockCpu, int capacidadeBateria) {
        this.nome = nome;
        this.clockCpu = clockCpu;
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getNome() {
        return this.nome;
    }

    public float getClockCpu() {
        return this.clockCpu;
    }

    public int getCapacidadeBateria() {
        return this.capacidadeBateria;
    }
}