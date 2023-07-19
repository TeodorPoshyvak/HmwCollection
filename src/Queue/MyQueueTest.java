package Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Alex");
        queue.add("Andrew");
        System.out.println(queue);
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue.poll());

    }
}
