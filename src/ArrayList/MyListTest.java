package ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Car");
        list.add("cat");
        list.add("phone");

        System.out.println(list.get(2));
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list.size());


    }


}

