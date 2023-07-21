package Stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("Oleg");
        stack.push("Teodor");
        stack.push("Andrew");
        stack.push("Anna");

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
        stack.remove(0);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());

    }
}
