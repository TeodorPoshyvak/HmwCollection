package Stack;

import java.util.Arrays;

public class MyStack<T> {
    private int capacity = 10;
    private Object[] stack = new Object[capacity];
    private int size;

    public T peek() {
        T results = null;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null) {
                results = (T) stack[i];
            }
        }
        return results;
    }

    public T pop() {
        T results = null;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null) {
                results = (T) stack[i];
            }
            if (stack[i] == null) {
                break;
            }
        }

        for (int i = 0; i < stack.length; i++) {
            if (stack[i].equals(results)) {
                stack[i] = null;
                break;
            }
        }
        return results;
    }


    public int size() {
        return size;
    }

    public void push(T value) {
        stack[size] = value;
        size++;
    }

    public void clear() {
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null) {
                size--;
            }
            stack[i] = null;
        }
        size--;
    }

    public void remove(int index) {
        try {
            stack[index] = null;
        } catch (Exception e) {
            System.out.println("Error index!");
        }
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
