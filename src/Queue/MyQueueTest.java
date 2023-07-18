package Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Alex");
        queue.add("Andrew");
        System.out.println(queue);
        queue.size();
        queue.peek();
        queue.poll();

    }
}
