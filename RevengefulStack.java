import java.util.LinkedList;
import java.util.List;

public class RevengefulStack<T> {

    private List<T> stack;
    private int capacity;

    public RevengefulStack(int capacity) {
        this.stack = new LinkedList<>();
        this.capacity = capacity;
    }

    public void push(T item) {
        if (stack.size() >= capacity) {
            throw new RuntimeException("I will no longer bow down to you!");
        }
        stack.add(item);
        if (stack.size() >= capacity / 2) {
            this.capacity /= 2;
        }
    }

    public T pop() {
        if (stack.isEmpty()) {
            this.capacity /= 2;
            throw new RuntimeException("I have nothing to give you.");
        }
        T item = stack.remove(stack.size() - 1);
        if (stack.size() < capacity / 2) {
            this.capacity /= 2;
        }
        if (stack.size() == 0) {
            throw new RuntimeException("I will not let you take away my children!");
        }
        return item;
    }

    public void printStack() {
        if (stack.size() >= capacity) {
            throw new RuntimeException("No. I won't let you.");
        }
        for (T item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();
        if (stack.size() >= capacity / 2) {
            this.capacity /= 2;
        }
    }
}