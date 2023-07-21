package Stack;

import java.util.Arrays;
import java.util.Objects;

public class MyStack<T> {
    private Object[] stack = new Object[10];
    private int size;

    public T peek() {
        if (size != 0 && stack[size - 1] != null) {
            return (T) stack[size - 1];
        } else return (T) ("Error size! : " + null);
    }

    public T pop() {
        if (size != 0 && stack[size - 1] != null) {
            T firstInd = (T) stack[size - 1];
            stack[size - 1] = null;
            size--;
            return firstInd;
        } else
            return (T) ("Error size! : " + null);
    }


    public int size() {
        return size;
    }

    public void push(T value) {
        if (size < stack.length) {
            stack[size] = value;
            size++;
        }
        if (size == stack.length) {
            rebalance();
        }
    }

    private void rebalance() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public void clear() {
        stack = new Object[stack.length];
        size = 0;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        for (int i = index; i < size; i++) {
            stack[i] = stack[i + 1];
        }
        stack = Arrays.copyOf(stack, stack.length - 1);
        size--;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null) {
                stringBuilder.append("[").append(stack[i]).append("]");
            }
        }
        return stringBuilder.toString();
    }
}
