package Stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("Oleg");
        stack.push("Teodor");

        stack.peek();
        stack.pop();
        System.out.println(stack);
        System.out.println("stack.size() = " + stack.size());
        stack.clear();
        System.out.println("stack.size() = " + stack.size());

    }
}
