package ArrayList;
public class MyArrayList<E>{
    private int capacityList = 16;
    private int size = 0;
    private Object[] list = new Object[capacityList];


    public void add(Object value) {
        if(size < list.length) {
            list[size] = value;
            size++;
        }
    }

    public E get(int index) {
        return (E) list[size];
    }

    public void size() {
        System.out.println(size);
    }

    public void clear() {
        for(int i = 0; i < list.length; i++){
            list[i] = null;
        }
    }
    public void remove(int index) {
      Object val[] = new Object[list.length];
      for(int i = 0; i < list.length; i++){
          if(list[i] == list[index]){
            list[i] = " ";
          }
      }
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < size; i++){
            result += list[i] + "\n";
        }
        return result;
    }
}
