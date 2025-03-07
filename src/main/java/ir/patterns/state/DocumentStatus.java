package ir.patterns.state;

public interface DocumentStatus {

    void next(Document document);

    void prev(Document document);

    void print();
}
