package Modul4;

public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }


    public boolean isEmpty() {
        return (first == null);
    }


    public void insertFirst(int Data) {
        Link newLink = new Link(Data);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }


    public Link find(int key) {
        Link current = first;
        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

public void insertLast(int Data) {
    Link newLink = new Link(Data);  
    if (isEmpty()) {              
        first = newLink;           
    } else {
        Link current = first;      
        while (current.next != null) {  
            current = current.next;     
        }
        current.next = newLink;     
    }
}

public Link deleteLast() {
    if (isEmpty()) {            
        return null;         
    } 
    if (first.next == null) {         
        Link temp = first;            
        first = null;                
        return temp;               
    }

    Link current = first;            

    Link previous = null;
    while (current.next != null) {    
        previous = current;          
        current = current.next;  
    }
    previous.next = null;             
    return current;                
}


    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }
    public void displayList() {
        System.out.println("List(first -->last):"); Link current = first;
        while (current != null) { current.displayLink(); current = current.next;
        }
        System.out.println("");
    }
}


