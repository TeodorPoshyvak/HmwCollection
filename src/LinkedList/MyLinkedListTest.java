package LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("one");
        linkedList.add("two");

        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("linkedList.get(0) = " + linkedList.get(0));
        linkedList.remove(1);
        linkedList.clear();
        System.out.println("linkedList.size() = " + linkedList.size());


    }
}
