public class FactoryMobile implements IFactory {
    @Override
    public ProcessadorJ3Mobile criarProcessadorJ3() {
        return new ProcessadorJ3Mobile();
    }
    @Override
    public ProcessadorJ7Mobile criarProcessadorJ7() {
        return new ProcessadorJ7Mobile();
    }
}
