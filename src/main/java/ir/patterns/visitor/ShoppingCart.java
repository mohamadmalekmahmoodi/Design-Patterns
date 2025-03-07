package ir.patterns.visitor;

public interface ShoppingCart {

    float visit(Book book);

    float visit(Oil oil);
}
