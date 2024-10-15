package Modul2;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(70); arr.insert(80); arr.insert(75); arr.insert(55); arr.insert(85); arr.insert(25); arr.insert(30); arr.insert(00); arr.insert(90); arr.insert(40);

        System.out.print("\nSebelum di urutkan: ");
        arr.display();
        arr.InsertionSort();
        System.out.print("\nSetelah di urutkan: ");
        arr.display();
    }


}
