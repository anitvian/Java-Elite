package Collections;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

    private Object[] elementData;
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
        int oldCap = elementData.length;
        int newCap = oldCap + (oldCap>>1);

        if(newCap<=oldCap){
            newCap = oldCap+1;
        }

       this.elementData = Arrays.copyOf(elementData,newCap);

    }

    public T get(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            //noinspection unchecked
            return (T) elementData[index];
        }
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            @SuppressWarnings("unchecked")
            public T next() {
                return (T) elementData[cursor++];
            }
        };
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(", ");
            sb.append(elementData[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public void remove(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
        for(int i=index;i< size()-1;i++){

            elementData[i] = elementData[i+1];
        }
        elementData[--size] = null;
    }

    public void set(int index, T value){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        elementData[index] = value;
    }

    public boolean contains(T element) {

        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elementData[i])) {
                    return true;
                }
            }
        }

        return false;
    }

    public void add(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == elementData.length) {
            grow();
        }

        // shift right from end
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

}
