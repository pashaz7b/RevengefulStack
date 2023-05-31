public class Main {
    public static void main(String[] args) {
        testStackWithIntegers();
        testStackWithStrings();
        testStackWithBooks();
    }

    public static void testStackWithIntegers() {
        RevengefulStack<Integer> stack = new RevengefulStack<>(30);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.printStack(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testStackWithStrings() {
        RevengefulStack<String> stack = new RevengefulStack<>(30);
        try {
            stack.push("Hello");
            stack.push("World");
            stack.push("Java");
            stack.push("Stack"); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.printStack(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.pop(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testStackWithBooks() {
        RevengefulStack<Book> stack = new RevengefulStack<>(30);
        try {
            stack.push(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
            stack.push(new Book("To Kill a Mockingbird", "Harper Lee"));
            stack.push(new Book("1984", "George Orwell"));
            stack.push(new Book("Animal Farm", "George Orwell")); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.printStack(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.pop(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}