package Modul2;

public class HighArray {
    private int[] arr;
    private int nElemen;

    public HighArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void  insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) { // jika ingin mengubah asc dan desc dengan < untuk asc dan > untuk desc
                if (arr[i] > arr[i + 1]) { // Jika elemen di posisi i lebih besar dari elemen di posisi i+1
                    swap(i, i + 1); // Tukar elemen jika tidak berurutan
                    display(); // Tampilkan array setelah setiap pertukaran
                }
            }
        }
    }

    public void SelectionSort() { int awal, i, min;
        for (awal=0; awal< nElemen-1; awal++) { min = awal;
            for (i = awal + 1; i < nElemen; i++) { if (arr[i] < arr[min]) {
                min = i;
            }
            }
            swap(awal, min);
            display();
        }
    }

    public void InsertionSort() { int i, curIn;
        for (curIn= 1; curIn < nElemen; curIn++) { int temp = arr[curIn];
            i = curIn;
            while (i > 0 && arr[i - 1] >= temp) { arr[i] = arr[i - 1];
                display();
                i--;
            }
            arr[i] = temp;
        }
    }


        public void swap(int one, int two) {
        System.out.print(arr[one] + " <=> " +arr[two]+ " | ");
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
