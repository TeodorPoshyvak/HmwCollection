package Queue;

import java.util.Arrays;

public class MyQueue<T> {
    private Object[] myQueq = new Object[10];
    private int size;


    public void add(T value) {
        if (size < myQueq.length) {
            myQueq[size] = value;
            size++;
        }
        if (size == myQueq.length) {
            rebalance();
        }
    }

    public int size() {
        return size;
    }

    private void rebalance() {
            myQueq = Arrays.copyOf(myQueq, myQueq.length * 2);
    }

    public T peek() {
        if (size != 0 && myQueq[0] != null) {
            return (T) myQueq[0];
        } else return (T) ("Error size! : " + null);
    }

    public T poll() {
        T firstInd = (T) myQueq[0];
       for(int i = 0; i < size; i++){
           myQueq[i] = myQueq[i+1];
       }
        myQueq = Arrays.copyOf(myQueq, myQueq.length-1);
        size--;
        return firstInd;
    }

    public void clear() {
        myQueq = new Object[myQueq.length];
        size = 0;
    }

    @Override
    public String toString() {
        String results = "";
        for (int i = 0; i < myQueq.length; i++) {
            if (myQueq[i] == null) {
                continue;
            }
            results += "[" + myQueq[i] + "]";

        }
        return "myQueq=" + results;
    }
}
