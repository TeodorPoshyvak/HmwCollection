package Stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("Oleg");
        stack.push("Teodor");

        stack.peek();
        stack.pop();

        System.out.println(stack);
//        stack.remove(11);
//        stack.size();
//        System.out.println(stack);
//        stack.clear();
//        stack.size();

    }
}
