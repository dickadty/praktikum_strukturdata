package PModul4;

public class StackLinkedList {
    Stack top;

    public StackLinkedList() {
        this.top = null;
    }

    public void push(int id, String nama) {
        Stack stack = new Stack();

        // mengisi data dari input
        stack.id = id;
        stack.nama = nama;

        // put top into temp link
        stack.link = top;

        // update top
        top = stack;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void pop() {
        top = (top).link;
    }

    public void display() {
        Stack stack = top;

        System.out.println("Stack(top --> bottom) :");
        while (stack != null) {
            System.out.print("{"+stack.id+", "+stack.nama+"}");
            System.out.println();

            stack = stack.link;
        }
        System.out.println();
    }
}