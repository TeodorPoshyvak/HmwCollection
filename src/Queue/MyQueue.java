package Queue;

import java.util.Arrays;

public class MyQueue<T> {
    private int capacity = 10;

    private Object[] myQueq = new Object[capacity];
    private int size;


    public void add(Object value){
        myQueq[size] = value;
        size++;
    }

    public int size(){
        System.out.println(size);
        return size;
    }

    public void rebalance(){
        if(myQueq.length == 8){
            myQueq = Arrays.copyOf(myQueq, myQueq.length + 5);
        }
    }

    public T peek(){
        if(myQueq[0] != null){
            System.out.println(myQueq[0]);
            return (T) myQueq[0];
        }else return null;
    }

    public T poll() {
        T num = null;
        if (myQueq[0] != null) {
            num = (T) myQueq[0];
            myQueq[0] = null;
        }

        for(int i = 0; i < myQueq.length; i++){
            if(myQueq[i] != null){
                System.out.println(num + " [" +  myQueq[i] + "]");
            }
        }
        return num;
    }

    public void clear(){
        for(int i = 0; i < myQueq.length; i++){
            myQueq[i] = null;
        }
    }

    @Override
    public String toString() {
        String results = "";
        for(int i = 0; i < myQueq.length; i++){
            if(myQueq[i] == null){
                continue;
            }
            results += "[" + myQueq[i] + "]";

        }
        return "myQueq=" + results;
    }
}
