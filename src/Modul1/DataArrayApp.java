package Modul1;

public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;

        arr = new DataArray(maxSize);

        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650240, "Dinda", "Bandung");

        System.out.println("sebelum di urutkan");
        arr.displayArray();
        arr.InsertionSort();
        arr.SelectionSort();
        System.out.println("setelah di urutkan by NIM");
        arr.displayArray();

        arr.SelectionSortByName();
        arr.InsertionSortByName();
        System.out.println("setelah di urutkan by Nama");
        arr.displayArray();

        arr.insert(16650210, "Dicky Aditya", "Malang");
        arr.displayArray();
    }
}
