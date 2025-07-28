package stack;

public class StackRunner {

    public static void main(String[] args) {

        Stack stack = new Stack(2);
        stack.push(7);
        stack.push(23);
        stack.push(3);
        stack.push(11);

        stack.printStack();

        stack.pop();

        System.out.println(" after pop ");

        stack.printStack();

    }
}
