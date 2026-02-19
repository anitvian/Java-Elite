package Collections;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

    public Object[] elementData;
    private int size;
    private static final int DEF_CAP = 10;

    public MyArrayList() {
        this.elementData = new Object[DEF_CAP];
        this.size = 0;
    }

    public MyArrayList(int custom_cap) {
        this.elementData = new Object[custom_cap];
        this.size = 0;
    }

    public void add(T element) {
        if (size != elementData.length) {
            elementData[size] = element;
            size++;
        } else {
            grow();
            add(element);
        }
    }

    public void grow() {
        this.elementData =
                Arrays.copyOf(elementData, elementData.length + (elementData.length >> 1));

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }
}
