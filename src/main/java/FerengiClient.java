public class FerengiClient extends AlienClient{
    @Override
    protected OrderingStrategy createOrderStrategy() {
        return new SmartStrategy();
    }

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
