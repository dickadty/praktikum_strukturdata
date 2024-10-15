package Modul6;

public class QuickSort {
    // Fungsi utama untuk memulai quick sort
    public void sort(int[] arr) {
        recQuickSort(arr, 0, arr.length - 1);
    }

    // Fungsi rekursif untuk memanggil quick sort pada subarray kiri dan kanan
    public void recQuickSort(int[] arr, int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) { // basis rekursif: jika array berukuran 1 atau 0
            return;
        } else {
            int pivot = arr[batasKanan]; // pilih elemen terakhir sebagai pivot
            int partisi = partitionIt(arr, batasKiri, batasKanan, pivot); // lakukan partisi
            recQuickSort(arr, batasKiri, partisi - 1); // urutkan bagian kiri
            recQuickSort(arr, partisi + 1, batasKanan); // urutkan bagian kanan
        }
    }

    // Fungsi untuk melakukan partisi array
    public int partitionIt(int[] arr, int batasKiri, int batasKanan, int pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan;
        while (true) {
            while (indexKiri < batasKanan && arr[++indexKiri] < pivot); // geser kiri hingga menemukan elemen >= pivot
            while (indexKanan > batasKiri && arr[--indexKanan] > pivot); // geser kanan hingga menemukan elemen <= pivot
            if (indexKiri >= indexKanan) { // jika kedua indeks bertemu
                break;
            } else {
                swap(arr, indexKiri, indexKanan); // tukar elemen jika ditemukan ketidaksesuaian
            }
        }
        swap(arr, indexKiri, batasKanan); // pindahkan pivot ke posisi yang benar
        return indexKiri; // kembalikan posisi pivot
    }

    // Fungsi untuk menukar dua elemen dalam array
    public void swap(int[] arr, int satu, int dua) {
        int temp = arr[satu];
        arr[satu] = arr[dua];
        arr[dua] = temp;
    }

    // Fungsi untuk mencetak array
    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Fungsi main untuk menjalankan program
    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int arr[] = {12, 34, 54, 2, 3, 67, 30, 20}; // array yang digunakan
        System.out.println("Array sebelum sorting:");
        sorter.printArray(arr); // cetak array sebelum sorting
        sorter.sort(arr); // jalankan quick sort
        System.out.println("Array setelah sorting:");
        sorter.printArray(arr); // cetak array setelah sorting
    }
}
