package ArrayList;

public class MyArrayList<E> {
    private int capacityList = 16;
    private int size = 0;
    private Object[] list = new Object[capacityList];


    public void add(E value) {
        if (size < list.length) {
            list[size] = value;
            size++;
        }
    }

    public E get(int index) {
        for (int i = 0; i < size; i++) {
            if (list[i] == list[index]) {
                return (E) list[index];
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        list = new Object[list.length];
    }

    public void remove(int index) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == list[index] && list[i] != null) {
                list[index] = null;
                size--;
            }
        }
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
