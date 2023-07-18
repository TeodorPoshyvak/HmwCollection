package LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("one");
        linkedList.add("two");

        linkedList.size();
        linkedList.get(0);
        linkedList.remove(1);
        linkedList.clear();
        linkedList.size();


    }
}
