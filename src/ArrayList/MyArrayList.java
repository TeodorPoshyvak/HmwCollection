package ArrayList;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {
    private int size = 0;
    private Object[] list = new Object[10];


    public void add(E value) {
        if (size < list.length) {
            list[size] = value;
            size++;
        }
        if (size == list.length) {
            rebalance();
        }

    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        return (E) list[index];

    }

    public int size() {
        return size;
    }

    public void clear() {
        list = new Object[list.length];
        size = 0;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        list = Arrays.copyOf(list, list.length - 1);
        size--;
    }

    private void rebalance() {
        list = Arrays.copyOf(list, list.length * 2);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += list[i] + "\n";
        }
        return result;
    }
}
