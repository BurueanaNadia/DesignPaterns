package laborator4;

public interface Element {
    public void print();

    default void add(Element element) {
        throw new java.lang.UnsupportedOperationException();
    }
    default void remove(Element element) {
        throw new java.lang.UnsupportedOperationException();
    }
    default Element get(int index) {
        throw new java.lang.UnsupportedOperationException();
    }
}

