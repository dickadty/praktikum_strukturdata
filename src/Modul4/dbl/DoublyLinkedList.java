
package Modul4.dbl;

public class DoublyLinkedList {

    private Link first;
    private Link last;

    public Link findBidirectional(int key) {
   
        while (first != null && last != null) {
            // Jika ditemukan dari arah depan
            if (first.Data == key) {
                return first;  // Kembalikan node yang ditemukan dari depan
            }
            // Jika ditemukan dari arah belakang
            if (last.Data == key) {
                return last;  // Kembalikan node yang ditemukan dari belakang
            }
    
            // Cegah pencarian bertemu di tengah dan melakukan pemeriksaan dua kali
            if (first == last|| first.next == last) {
                break;  // Hentikan jika node yang diperiksa bertemu di tengah
            }
    
            // Lanjutkan pencarian ke node berikutnya
            first = first.next;     // Gerak maju dari depan
            last = last.previous; // Gerak mundur dari belakang
        }

        return null;
    }
    

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int Data) {
        Link newLink = new Link(Data);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int Data) {
        Link newLink = new Link(Data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;

    }

    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Link deleteLast() {
        Link temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int Data) {
        Link current = first;
        while (current.Data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Link newLink = new Link(Data);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteKey(int key) {
        Link current = first;
        while (current.Data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next
                    = current.next;
        }
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous
                    = current.previous;
        }
        return current;
    }

    public void displayForward() {
        System.out.print("List ” + + “(first-- > last    ): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List ” + + “(last-- > first    ): ");
        Link current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println("");
    }
}