package am.arkadysahakyan.visitorpattern;

public interface Visitor<T> {
    void visit(T obj);
}
