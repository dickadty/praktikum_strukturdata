package PModul4;

public class StackLinkedListApp {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        // memasukkan data pada stack dengan method push
        stack.push(1, "VCD");
        stack.push(2, "TV");

        // cetak data dari stack
        stack.display();

        // memasukkan data pada stack dengan method push
        stack.push(3, "Kulkas");
        stack.push(4, "PC");
        stack.push(5, "Rice Cooker");
        stack.push(6, "Dispenser");

        // cetak data dari stack
        stack.display();

        // remove data dari stack
        stack.pop();
        stack.pop();

        // cetak data dari stack
        stack.display();
    }
}