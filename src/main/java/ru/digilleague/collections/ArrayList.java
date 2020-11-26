package ru.digilleague.collections;


public class ArrayList<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_SIZE = 50;

    public ArrayList() {
        elements = new Object[DEFAULT_SIZE];

    }

    public ArrayList(Object[] elements) {
        this.elements = elements;
        this.size = elements.length;
    }

    public void add(E element) {
            Object[] newArray = new Object[elements.length+1];
            System.arraycopy(elements,0,newArray,0,size);
            elements = newArray;
            elements[size++] = element;
    }

    public Object get(int index) {
        if (index < size) {
            return elements[index];
        }else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean remove() {
        size = 0;
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

}
