package ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Car");
        list.add("cat");
        list.add("phone");
        //list.add("");
        //list.clear();
        //list.size();
        //list.get(1);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);



    }



}

