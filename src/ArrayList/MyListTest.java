package ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Car");
        list.add("cat");
        list.add("phone");

//        for (int i = 0; i < 1000000; i++) {
//            list.add("" + i);
//            System.out.println(list.get(i));
//        }

        list.remove(1);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(2) = " + list.get(1));


    }


}

