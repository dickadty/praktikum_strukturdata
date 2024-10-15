package Modul4.dbl;

public class DoublyLinkedListApp {

    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();

        // Menambahkan elemen ke dalam list
        theList.insertFirst(10);
        theList.insertLast(20);
        theList.insertLast(30);
        theList.insertLast(40);
        theList.insertLast(50);

        // Menampilkan list secara forward dan backward
        theList.displayForward(); // Output: 10 20 30 40 50
        theList.displayBackward(); // Output: 50 40 30 20 10

        // Mencari elemen menggunakan pencarian bidirectional
        int searchKey = 30;
        Link found = theList.findBidirectional(searchKey);

        if (found != null) {
            System.out.println("Data " + searchKey + " ditemukan: " + found.Data);
        } else {
            System.out.println("Data " + searchKey + " tidak ditemukan");
        }

        // Contoh pencarian yang tidak ada
        searchKey = 100;
        found = theList.findBidirectional(searchKey);

        if (found != null) {
            System.out.println("Data " + searchKey + " ditemukan: " + found.Data);
        } else {
            System.out.println("Data " + searchKey + " tidak ditemukan");
        }
    }
}
