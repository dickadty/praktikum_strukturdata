package Modul3;

class Stack {
    private int maxSize;
    private long[] stackArray;  // Menggunakan long array
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
        } else {
            stackArray[++top] = item;
        }
    }


    public long pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
