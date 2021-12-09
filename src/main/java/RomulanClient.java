public class RomulanClient extends AlienClient{
    @Override
    protected OrderingStrategy createOrderStrategy() {
        return new ImpatientStrategy();
    }

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
