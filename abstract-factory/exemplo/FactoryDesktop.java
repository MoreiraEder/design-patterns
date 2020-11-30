public class FactoryDesktop implements IFactory {

    @Override
    public ProcessadorJ3Desktop criarProcessadorJ3() {
        return new ProcessadorJ3Desktop();
    }
    @Override
    public ProcessadorJ7Desktop criarProcessadorJ7() {
        return new ProcessadorJ7Desktop();
    }
}
