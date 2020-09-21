public abstract class Bebida {
    public void preparar(Boolean addAcucar) {
        esquentarAgua();
        addIngrediente();
        
        if (addAcucar) {
            addAcucar();
        }

        colocarBebidaCopo();
    }

    private void addAcucar() {
        System.out.println("Adicionando açúcar");
    }

    private void esquentarAgua() {
        System.out.println("Esquentando a água");
    }   

    private void colocarBebidaCopo() {
        System.out.println("Colocando a bebida no copo");
    }

    protected abstract void addIngrediente();
}