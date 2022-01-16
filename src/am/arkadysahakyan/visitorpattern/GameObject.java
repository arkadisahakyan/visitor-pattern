package am.arkadysahakyan.visitorpattern;

public abstract class GameObject implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
