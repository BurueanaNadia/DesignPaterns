package models;



public interface Element {
    public void print();
    
    default void add(Element element) {
    	throw new UnsupportedOperationException();
    }
    default void remove(Element element) {
    	throw new UnsupportedOperationException();
    }
    default Element get(int index) {
    	throw new UnsupportedOperationException();
    }
}